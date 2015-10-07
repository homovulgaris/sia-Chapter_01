/**
 * 
 */
package sia.knights;

import java.io.PrintStream;

/**
 * @author marcin
 *
 */
public class SlayDragonQuest implements Quest {

	
	
	/**
	 * @param stream
	 */
	public SlayDragonQuest(PrintStream stream) {
		
		this.stream = stream;
	}

	private PrintStream stream;
	
	/* (non-Javadoc)
	 * @see main.java.sia.knights.Quest#embark()
	 */
	public void embark() {
		stream.println("Embarking on quest to slay a dragon!");
		
	}
	
	
	
	

}
