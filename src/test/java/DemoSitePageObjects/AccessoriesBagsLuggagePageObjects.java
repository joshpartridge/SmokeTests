package DemoSitePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccessoriesBagsLuggagePageObjects {
	
	private static WebElement element = null;
	private static String title = null;

	/**
	 * #1
	 * driver
	 */
	public static String AccessoriesBagsLuggagePageTitle(WebDriver driver) {
		
		title = driver.getTitle();
		
		return title;
		
	}
	
	//What title should be
	/**
	 * #2
	 * driver
	 */
	public static String SupposedAccessoriesBagsLuggagePageTitle() {
		
		title = "Bags & Luggage - Accessories";
		
		return title;
	}

}

