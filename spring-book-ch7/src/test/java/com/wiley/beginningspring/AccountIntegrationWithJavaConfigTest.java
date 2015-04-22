package com.wiley.beginningspring;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Благодатских С.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Ch7Configuration.class})
public class AccountIntegrationWithJavaConfigTest {

	@Autowired
	private AccountService accountService;

	@Test
	public void accountServiceShouldBeInjected() {
		Assert.assertNotNull(accountService);
	}
}
