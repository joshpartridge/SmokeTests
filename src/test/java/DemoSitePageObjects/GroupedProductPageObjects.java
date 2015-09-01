package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GroupedProductPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 */
	
	public static String ProductTitle1(WebDriver driver) {
		title = driver.findElement(By.cssSelector("strong")).getText();
		return title;
	}
	
	/**
	 * #2
	 * driver
	 */
	
	public static String ProductTitle2(WebDriver driver) {
		title = driver.findElement(By.cssSelector("span.h1")).getText();
		return title;
	}
	
	/**
	 * #3
	 * driver
	 */
	
	public static WebElement FirstChildProductTitle(WebDriver driver) {
		element = driver.findElement(By.cssSelector("p.name-wrapper"));
		return element;
	}
	
	/**
	 * #4
	 * driver
	 */
	
	public static WebElement FirstChildProductPrice(WebDriver driver) {
		element = driver.findElement(By.xpath("//div/span/span"));
		return element;
	}
	
	/**
	 * #5
	 * driver
	 */
	
	public static WebElement SecondChildProductTitle(WebDriver driver) {
		element = driver.findElement(By.cssSelector("tr.even > td.name > p.name-wrapper"));
		return element;
	}
	
	/**
	 * #6
	 * driver
	 */
	
	public static WebElement SecondChildProductPrice(WebDriver driver) {
		element = driver.findElement(By.xpath("//tr[2]/td[3]/div/span/span"));
		return element;
	}
	
	/**
	 * #7
	 * driver
	 */
	
	public static WebElement ThirdChildProductTitle(WebDriver driver) {
		element = driver.findElement(By.xpath("//tr[3]/td[2]/p"));
		return element;
	}
	
	/**
	 * #8
	 * driver
	 */
	
	public static WebElement ThirdChildProductPrice(WebDriver driver) {
		element = driver.findElement(By.xpath("//tr[3]/td[3]/div/span/span"));
		return element;
	}
	
	/**
	 * #9
	 * driver
	 */
	
	public static WebElement FourthChildProductTitle(WebDriver driver) {
		element = driver.findElement(By.xpath("//tr[4]/td[2]/p"));
		return element;
	}
	
	/**
	 * #10
	 * driver
	 */
	
	public static WebElement FourthChildProductPrice(WebDriver driver) {
		element = driver.findElement(By.xpath("//tr[4]/td[2]/p"));
		return element;
	}
	
	/**
	 * #11
	 * driver
	 */
	
	public static WebElement FifthChildProductTitle(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='super-product-table']/tbody/tr[5]/td[2]/p"));
		return element;
	}
	
	/**
	 * #12
	 * driver
	 */
	
	public static WebElement FifthChildProductPrice(WebDriver driver) {
		element = driver.findElement(By.xpath("//tr[5]/td[3]/div/span/span"));
		return element;
	}
	
	/**
	 * #13
	 * driver
	 */
	
	public static WebElement SixthChildProductTitle(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='super-product-table']/tbody/tr[6]/td[2]/p"));
		return element;
	}
	
	/**
	 * #14
	 * driver
	 */
	
	public static WebElement SixthChildProductPrice(WebDriver driver) {
		element = driver.findElement(By.xpath("//tr[6]/td[3]/div/span/span"));
		return element;
	}
	
	/**
	 * #15
	 * driver
	 */
	
	public static WebElement SeventhChildProductTitle(WebDriver driver) {
		element = driver.findElement(By.cssSelector("tr.last.odd > td.name > p.name-wrapper"));
		return element;
	}
	
	/**
	 * #16
	 * driver
	 */
	
	public static WebElement SeventhChildProductPrice(WebDriver driver) {
		element = driver.findElement(By.xpath("//tr[7]/td[3]/div/span/span"));
		return element;
	}
	
	/**
	 * #17
	 * driver
	 */
	
	public static WebElement FirstChildProductQuantity(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='super-product-table']/tbody/tr/td[2]/div/input"));
		return element;
	}
	
	/**
	 * #18
	 * driver
	 */
	
	public static WebElement SecondChildProductQuantity(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='super-product-table']/tbody/tr[2]/td[2]/div/input"));
		return element;
	}
	
	/**
	 * #19
	 * driver
	 */
	
	public static WebElement ThirdChildProductQuantity(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='super-product-table']/tbody/tr[3]/td[2]/div/input"));
		return element;
	}
	
	/**
	 * #20
	 * driver
	 */
	
	public static WebElement FourthChildProductQuantity(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='super-product-table']/tbody/tr[4]/td[2]/div/input"));
		return element;
	}
	
	/**
	 * #21
	 * driver
	 */
	
	public static WebElement FifthChildProductQuantity(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='super-product-table']/tbody/tr[5]/td[2]/div/input"));
		return element;
	}
	
	/**
	 * #22
	 * driver
	 */
	
	public static WebElement SixthChildProductQuantity(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='super-product-table']/tbody/tr[6]/td[2]/div/input"));
		return element;
	}
	
	/**
	 * #23
	 * driver
	 */
	
	public static WebElement SeventhChildProductQuantity(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='super-product-table']/tbody/tr[7]/td[2]/div/input"));
		return element;
	}
	
	

}
