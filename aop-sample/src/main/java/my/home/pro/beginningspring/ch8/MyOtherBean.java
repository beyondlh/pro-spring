package my.home.pro.beginningspring.ch8;

import org.springframework.stereotype.Service;

@Service
public class MyOtherBean {

	public void sayHello() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Privet Chuvally?");
	}
}
