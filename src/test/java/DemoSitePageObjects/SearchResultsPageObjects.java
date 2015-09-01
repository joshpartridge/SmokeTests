package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPageObjects {
	private static WebElement element = null;
	private static String title = null;
	
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement SortByDropDown(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[3]/div[2]/div[3]/div/div[2]/div[2]/div[4]/div/div/div/select"));

		return element;
	}
	
	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement AscendingDescendingArrow(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[3]/div[2]/div[3]/div/div[2]/div[2]/div[4]/di"));

		return element;
	}
	
	/**
	 * #3
	 * driver
	 *
	 */
	public static WebElement GridIcon(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[3]/div[2]/div[3]/div/div[2]/div[2]/div[4]/div/div/p/strong"));

		return element;
	}
	
	/**
	 * #4
	 * driver
	 *
	 */
	public static WebElement ListIcon(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[3]/div[2]/div[3]/div/div[2]/div[2]/div[4]/div/div/p/a"));

		return element;
	}
	
	
	/**
	 * #5
	 * driver
	 *
	 */
	public static WebElement FirstProductImage(WebDriver driver) {

		element = driver.findElement(By.xpath("//li/a/img"));

		return element;
	}
	
	/**
	 * #6
	 * driver
	 *
	 */
	public static WebElement SecondProductImage(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[2]/a/img"));

		return element;
	}
	
	/**
	 * #7
	 * driver
	 *
	 */
	public static WebElement ThirdProductImage(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[3]/a/img"));

		return element;
	}
	
	/**
	 * #8
	 * driver
	 *
	 */
	public static WebElement FirstProductLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//li/div/h2/a"));

		return element;
	}
	
	/**
	 * #9
	 * driver
	 *
	 */
	public static WebElement SecondProductLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[2]/div/h2/a"));

		return element;
	}
	
	/**
	 * #10
	 * driver
	 *
	 */
	public static WebElement ThirdProductLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[3]/div/h2/a"));

		return element;
	}
	
	/**
	 * #11
	 * driver
	 *
	 */
	public static WebElement AddToCartButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//li[3]/div/div[2]/button"));

		return element;
	}
	
	/**
	 * #12
	 * driver
	 *
	 */
	public static WebElement ViewDetailsButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'View Details')]"));

		return element;
	}
	
	/**
	 * #13
	 * driver
	 */
	public static String SearchResultsPageTitle(WebDriver driver) {
		
		title = driver.getTitle();
		
		return title;
		
	}
	
	/**
	 * #14
	 * driver
	 *
	 */
	public static String FirstProductLinkText(WebDriver driver) {

		title = driver.findElement(By.xpath("//h2/a")).getText();
		
		return title;
	}
	
	/**
	 * #15
	 * driver
	 *
	 */
	public static WebElement ShoppingCartSuccessAlert(WebDriver driver) {

		element = driver.findElement(By.cssSelector("li.success-msg > ul > li"));
		return element;
	}
	
	/**
	 * #16
	 * driver
	 *
	 */
	public static WebElement SearchResultsTitle(WebDriver driver) {

		element = driver.findElement(By.cssSelector("h1"));
		return element;
	}


}
