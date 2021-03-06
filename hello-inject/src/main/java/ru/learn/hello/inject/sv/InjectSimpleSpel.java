package ru.learn.hello.inject.sv;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author Благодатских С.
 */
public class InjectSimpleSpel {

	private String name;

	private int age;

	private float height;

	private boolean programmer;

	private Long ageInSeconds;

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-el.xml");
		ctx.refresh();

		InjectSimpleSpel simple = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");

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
