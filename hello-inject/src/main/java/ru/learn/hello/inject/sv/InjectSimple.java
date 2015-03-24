package ru.learn.hello.inject.sv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimple {

	@Value("Serge Basa")
	private String name;
	@Value("38")
	private int age;
	@Value("1.74")
	private float height;
	@Value("true")
	private boolean programmer;
	@Value("1341341414141")
	private Long ageInSeconds;

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-sv-scan.xml");
		ctx.refresh();

		InjectSimple simple = (InjectSimple) ctx.getBean("injectSimple");

		System.out.println(simple);
	}

	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}

	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name :" + name + "\n"
				+ "Age:" + age + "\n"
				+ "Age in Seconds: " + ageInSeconds + "\n"
				+ "Height: " + height + "\n"
				+ "Is Programmer?: " + programmer;
	}

}
