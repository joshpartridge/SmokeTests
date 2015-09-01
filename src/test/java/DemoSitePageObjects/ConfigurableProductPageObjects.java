package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfigurableProductPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement FirstColorSwatch(WebDriver driver) {

		element = driver.findElement(By.xpath("//span/img"));

		return element;
	}
	
	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement SecondColorSwatch(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[2]/a/span/img"));

		return element;
	}
	
	/**
	 * #3
	 * driver
	 *
	 */
	public static WebElement ThirdColorSwatch(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[3]/a/span/img"));

		return element;
	}
	
	/**
	 * #4
	 * driver
	 *
	 */
	public static WebElement FourthColorSwatch(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[4]/a/span/img"));

		return element;
	}
	
	/**
	 * #5
	 * driver
	 *
	 */
	public static WebElement FirstSizeSwatch(WebDriver driver) {

		element = driver.findElement(By.xpath("//dd[2]/div/ul/li/a/span"));

		return element;
	}
	
	/**
	 * #6
	 * driver
	 *
	 */
	public static WebElement SecondSizeSwatch(WebDriver driver) {

		element = driver.findElement(By.xpath("//dd[2]/div/ul/li[2]/a/span"));

		return element;
	}
	
	/**
	 * #7
	 * driver
	 *
	 */
	public static WebElement ThirdSizeSwatch(WebDriver driver) {

		element = driver.findElement(By.xpath("//dd[2]/div/ul/li[3]/a/span"));

		return element;
	}
	
	/**
	 * #8
	 * driver
	 *
	 */
	public static WebElement FourthSizeSwatch(WebDriver driver) {

		element = driver.findElement(By.xpath("//dd[2]/div/ul/li[4]/a/span"));

		return element;
	}
	
	/**
	 * #9
	 * driver
	 *
	 */
	public static WebElement FifthSizeSwatch(WebDriver driver) {

		element = driver.findElement(By.xpath("//dd[2]/div/ul/li[5]/a/span"));

		return element;
	}
	
	/**
	 * #10
	 * driver
	 *
	 */
	public static WebElement ProductColor(WebDriver driver) {

		element = driver.findElement(By.id("select_label_color"));

		return element;
	}
	
	/**
	 * #11
	 * driver
	 *
	 */
	public static WebElement ProductSize(WebDriver driver) {

		element = driver.findElement(By.id("select_label_size"));

		return element;
	}
	
	/**
	 * #12
	 * driver
	 *
	 */
	public static WebElement ProductImagePink(WebDriver driver) {

		element = driver.findElement(By.xpath("//img[contains(@src,'pink.jpg')]"));

		return element;
	}
	

}
