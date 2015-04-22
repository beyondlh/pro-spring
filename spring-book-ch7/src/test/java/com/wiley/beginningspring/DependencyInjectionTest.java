package com.wiley.beginningspring;

import javax.annotation.Resource;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Ch7ConfigurationForDependencyInjection.class)
public class DependencyInjectionTest {

	@Autowired
	@Qualifier("foo1")
	private Foo foo1;

	@Resource
	private Foo foo2;

	@Resource
	private Bar bar;

	@Test
	public void testInjections() {
		Assert.assertNotNull(foo1);
		Assert.assertNotNull(foo2);
		Assert.assertNotNull(bar);
	}

}
