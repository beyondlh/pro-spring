package my.home.pro.test;

import my.home.springbeginning.ch11.domain.User;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class AddUserTest {

	@Test
	public void addUserWorksOK() {
		RestTemplate template = new RestTemplate();
		User user = new User(3, "Funda Bayulu");
		ResponseEntity<Void> resultSave = template.postForEntity(
				"http://localhost:8080/test-rest-anno/rest/users", user, Void.class);
		assertNotNull(resultSave);
	}
}
