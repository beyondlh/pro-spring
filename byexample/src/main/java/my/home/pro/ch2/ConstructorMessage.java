package my.home.pro.ch2;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class ConstructorMessage implements Message {

	private String message = null;

	/**
	 * Constructor
	 */
	public ConstructorMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets message.
	 */
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
