package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubcategoryPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement FirstProductImage(WebDriver driver) {

		element = driver.findElement(By.xpath("//li/a/img"));

		return element;
	}
	
	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement SecondProductImage(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[2]/a/img"));

		return element;
	}
	
	/**
	 * #3
	 * driver
	 *
	 */
	public static WebElement ThirdProductImage(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[3]/a/img"));

		return element;
	}
	
	/**
	 * #4
	 * driver
	 *
	 */
	public static WebElement FourthProductImage(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[4]/a/img"));

		return element;
	}
	
	/**
	 * #5
	 * driver
	 *
	 */
	public static WebElement FirstProductLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//h2/a"));

		return element;
	}
	
	/**
	 * #6
	 * driver
	 *
	 */
	public static WebElement SecondProductLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[2]/div/h2/a"));

		return element;
	}
	
	/**
	 * #7
	 * driver
	 *
	 */
	public static WebElement ThirdProductLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[3]/div/h2/a"));

		return element;
	}
	
	/**
	 * #8
	 * driver
	 *
	 */
	public static WebElement FourthProductLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[4]/div/h2/a"));

		return element;
	}
	
	/**
	 * #9
	 * driver
	 *
	 */
	public static String FirstProductLinkText(WebDriver driver) {

		title = driver.findElement(By.xpath("//h2/a")).getText();

		return title;
	}
	
	/**
	 * #10
	 * driver
	 *
	 */
	public static String SecondProductLinkText(WebDriver driver) {

		title = driver.findElement(By.xpath("//li[2]/div/h2/a")).getText();

		return title;
	}
	
	/**
	 * #11
	 * driver
	 *
	 */
	public static String ThirdProductLinkText(WebDriver driver) {

		title = driver.findElement(By.xpath("//li[3]/div/h2/a")).getText();

		return title;
	}
	
	/**
	 * #12
	 * driver
	 *
	 */
	public static String FourthProductLinkText(WebDriver driver) {

		title = driver.findElement(By.xpath("//li[4]/div/h2/a")).getText();

		return title;
	}
	
	/**
	 * #13
	 * driver
	 *
	 */
	public static String FirstProductPrice(WebDriver driver) {

		title = driver.findElement(By.xpath("//div/span/span")).getText();

		return title;
	}
	
	/**
	 * #14
	 * driver
	 *
	 */
	public static String SecondProductPrice(WebDriver driver) {

		title = driver.findElement(By.xpath("//li[2]/div/div/span/span")).getText();

		return title;
	}
	
	/**
	 * #15
	 * driver
	 *
	 */
	public static String ThirdProductPrice(WebDriver driver) {

		title = driver.findElement(By.xpath("//li[3]/div/div/span/span")).getText();

		return title;
	}
	
	/**
	 * #16
	 * driver
	 *
	 */
	public static String FourthProductPrice(WebDriver driver) {

		title = driver.findElement(By.xpath("//li[4]/div/div/span/span")).getText();

		return title;
	}
	
	/**
	 * #17
	 * driver
	 *
	 */
	public static String CategoryPageTitle(WebDriver driver) {

		title = driver.findElement(By.xpath("//div[3]/div/div/ul/li[2]/a")).getText();

		return title;
	}
	
	/**
	 * #18
	 * driver
	 *
	 */
	public static WebElement SubcategoryTitle1(WebDriver driver) {

		element = driver.findElement(By.cssSelector("strong"));

		return element;
	}
	
	/**
	 * #19
	 * driver
	 *
	 */
	public static WebElement SubcategoryTitle2(WebDriver driver) {

		element = driver.findElement(By.cssSelector("h1"));

		return element;
	}
	
	/**
	 * #20
	 * driver
	 *
	 */
	public static WebElement FirstAddtoCartButton(WebDriver driver) {

		element = driver.findElement(By.xpath("(//button[@type='button'])[2]"));

		return element;
	}
	
	/**
	 * #21
	 * driver
	 *
	 */
	public static WebElement SecondAddtoCartButton(WebDriver driver) {

		element = driver.findElement(By.xpath("(//button[@type='button'])[3]"));

		return element;
	}
	
	/**
	 * #22
	 * driver
	 *
	 */
	public static WebElement ThirdAddtoCartButton(WebDriver driver) {

		element = driver.findElement(By.xpath("(//button[@type='button'])[4]"));

		return element;
	}
	
	/**
	 * #23
	 * driver
	 *
	 */
	public static WebElement FourthAddtoCartButton(WebDriver driver) {

		element = driver.findElement(By.xpath("(//button[@type='button'])[4]"));

		return element;
	}
	
	/**
	 * #24
	 * driver
	 *
	 */
	public static WebElement FirstViewDetailsButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'View Details')]"));

		return element;
	}
	
	/**
	 * #25
	 * driver
	 *
	 */
	public static WebElement SecondViewDetailsButton(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'View Details')])[2]"));

		return element;
	}
	
	/**
	 * #26
	 * driver
	 *
	 */
	public static WebElement ThirdViewDetailsButton(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'View Details')])[3]"));

		return element;
	}
	
	/**
	 * #27
	 * driver
	 *
	 */
	public static WebElement FourthViewDetailsButton(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'View Details')])[4]"));

		return element;
	}
	

}
