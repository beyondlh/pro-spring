package my.home.pro.ch2;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class DefaultMessage implements Message {

	private String message = "Spring is fun.";

	/**
	 * Gets message.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets message.
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
