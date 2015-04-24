package my.home.pro.qualifires;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
@Component
public class Main {

	private final static ApplicationContext ctx;

	static {
		ctx = new AnnotationConfigApplicationContext(MyConfig.class);
	}

	@Autowired
	@Qualifier("cold")
	private Desert ice;

	@Autowired
	@Qualifier("cake")
	private Desert cake;

	@Autowired
	private CakeBoth both;

	public static void main(String[] args) {
		ctx.getBean(Main.class).start();
	}

	private void start() {
		System.out.println("I'have " + ice.name() + " and " + cake.name());	
		both.showMe();
	}
}
