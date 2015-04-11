package ru.learn.hello;

/**
 *
 * @author Благодатских С.
 */
public class HelloWorldDecoupledWithFactory {

	public static void main(String[] args) {
		MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
		MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
	}

}
