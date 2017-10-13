package kr.re.kitri.park.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.re.kitri.park.model.Park;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkDAOTest {

	@Autowired(required=true)
	private ParkDAO parkDAO;
	
	@Test
	@Ignore
	public void testInsertPark() throws SQLException {
//		assertNotNull(parkDAO);
		Park park = new Park("ALB02", "Riverside Park2", "", "Albany", "NY", "US");
		parkDAO.insertPark(park);
	}
	
	@Test
	@Ignore
	public void searchParkByParkKey() {
		Park park = parkDAO.selectParkByParkKey("11");
		assertNotNull(park);
		assertTrue(park.getParkId().equals("11"));
		assertEquals("11", park.getParkId());
	}
	
	@Test
	public void testSelectParks() {
		List<Park> list = parkDAO.selectParks();
		assertTrue(list.size() == 10);
		System.out.println(list.size());
		System.out.println(list.get(0).getParkId());
		System.out.println(list.get(0).getCity());
		System.out.println(list.get(1).getParkId());
		System.out.println(list.get(1).getCity());
//		assertTrue(list.get(0).getParkId() != null);
	}
}
