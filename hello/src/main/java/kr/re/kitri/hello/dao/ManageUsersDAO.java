package kr.re.kitri.hello.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitri.hello.model.User;

@Repository
public class ManageUsersDAO {

	// table의 CRUD 작업
	
	// 글번호로 글조회
	public User selectUsersByUserId() {
		return new User(200, "문재인", "content@naver.com", "010-1111-2222");

	}
}
