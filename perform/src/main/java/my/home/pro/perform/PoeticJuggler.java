package my.home.pro.perform;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class PoeticJuggler extends Juggler{
	private Poem poem;
	
	public PoeticJuggler (Poem poem) {
		this.poem = poem;
	}

	public PoeticJuggler(Poem poem, int beanBags) {
		super(beanBags);
		this.poem = poem;
	}

	@Override
	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}

}
