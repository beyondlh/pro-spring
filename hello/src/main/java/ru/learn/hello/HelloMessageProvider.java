package ru.learn.hello;

/**
 *
 * @author Благодатских С.
 */
public class HelloMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World!";
	}

}
