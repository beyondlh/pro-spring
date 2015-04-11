package my.home.pro.perform;

import java.util.Map;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class OneManBand implements Performer {

	private Map<String, Instrument> instruments;

	@Override
	public void perform() throws PerformanceException {
		for (String key : instruments.keySet()) {
			System.out.print(key + ": ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}
}
