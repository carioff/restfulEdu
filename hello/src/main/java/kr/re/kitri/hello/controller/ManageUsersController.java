package kr.re.kitri.hello.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.re.kitri.hello.model.User;
import kr.re.kitri.hello.service.ManageUsersService;
import kr.re.kitri.hello.util.ApiResponse;
import kr.re.kitri.hello.util.ApiResponse.Status;
import kr.re.kitri.hello.util.ListApiResponse;

@RestController// Rest방식으로 객체 반환이 가능 
//@Controller
public class ManageUsersController {

	@Autowired
	private ManageUsersService manageUsersService;

//	@RequestMapping("/articles")
//	@ResponseBody
	@GetMapping("/users/200") // owe to Jackson
	public User viewUsers() {
//		return new Article(150, "title", "content", "author");
		//서비스를 호출 
		return manageUsersService.viewUsersByUserId();
	}
	
	@GetMapping("/users") // http://lacalhost:8090/articles
//	public List<User> viewAllUsers() {
	public ListApiResponse viewAllUsers() {
		List<Object> userList = new ArrayList<>();
		userList.add(new User(251, "개", "3@2.com", "010-1112-1113"));
		userList.add(new User(252, "말", "2@2.com", "010-1312-1113"));
		userList.add(new User(253, "너", "4@2.com", "010-2123-1113"));
		System.out.println("userList.size(): " + userList.size());
//		return userList;
		ListApiResponse listRes;
		if(userList.size() < 1) {
			listRes = new ListApiResponse(Status.ERROR, null, new ApiResponse.ApiError(404, "not found"), 0, null, 0);
		} else {
			listRes = new ListApiResponse(Status.OK, userList, null, 1, "", userList.size());
		}

		return listRes;
	}

	
	@PostMapping("/users") // owe to Jackson
	public ApiResponse registerUser() {
		User user =  new User(250, "순실", "1@1com", "010-1111-1111");
		
		ApiResponse res = new ApiResponse(Status.ERROR, null, new ApiResponse.ApiError(404, "not found"));
		
		return res;

	}
	
	@PutMapping("/users") // owe to Jackson
	public User updateUser() {
		return new User(250, "개순실", "1@1com", "010-1111-1111");

	}
	
}
