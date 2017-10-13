package kr.re.kitri.hello.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;
import kr.re.kitri.hello.util.ApiResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkRestClientDAOTest {

	@Autowired
	private ParkRestClientDAO parkDAO;
	
	@Test
	public void testGetPark() {
		ApiResponse res =  parkDAO.getPark("ANA01");
		
		Assert.assertNotNull(res);
	}
}
