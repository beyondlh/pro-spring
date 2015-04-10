package my.home.pro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Благодатских С.
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		testBean(ctx, "Bean number 1");
		testBean(ctx, "Bean number 2");
		testBean(ctx, "Bean number 3");
	}
	private static void testBean(ApplicationContext ctx, String name) {
		System.out.println("Before get Bean:");
		MyBean bean = ctx.getBean(MyBean.class);
		bean.setProperty(name);
		System.out.println("Porperty = " + bean.getProperty());
		System.out.println("Exit from method");
	}
}
