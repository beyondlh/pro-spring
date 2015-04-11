package my.home.pro.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
@Component
public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;

	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		System.out.println("==========================");
		cd.play();
		System.out.println("==========================");
	}

}
