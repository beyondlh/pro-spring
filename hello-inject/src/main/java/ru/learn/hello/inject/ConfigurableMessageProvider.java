package ru.learn.hello.inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author Благодатских С.
 */
@Service("customMessageProvider")
public class ConfigurableMessageProvider implements MessageProvider {

	private String message;

	@Override
	public String getMessage() {
		return message;
	}

	@Autowired
	public ConfigurableMessageProvider(@Value("Configurable message") String message) {
		this.message = message;
	}

}
