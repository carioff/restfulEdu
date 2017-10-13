package kr.re.kitri.park.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.re.kitri.park.model.Park;
import kr.re.kitri.park.service.ParkService;
import kr.re.kitri.park.util.ApiResponse;
import kr.re.kitri.park.util.ApiResponse.Status;
import kr.re.kitri.park.util.ListApiResponse;

@RestController // Rest방식으로 객체 반환이 가능
@RequestMapping("api/")
public class HomeController {

	@Autowired(required = true)
	private ParkService parkService;

	@GetMapping("test") // http://lacalhost:8090/articles
	public void test() throws SQLException {
		// parkDAO.insertPark();
		throw new IllegalArgumentException("This is Error.");
	}

	/**
	 * 구장정보 입력
	 * 
	 * @param park
	 */
	@PostMapping("parks") // @RequestBody
	public void registPark(Park park) { // 컨트롤러에서는 try catch로 처리를 꼭 해줘야한다. throw 해버리면 예외처리를 해주는 곳이 없음
		try {
			parkService.registPark(park);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 구장조회 by key
	 * 
	 * @param park
	 * @return
	 */
	@GetMapping("parks/{parkId}") // @RequestBody
	// public Park searchPark(@PathVariable String parkId) {
	public ApiResponse searchPark(@PathVariable String parkId) {
		Park park = parkService.searchParkByParkKey(parkId);

		ApiResponse res;
		if (park != null) {
			res = new ApiResponse(Status.OK, park, null);
		} else {
			res = new ApiResponse(Status.ERROR, null, new ApiResponse.ApiError(404, "not found"));
		}

		return res;

	}

	/**
	 * 전체구장 조회(페이징 포함)
	 * @param page
	 * @return
	 */
	@GetMapping("parks")
	public ListApiResponse searchParks(@RequestParam(value="page", defaultValue = "1") String page) {

		int pageNum = Integer.parseInt(page);
		String nextPage = "http://localhost:8080/api/parks?page="+(pageNum+1);
		
		Map<String, Object> dataMap = parkService.searchParks(pageNum);
		
		List<Object> list = (List<Object>) dataMap.get("data");
		long count = Long.parseLong((String)dataMap.get("count"));
		
		
//		ListApiResponse listRes;			
//		if(list.size() < 1) {
//			listRes = new ListApiResponse(Status.ERROR, null, new ApiResponse.ApiError(404, "not found"), 0, null, 0);
//		} else {
//			listRes = new ListApiResponse(Status.OK, list, null, pageNum, nextPage, -1);
//		}
		
		return new ListApiResponse(Status.OK, list, null, pageNum, nextPage, count);
//		return null;
	}
}
