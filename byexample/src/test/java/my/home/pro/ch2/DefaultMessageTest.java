package my.home.pro.ch2;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class DefaultMessageTest {
	@Autowired
	private DefaultMessage message;

	@Test
	public void testMessage() {
		assertNotNull("Constructor message instance is null.", message);
		String msg = message.getMessage();
		assertNotNull("Message is null", msg);
		String expectedMessage = "Spring is fun.";
		assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);
		System.out.println("message={" + msg + "}");
	}

}
