package my.home.pro.test;

import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ListUsersTest {

	@Test
	public void listUsersWorksOK() {
		RestTemplate template = new RestTemplate();
		ResponseEntity<List> result
				= template.getForEntity("http://localhost:8080/test-rest-anno/rest/users", List.class);
		assertNotNull(result);
		assertNotNull(result.getBody());
		System.out.println(result.getBody());
//		assertThat(result.getBody().size(), is(2));
	}

}
