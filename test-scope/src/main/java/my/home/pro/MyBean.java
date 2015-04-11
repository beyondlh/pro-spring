package my.home.pro;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Благодатских С.
 */
@Component
//@Scope("prototype")
@Lazy(true)
public class MyBean {

	private String property;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	@PostConstruct
	public void init() throws Exception {
		System.out.println("init method is called");
	}

	@PreDestroy
	public void destroy() throws RuntimeException {
		System.out.println("destroy method is called");
	}

}
