package my.home.pro.knight;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class BraveKnight implements Knight {

	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
// Внедрение сценария подвига

	@Override
	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}
}
