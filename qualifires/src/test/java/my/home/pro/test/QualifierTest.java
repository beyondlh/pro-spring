package my.home.pro.test;

import my.home.pro.qualifires.CakeBoth;
import my.home.pro.qualifires.IceCreamBoth;
import my.home.pro.qualifires.MyConfig;
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
@ContextConfiguration(classes = MyConfig.class)
public class QualifierTest {

	@Autowired
	private IceCreamBoth ib;
	@Autowired
	private CakeBoth cb;

	@Test
	public void test() {
		ib.showMe();
		cb.showMe();
	}
}
