package my.home.pro.qualifires;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
@Component
public class CakeBoth {

	@Autowired
	@Qualifier("cake")
	private Desert desert;

	public void showMe() {
		System.out.println("I have " + desert.name());
	}
}
