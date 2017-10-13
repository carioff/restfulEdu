package kr.re.kitri.park.service;

import java.sql.SQLException;

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
}
