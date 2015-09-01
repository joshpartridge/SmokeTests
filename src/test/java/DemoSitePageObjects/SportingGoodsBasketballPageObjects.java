package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SportingGoodsBasketballPageObjects {
	
	private static WebElement element = null;
	private static String title = null;

	/**
	 * #1
	 * driver
	 */
	public static String SportingGoodsBasketballPageTitle(WebDriver driver) {
		
		title = driver.getTitle();
		
		return title;
		
	}
	
	//What title should be
	/**
	 * #2
	 * driver
	 */
	public static String SupposedSportingGoodsBasketballPageTitle() {
		
		title = "Basketball - Sporting Goods";
		
		return title;
	}

	/**
	 * #3
	 * driver
	 */
	public static WebElement KobeXGroupProduct(WebDriver driver) {
		
		element = driver.findElement(By.cssSelector("h2.product-name > a[title=\"Kobe X and Molten Game Ball (Group Product)\"]"));
		
		return element;
	
	}
	
	/**
	 * #4
	 * driver
	 */
	public static String KobeXGroupProductLinkText(WebDriver driver) {
		
		title = driver.findElement(By.cssSelector("h2.product-name > a[title=\"Kobe X and Molten Game Ball (Group Product)\"]")).getText();
		
		return title;
	}
	

}
