package kr.re.kitri.park.dao;

import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.re.kitri.park.model.Park;

@Repository
public class ParkDAO {

//	@Autowired
//	public DataSource dataSource;
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	/**
	 * 기본적으로 Mybatis 초기 세팅시 커넥션 테스트만 제대로 이뤄지면 특별한 설정 오류는 추후에 없다.
	 */
	public void test() {
		sqlSessionTemplate.getConnection();
	}
	
	/**
	 * 전체 불러오기
	 * @return
	 */
	public List<Park> selectParks() {
		return sqlSessionTemplate.selectList("parkDAO.selectParks");
	}
	
	public void insertPark(Park park) throws SQLException {
//		Connection conn = dataSource.getConnection();
//		conn.close();
//		System.out.println("conn ok");
		
		sqlSessionTemplate.insert("parkDAO.insertPark", park);
	}

	public Park selectParkByParkKey(String parkId) {
		return sqlSessionTemplate.selectOne("parkDAO.selectParkByParkKey", parkId);
	}

	public List<Park> selectParks(int pageNum) {
		pageNum = (pageNum - 1) * 10;
		return sqlSessionTemplate.selectList("parkDAO.selectParks", pageNum);
	}

	public String selectCount() {
//		try {
			return sqlSessionTemplate.selectOne("parkDAO.selectCount");
//		} catch (Exception e){
//			throw new ClientException(150, "커넥션 불가.");
//		}
		
	}
}
