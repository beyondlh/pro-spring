/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apress.springrecipes.test;

import com.apress.springrecipes.sequence.SequenceGenerator;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class SequenceTest {
	
	private final ApplicationContext context;
	private SequenceGenerator generator;

	public SequenceTest() {
		context = new GenericXmlApplicationContext("beans.xml");
	}
	
	@Before
	public void setUp() {
		generator = (SequenceGenerator) context.getBean("sequenceGenerator");
	}

	@Test
	public void simple() {
		String value = generator.getSequence();
		Assert.assertTrue("Should be '3010A'", value.equals("3010A"));
		value = generator.getSequence();
		Assert.assertTrue("Should be '3011A'", value.equals("3011A"));
		value = generator.getSequence();
		Assert.assertTrue("Should be '3012A'", value.equals("3012A"));
	}

	@Test
	public void simple2() {
		String value = generator.getSequence();
		Assert.assertTrue("Should be '3010A'", value.equals("3010A"));
		value = generator.getSequence();
		Assert.assertTrue("Should be '3011A'", value.equals("3011A"));
		value = generator.getSequence();
		Assert.assertTrue("Should be '3012A'", value.equals("3012A"));
	}

}
