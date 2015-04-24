package my.home.pro.qualifires;

import org.springframework.stereotype.Component;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
@Component
public class Cake implements Desert{

	@Override
	public String name() {
		return "CAKE";
	}

}
