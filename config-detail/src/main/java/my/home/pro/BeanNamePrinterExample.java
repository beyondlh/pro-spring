package my.home.pro;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class BeanNamePrinterExample {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context-xml.xml");
		ctx.refresh();

		BeanNamePrinter bean = (BeanNamePrinter) ctx.getBean("beanNamePrinter");
		bean.someOperation();
	}

}
