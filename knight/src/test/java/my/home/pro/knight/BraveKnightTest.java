package my.home.pro.knight;
import static org.mockito.Mockito.*;
import org.junit.Test;
/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnQuest() throws QuestException {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
}
