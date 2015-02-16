package my.home.pro.perform;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class Stage {

	private Stage() {

	}

	private static class StageSingletonHolder {

		static Stage instance = new Stage();
	}

	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
}
