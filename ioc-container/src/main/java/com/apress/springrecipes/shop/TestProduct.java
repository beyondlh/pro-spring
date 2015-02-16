package com.apress.springrecipes.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class TestProduct {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("beans.xml");
		Battery b = ctx.getBean("aaa", Battery.class);
		Disc d = ctx.getBean("cdrw", Disc.class);
		System.out.println(b);
		System.out.println(d);
	}
}
