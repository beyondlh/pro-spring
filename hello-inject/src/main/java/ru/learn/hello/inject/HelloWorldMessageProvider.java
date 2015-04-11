package ru.learn.hello.inject;

import org.springframework.stereotype.Service;

/**
 *
 * @author Благодатских С.
 */
@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello from Injecting World!";
	}

}
