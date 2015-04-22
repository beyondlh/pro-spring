package com.wiley.beginningspring;

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
@ContextConfiguration("classpath:/baseContext.xml")
public class BaseTest {

	@Autowired
	protected Foo foo;

	@Test
	public void fake(){

	}
		
}
