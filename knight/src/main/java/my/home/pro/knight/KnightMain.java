package my.home.pro.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class KnightMain {
	public static void main(String[] args) throws QuestException {
		ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
		Knight knight = (Knight)context.getBean("knight");
		knight.embarkOnQuest();
	}
}
