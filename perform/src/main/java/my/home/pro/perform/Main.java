package my.home.pro.perform;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class Main {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext context = new ClassPathXmlApplicationContext("perform.xml");
		Performer performer1 = (Performer) context.getBean("duke1");
		Performer performer2 = (Performer) context.getBean("duke2");
		performer1.perform();
		performer2.perform();
		System.out.println("==========================");
		performer1 = (Performer) context.getBean("poet-duke");
		performer1.perform();
		performer2 = (Performer) context.getBean("poet-duke");
		System.out.println("performer1 == performer2 is " + (performer1 == performer2));
		System.out.println("==========================");
		performer1 = (Performer) context.getBean("kenny");
		performer1.perform();
		System.out.println("==========================");
		performer1 = (Performer) context.getBean("kenny-gay");
		performer1.perform();
		System.out.println("=========================");
		performer1 = (Performer) context.getBean("hank");
		performer1.perform();
		System.out.println("=========================");
		for (City city : (List<City>) context.getBean("cities")) {
			System.out.println(city);
		}
		System.out.println("My home is " + (String) context.getBean("homePath"));
		System.out.println("=========================");
		/*
		 System.out.println("And now BIG CITIES!!!!!!");
		 for (City city : (List<City>)context.getBean("bigCities")) {
		 System.out.println(city);
		 }
		 */

	}
}
