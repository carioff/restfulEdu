package kr.re.kitri.park.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.re.kitri.park.dao.ParkDAO;
import kr.re.kitri.park.model.Park;

@Service
public class ParkService {

	@Autowired
	private ParkDAO parkDAO;
	
	public void registPark(Park park) throws SQLException {
		parkDAO.insertPark(park);
	}

	public Park searchParkByParkKey(String parkId) {

		return parkDAO.selectParkByParkKey(parkId);

	}
	
	public Map<String, Object> searchParks(int pageNum) {
		List<Park> list = parkDAO.selectParks(pageNum);
		String count = parkDAO.selectCount();
		
		Map<String, Object> listMap = new HashMap<>();
		listMap.put("data", list);
		listMap.put("count", count);
		
		return listMap;
	}
}
