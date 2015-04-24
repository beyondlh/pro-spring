package my.home.pro.beginningspring.ch8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configurable
public class Main {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("/context.xml", Main.class);
		Main m  = new Main();
		context.getBean(MyBean.class).sayHello();
		context.getBean(MyOtherBean.class).sayHello();
//		m.test();
	}

	@Autowired
	MyBean myBean;

	@Autowired
	MyOtherBean myOtherBean;

	private void test() throws InterruptedException {
		myBean.sayHello();
		myOtherBean.sayHello();
	}

}
