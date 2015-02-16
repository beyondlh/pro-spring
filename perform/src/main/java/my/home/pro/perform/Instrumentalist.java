package my.home.pro.perform;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class Instrumentalist implements Performer {

	private String song;
	private Instrument instrument;

	public Instrumentalist() {
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.println("Playing " + song + " : ");
		instrument.play();
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}


	public void setSong(String song) {
		this.song = song;
	}

	public String getSong() {
		return song;
	}

	private String screamSong() {
		return song;
	}
}
