package my.home.pro.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class KnightMainAOP {
	public static void main(String[] args) throws QuestException {
		ApplicationContext context = new ClassPathXmlApplicationContext("knightaop.xml");
		Knight knight = (Knight)context.getBean("knight");
		knight.embarkOnQuest();
	}
}
