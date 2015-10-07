/**
 * 
 */
package sia.knights;

import static org.mockito.Mockito.*;
import org.junit.Test;

import sia.knights.BraveKnight;
import sia.knights.Quest;

/**
 * @author marcin
 *
 */

public class BraveKnightTest {
	
	
	@Test
	public void knightShouldEmbarkOnQuest(){
		
		Quest mockQuest = mock(Quest.class); // create mock quest
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}

}
