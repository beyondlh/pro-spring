package my.home.pro.beginningspring.ch8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

	@Autowired
	private MyOtherBean other;

	public void sayHello() throws InterruptedException {
		for (int i = 0; i < 1000000; ++i) {
			if (i % 13571 == 0) {
				System.out.println("Hello..!");
			}
		}
		System.out.println("Other is null = " + (other == null));
	}

}
