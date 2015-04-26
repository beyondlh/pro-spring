package my.home.pro.test;

import my.home.springbeginning.ch11.domain.User;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class UpdateUserTest {

	@Test
	public void updateUserWorksOK() {
		RestTemplate template = new RestTemplate();
		User user = new User(3, "Funda Caliskan");
		template.put("http://localhost:8080/test-rest-anno/rest/users/3", user);
	}

}
