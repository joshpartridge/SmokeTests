package DemoSitePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeDecorBedBathPageObjects {
	
	private static WebElement element = null;
	private static String title = null;

	/**
	 * #1
	 * driver
	 */
	public static String HomeDecorBedBathPageTitle(WebDriver driver) {
		
		title = driver.getTitle();
		
		return title;
		
	}
	
	//What title should be
	/**
	 * #2
	 * driver
	 */
	public static String SupposedHomeDecorBedBathPageTitle() {
		
		title = "Bed & Bath - Home & Decor";
		
		return title;
	}

}
