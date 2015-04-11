package ru.learn.hello;

/**
 *
 * @author Благодатских С.
 */
public class HelloWorldDecoupled {

	public static void main(String[] args) {
		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider mp = new HelloMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
	}

}
