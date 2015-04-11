package soundsystem;

import junit.framework.Assert;
import my.home.pro.soundsystem.CDPlayer;
import my.home.pro.soundsystem.CDPlayerConfig;
import my.home.pro.soundsystem.CompactDisc;
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
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {

	@Autowired
	private CompactDisc cd;

	@Autowired
	private CDPlayer player;

	@Test
	public void cdShouldNotBeNull(){
		Assert.assertNotNull(cd);
		cd.play();
		player.play();
	}
}
