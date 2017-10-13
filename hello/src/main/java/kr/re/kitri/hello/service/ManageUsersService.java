package kr.re.kitri.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.re.kitri.hello.dao.ManageUsersDAO;
import kr.re.kitri.hello.dao.ParkRestClientDAO;
import kr.re.kitri.hello.model.User;
import kr.re.kitri.hello.util.ApiResponse;

@Service
public class ManageUsersService {

	@Autowired// Dependency Injection
	private ManageUsersDAO manageUsersDAO;
	
	@Autowired
	private ParkRestClientDAO parkDAO;
	
	public ApiResponse searchParkByKey(String key) { 
		return parkDAO.getPark(key);
	}
	// 글쓰기
	
	// 글조회 by 글번호
	public User viewUsersByUserId() {
//		return new Article(150, "title", "content", "이승엽");
		return manageUsersDAO.selectUsersByUserId();
	}
	
	// 글 전체보기
	
	// 글수정
}
