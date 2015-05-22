package my.home.pro;

import org.springframework.beans.factory.BeanNameAware;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class BeanNamePrinter implements BeanNameAware {

	private String beanName;

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public void someOperation() {
		System.out.println("Bean [" + beanName + "] - someOperation()");
	}
}
