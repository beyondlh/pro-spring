package ru.learn.hello.inject;

/**
 *
 * @author Благодатских С.
 */
public interface MessageRenderer {

	void render();

	void setMessageProvider(MessageProvider provider);

	MessageProvider getMessageProvider();

}
