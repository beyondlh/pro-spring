package my.home.pro.perform;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class Juggler implements Performer{

	private int beanBags = 3;

	public Juggler() {
	}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	
	@Override
	public void perform() throws PerformanceException {
		System.out.println("JUGGLING " + beanBags + " BEANBAGS");
	}

}