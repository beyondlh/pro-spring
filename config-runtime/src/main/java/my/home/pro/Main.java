package my.home.pro;

import java.util.Collections;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

/**
 *
 * @author Благодатских С.
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(Configur.class);

		ConfigurableEnvironment env = ctx.getEnvironment();
		env.setActiveProfiles("prod");
		MutablePropertySources propertySources = env.getPropertySources();
		propertySources.addLast(new MapPropertySource("mapSource",
				Collections.singletonMap("name", (Object) "My Production Profile")));

		ctx.refresh();
		Foo foo = ctx.getBean(Foo.class);
		System.out.println(foo.getName());
	}
}
