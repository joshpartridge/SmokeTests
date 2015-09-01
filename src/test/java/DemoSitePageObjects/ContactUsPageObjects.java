package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 */
	
	public static WebElement ContactUsHeader(WebDriver driver) {
		element = driver.findElement(By.cssSelector("h1"));
		return element;
	}
	
	/**
	 * #2
	 * driver
	 */
	
	public static WebElement NameField(WebDriver driver) {
		element = driver.findElement(By.id("name"));
		return element;
	}
	
	/**
	 * #3
	 * driver
	 */
	
	public static WebElement EmailField(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		return element;
	}
	
	/**
	 * #4
	 * driver
	 */
	
	public static WebElement TelephoneField(WebDriver driver) {
		element = driver.findElement(By.id("telephone"));
		return element;
	}
	
	/**
	 * #5
	 * driver
	 */
	
	public static WebElement CommentField(WebDriver driver) {
		element = driver.findElement(By.id("comment"));
		return element;
	}
	
	/**
	 * #6
	 * driver
	 */
	
	public static WebElement SubmitButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.buttons-set > button.button"));
		return element;
	}
	
	/**
	 * #7
	 * driver
	 */
	
	public static WebElement SuccessMessage(WebDriver driver) {
		element = driver.findElement(By.cssSelector("li > span"));
		return element;
	}


}
