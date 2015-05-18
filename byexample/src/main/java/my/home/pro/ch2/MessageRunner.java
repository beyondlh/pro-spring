package my.home.pro.ch2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class MessageRunner {

	final static Logger logger = LoggerFactory.getLogger(MessageRunner.class);

	public static void main(String[] args) {
		test("/my/home/pro/ch2/ConstructorMessageTest-context.xml");
		test("/my/home/pro/ch2/DefaultMessageTest-context.xml");
		test("/my/home/pro/ch2/ReferenceSetterMessageTest-context.xml");
		test("/my/home/pro/ch2/SetterMessageTest-context.xml");
	}

	private static void test(String xml) {
		logger.info("Initializing Spring context for " + xml);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		logger.info("Spring context initialized.");
		Message message = applicationContext.getBean("message", Message.class);
		logger.debug("(" + xml + ") message='" + message.getMessage() + "'");
		logger.info("======================");
	}
}
