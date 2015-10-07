/**
 * 
 */
package sia.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author marcin
 *
 */
public class KnightMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
		
	}

}
