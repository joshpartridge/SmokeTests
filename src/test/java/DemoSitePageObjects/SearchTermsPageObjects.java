package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchTermsPageObjects {
	
	private static WebElement element = null;

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
	
	public static WebElement FirstSearchTermLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[3]/div/div/ul/li/a"));
		return element;
	}

	/**
	 * #3
	 * driver
	 */
	
	public static WebElement SecondSearchTermLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[3]/div/div/ul/li[2]/a"));
		return element;
	}

	/**
	 * #4
	 * driver
	 */
	
	public static WebElement ThirdSearchTermLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[3]/div/div/ul/li[3]/a"));
		return element;
	}

	/**
	 * #5
	 * driver
	 */
	
	public static WebElement FourthSearchTermLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[3]/div/div/ul/li[4]/a"));
		return element;
	}

	/**
	 * #6
	 * driver
	 */
	
	public static WebElement FifthSearchTermLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[3]/div/div/ul/li[5]/a"));
		return element;
	}

	/**
	 * #7
	 * driver
	 */
	
	public static WebElement SixthSearchTermLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[3]/div/div/ul/li[6]/a"));
		return element;
	}

	/**
	 * #8
	 * driver
	 */
	
	public static WebElement SeventhSearchTermLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[3]/div/div/ul/li[7]/a"));
		return element;
	}

	
	

}
