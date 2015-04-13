package my.home.pro.soundsystem;

import java.text.MessageFormat;
import org.springframework.stereotype.Component;

@Component("myBean")
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	@Override
	public void play() {
		System.out.println(MessageFormat.format("Playing {0} by {1}", title, artist));
	}
}
