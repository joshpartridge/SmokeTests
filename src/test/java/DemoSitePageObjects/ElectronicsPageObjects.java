package DemoSitePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElectronicsPageObjects {

	private static WebElement element = null;
	private static String title = null;

	/**
	 * #1
	 * driver
	 */
	public static String ElectronicsPageTitle(WebDriver driver) {
		
		title = driver.getTitle();
		
		return title;
		
	}
	
	//What title should be
	/**
	 * #2
	 * driver
	 */
	public static String SupposedElectronicsPageTitle() {
		
		title = "Electronics";
		
		return title;
	}

}