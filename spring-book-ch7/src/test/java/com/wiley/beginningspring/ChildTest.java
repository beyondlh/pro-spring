package com.wiley.beginningspring;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

@ContextConfiguration("classpath:/subContext.xml")
public class ChildTest extends BaseTest{

	@Autowired
	private Bar bar;

	@Test
	public void dependenciesShouldBeAvailable() {
		Assert.notNull(foo);
		Assert.notNull(bar);
	}
}
