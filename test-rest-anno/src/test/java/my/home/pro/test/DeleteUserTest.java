package my.home.pro.test;

import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class DeleteUserTest {

	@Test
	public void deleteUserWorksOK() {
		RestTemplate template = new RestTemplate();
		template.delete("http://localhost:8080/test-rest-anno/rest/users/3");
		ResponseEntity<List> resultList
				= template.getForEntity("http://localhost:8080/test-rest-anno/rest/users", List.class);
		assertNotNull(resultList);
		assertNotNull(resultList.getBody());
		assertThat(resultList.getBody().size(), is(2));
	}

}
