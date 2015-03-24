package ru.learn.hello.inject;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author Благодатских С.
 */
public class DeclareSpringComponents {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-xml.xml");
		ctx.refresh();

//		MessageProvider messageProvider = ctx.getBean("messageProvider",
//				MessageProvider.class);

		MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);
//		messageRenderer.setMessageProvider(messageProvider);
		messageRenderer.render();

	}
}
