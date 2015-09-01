package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryStaticContentPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement CategoryName(WebDriver driver) {

		element = driver.findElement(By.cssSelector("h1"));

		return element;
	}
	
	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement CategoryImage(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[4]/img"));

		return element;
	}
	
	/**
	 * #3
	 * driver
	 *
	 */
	public static WebElement SubCategoryImage1(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[2]/ul/li/a/img"));

		return element;
	}
	
	/**
	 * #4
	 * driver
	 *
	 */
	public static WebElement SubCategoryImage2(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[2]/ul/li[2]/a/img"));

		return element;
	}
	
	/**
	 * #5
	 * driver
	 *
	 */
	public static WebElement SubCategoryImage3(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[2]/ul/li[3]/a/img"));

		return element;
	}
	
	/**
	 * #6
	 * driver
	 *
	 */
	public static WebElement SubCategoryImage4(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[2]/ul/li[4]/a/img"));

		return element;
	}
	
	/**
	 * #7
	 * driver
	 *
	 */
	public static WebElement SubCategoryImageSpan1(WebDriver driver) {

		element = driver.findElement(By.xpath("//li/a/span"));

		return element;
	}
	
	/**
	 * #8
	 * driver
	 *
	 */
	public static WebElement SubCategoryImageSpan2(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[2]/a/span"));

		return element;
	}
	
	/**
	 * #9
	 * driver
	 *
	 */
	public static WebElement SubCategoryImageSpan3(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[3]/a/span"));

		return element;
	}
	
	/**
	 * #10
	 * driver
	 *
	 */
	public static WebElement SubCategoryImageSpan4(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[4]/a/span"));

		return element;
	}

	
	
	

}
