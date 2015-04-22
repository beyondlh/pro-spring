package com.wiley.beginningspring.ch7;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author Благодатских С.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:/applicationContext.xml")
public class ScopedBeanTest {

	@Autowired
	private UserService userService;

	@Autowired
	private MockHttpServletRequest request;

	@Autowired
	private MockHttpSession session;

	@Test
	public void testScopedBeans() {
		request.setParameter("username", "jdoe");
		request.setParameter("password", "secret");
		session.setAttribute("theme", "blue");
		Assert.assertEquals("jdoe", userService.getLoginAction().getUsername());
		Assert.assertEquals("secret", userService.getLoginAction().getPassword());
		Assert.assertEquals("blue", session.getAttribute("theme"));
		Assert.assertEquals(userService.getUserPreferences().getTheme(), session.getAttribute("theme"));
	}
}
