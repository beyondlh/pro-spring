package my.home.pro.qualifires;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
@Component
@Qualifier("cold")
public class IceCream implements Desert{

	@Override
	public String name() {
		return "ICE_CREAM";
	}

}
