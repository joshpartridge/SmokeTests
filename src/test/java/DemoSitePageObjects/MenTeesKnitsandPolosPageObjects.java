package DemoSitePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenTeesKnitsandPolosPageObjects {
	
	private static WebElement element = null;
	private static String title = null;

	/**
	 * #1
	 * driver
	 */
	public static String MenTeesKnitsandPolosPageTitle(WebDriver driver) {
		
		title = driver.getTitle();
		
		return title;
		
	}
	
	//What title should be
	/**
	 * #2
	 * driver
	 */
	public static String SupposedMenTeesKnitsandPolosPageTitle() {
		
		title = "Tees, Knits and Polos - Men";
		
		return title;
	}

}
