package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComparePopupPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 */
	
	public static WebElement CompareHeader(WebDriver driver) {
		element = driver.findElement(By.cssSelector("h1"));
		return element;
	}

	/**
	 * #2
	 * driver
	 */
	
	public static WebElement PrintThisPageLink(WebDriver driver) {
		element = driver.findElement(By.cssSelector("a.link-print"));
		return element;
	}

	/**
	 * #3
	 * driver
	 */
	
	public static WebElement FirstProductRemove(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Remove This Item')]"));
		return element;
	}

	/**
	 * #4
	 * driver
	 */
	
	public static WebElement SecondProductRemove(WebDriver driver) {
		element = driver.findElement(By.xpath("(//a[contains(text(),'Remove This Item')])[2]"));
		return element;
	}

	/**
	 * #5
	 * driver
	 */
	
	public static WebElement ThirdProductRemove(WebDriver driver) {
		element = driver.findElement(By.xpath("(//a[contains(text(),'Remove This Item')])[3]"));
		return element;
	}

	/**
	 * #6
	 * driver
	 */
	
	public static WebElement FourthProductRemove(WebDriver driver) {
		element = driver.findElement(By.xpath("(//a[contains(text(),'Remove This Item')])[4]"));
		return element;
	}

	/**
	 * #7
	 * driver
	 */
	
	public static WebElement FirstProductImage(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='product_comparison']/tbody/tr/td/a/img"));
		return element;
	}

	/**
	 * #8
	 * driver
	 */
	
	public static WebElement SecondProductImage(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='product_comparison']/tbody/tr/td[2]/a/img"));
		return element;
	}

	/**
	 * #9
	 * driver
	 */
	
	public static WebElement ThirdProductImage(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='product_comparison']/tbody/tr/td[3]/a/img"));
		return element;
	}

	/**
	 * #10
	 * driver
	 */
	
	public static WebElement FourthProductImage(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='product_comparison']/tbody/tr/td[4]/a/img"));
		return element;
	}

	/**
	 * #11
	 * driver
	 */
	
	public static WebElement FirstProductLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='product_comparison']/tbody/tr/td/h2/a"));
		return element;
	}

	/**
	 * #12
	 * driver
	 */
	
	public static WebElement SecondProductLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='product_comparison']/tbody/tr/td[2]/h2/a"));
		return element;
	}

	/**
	 * #13
	 * driver
	 */
	
	public static WebElement ThirdProductLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='product_comparison']/tbody/tr/td[3]/h2/a"));
		return element;
	}

	/**
	 * #14
	 * driver
	 */
	
	public static WebElement FourthProductLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='product_comparison']/tbody/tr/td[4]/h2/a"));
		return element;
	}

	/**
	 * #15
	 * driver
	 */
	
	public static WebElement FirstProductAddtoCartButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='product_comparison']/tbody/tr[2]/td/p/button"));
		return element;
	}

	/**
	 * #16
	 * driver
	 */
	
	public static WebElement SecondProductAddtoCartButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='product_comparison']/tbody/tr[2]/td[2]/p/button"));
		return element;
	}

	/**
	 * #17
	 * driver
	 */
	
	public static WebElement ThirdProductAddtoCartButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='product_comparison']/tbody/tr[2]/td[3]/p/button"));
		return element;
	}

	/**
	 * #18
	 * driver
	 */
	
	public static WebElement FourthProductAddtoCartButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//table[@id='product_comparison']/tbody/tr[2]/td[4]/p/button"));
		return element;
	}

	/**
	 * #19
	 * driver
	 */
	
	public static WebElement CloseWindowButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.buttons-set > button.button"));
		return element;
	}

	
	
	
	

}
