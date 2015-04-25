package my.home.springbeginning.ch11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"my.home.springbeginning.ch11"})
@EnableWebMvc
public class ApplicationConfig {

	@Bean
	public Logger getLogger() {
		return LoggerFactory.getLogger(getClass());
	}
}
