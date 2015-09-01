package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageNotFoundPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 */
	
	public static WebElement Header(WebDriver driver) {
		element = driver.findElement(By.cssSelector("h1"));
		return element;
		
	}
	
	/**
	 * #2
	 * driver
	 */
	
	public static WebElement Message(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[3]/div/div/div[3]/p[2]"));
		return element;
		
	}
	
	/**
	 * #3
	 * driver
	 */
	
	public static WebElement HomepageLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'homepage.')]"));
		return element;
		
	}
	

}
