package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class CategoryPageObjects {
	
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

		title = driver.findElement(By.cssSelector("strong")).getText();

		return title;
	}
	
	/**
	 * #18
	 * driver
	 *
	 */
	public static WebElement FirstProductAddToWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Add to Wishlist')]"));

		return element;
	}
	
	/**
	 * #19
	 * driver
	 *
	 */
	public static WebElement SecondProductAddToWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Add to Wishlist')])[2]"));

		return element;
	}
	
	/**
	 * #20
	 * driver
	 *
	 */
	public static WebElement ThirdProductAddToWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Add to Wishlist')])[3]"));

		return element;
	}
	
	/**
	 * #21
	 * driver
	 *
	 */
	public static WebElement FourthProductAddToWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Add to Wishlist')])[4]"));

		return element;
	}
	
	/**
	 * #22
	 * driver
	 *
	 */
	public static WebElement FirstProductAddToCompareLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Add to Compare')]"));

		return element;
	}
	
	/**
	 * #23
	 * driver
	 *
	 */
	public static WebElement SecondProductAddToCompareLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Add to Compare')])[2]"));

		return element;
	}
	
	/**
	 * #24
	 * driver
	 *
	 */
	public static WebElement ThirdProductAddToCompareLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Add to Compare')])[3]"));

		return element;
	}
	
	/**
	 * #25
	 * driver
	 *
	 */
	public static WebElement FourthProductAddToCompareLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Add to Compare')])[4]"));

		return element;
	}
	
	/**
	 * #26
	 * driver
	 *
	 */
	public static WebElement FirstProductFirstWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[4]/ul/li/div/div[3]/ul/li/div/div/ul/li/span"));

		return element;
	}
	
	/**
	 * #27
	 * driver
	 *
	 */
	public static WebElement SecondProductFirstWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[4]/ul/li[2]/div/div[2]/ul/li/div/div/ul/li/span"));

		return element;
	}
	
	/**
	 * #28
	 * driver
	 *
	 */
	public static WebElement ThirdProductFirstWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[4]/ul/li[3]/div/div[2]/ul/li/div/div/ul/li/span"));

		return element;
	}
	
	/**
	 * #29
	 * driver
	 *
	 */
	public static WebElement FourthProductFirstWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[4]/ul/li[4]/div/div[2]/ul/li/div/div/ul/li/span"));

		return element;
	}
	
	/**
	 * #30
	 * driver
	 *
	 */
	public static WebElement FirstProductSecondWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[4]/ul/li/div/div[3]/ul/li/div/div/ul/li[2]/span"));

		return element;
	}

	/**
	 * #31
	 * driver
	 *
	 */
	public static WebElement SecondProductSecondWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[4]/ul/li[2]/div/div[2]/ul/li/div/div/ul/li[2]/span"));

		return element;
	}

	/**
	 * #32
	 * driver
	 *
	 */
	public static WebElement ThirdProductSecondWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[4]/ul/li[3]/div/div[3]/ul/li/div/div/ul/li[2]/span"));

		return element;
	}

	/**
	 * #33
	 * driver
	 *
	 */
	public static WebElement FourthProductSecondWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[4]/ul/li[2]/div/div[4]/ul/li/div/div/ul/li[2]/span"));

		return element;
	}

	/**
	 * #34
	 * driver
	 *
	 */
	public static WebElement FirstProductCreateNewWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[4]/ul/li/div/div[3]/ul/li/div/div/ul/li[3]/span"));

		return element;
	}

	/**
	 * #35
	 * driver
	 *
	 */
	public static WebElement SecondProductCreateNewWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[4]/ul/li[2]/div/div[2]/ul/li/div/div/ul/li[3]/span"));

		return element;
	}

	/**
	 * #36
	 * driver
	 *
	 */
	public static WebElement ThirdProductCreateNewWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[4]/ul/li[3]/div/div[3]/ul/li/div/div/ul/li[3]/span"));

		return element;
	}

	/**
	 * #37
	 * driver
	 *
	 */
	public static WebElement FourthProductCreateNewWishlistLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//html[@id='top']/body/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[4]/ul/li[3]/div/div[4]/ul/li/div/div/ul/li[3]/span"));

		return element;
	}

	/**
	 * #38
	 * driver
	 *
	 */
	public static WebElement SuccessMessage(WebDriver driver) {

		element = driver.findElement(By.cssSelector("li.success-msg > ul > li > span"));

		return element;
	}

	
	
	

}
