package ru.learn.hello.inject;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author Благодатских С.
 */
@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider;

	@Override
	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException(
					"You must set the property messageProvider of class:"
					+ StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());

	}

	@Resource(name = "customMessageProvider")
	@Override
	public void setMessageProvider(MessageProvider provider) {
		messageProvider = provider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		return messageProvider;
	}

}
