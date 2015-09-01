package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsletterPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 */
	
	public static WebElement NewsletterEmailField(WebDriver driver) {
		element = driver.findElement(By.id("newsletter"));
		return element;
		
	}

	/**
	 * #2
	 * driver
	 */
	
	public static WebElement NewsletterSubscribeButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//form[@id='newsletter-validate-detail']/div/div[3]/button"));
		return element;
		
	}
	
	/**
	 * #3
	 * driver
	 */
	
	public static WebElement SuccessMessage(WebDriver driver) {
		element = driver.findElement(By.cssSelector("li > span"));
		return element;
		
	}

	

}
