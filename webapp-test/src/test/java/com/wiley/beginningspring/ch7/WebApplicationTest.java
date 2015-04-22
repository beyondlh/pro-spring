package com.wiley.beginningspring.ch7;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
@WebAppConfiguration
public class WebApplicationTest {

	@Autowired
	private WebApplicationContext applicationContext;

	@Autowired
	private MockServletContext servletContext;

	@Test
	public void testWebApp() {
		Assert.assertNotNull(applicationContext);
		Assert.assertNotNull(servletContext);
	}

}
