package my.home.pro;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class DestructiveBeanWithInterface implements InitializingBean, DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After properties set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroing bean");
	}

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new 	GenericXmlApplicationContext("classpath:META-INF/spring/app-context-xml.xml");
		DestructiveBeanWithInterface d = ctx.getBean("dWithInterface", DestructiveBeanWithInterface.class);
		ctx.destroy();
	}
}
