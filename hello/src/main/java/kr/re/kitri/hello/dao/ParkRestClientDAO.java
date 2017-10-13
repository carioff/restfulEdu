package kr.re.kitri.hello.dao;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import kr.re.kitri.hello.util.ApiResponse;

@Repository
public class ParkRestClientDAO {

	/**
	 * 다른 서비스로 부터 Data를 받아오는 것
	 * 
	 * @param parkKey
	 * @return
	 */
	public ApiResponse getPark(String parkKey) {
		RestTemplate restTemplate = new RestTemplate();
		ApiResponse res = 
				restTemplate.getForObject("http://localhost:8080/api/parks/" + parkKey, ApiResponse.class);

		return res;

	}

	public JsonNode getParkbyEntity(String parkKey) throws JsonProcessingException, IOException {
		RestTemplate restTemplate = new RestTemplate();
		String resourceUrl = "http://localhost:8080/users";
		ResponseEntity<String> response = 
				restTemplate.getForEntity("http://localhost:8080/api/parks/" + parkKey, String.class);
//		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));

		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(response.getBody());
		JsonNode name = root.path("name");
//		assertThat(name.asText(), notNullValue());
		return root;
	}
}
