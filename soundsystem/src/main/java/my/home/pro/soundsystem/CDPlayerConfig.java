package my.home.pro.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
@Configuration
public class CDPlayerConfig {

	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}

	@Bean
	public CDPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}

}
