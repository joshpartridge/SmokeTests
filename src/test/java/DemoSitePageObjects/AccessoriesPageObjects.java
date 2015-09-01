package DemoSitePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccessoriesPageObjects {

	private static WebElement element = null;
	private static String title = null;

	/**
	 * #1
	 * driver
	 */
	public static String AccessoriesPageTitle(WebDriver driver) {
		
		title = driver.getTitle();
		
		return title;
		
	}
	
	//What title should be
	/**
	 * #2
	 * driver
	 */
	public static String SupposedAccessoriesPageTitle() {
		
		title = "Accessories";
		
		return title;
	}

}

