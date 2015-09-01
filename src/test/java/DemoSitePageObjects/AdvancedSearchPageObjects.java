package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearchPageObjects {
	private static WebElement element = null;

	/**
	 * #1
	 * driver
	 */
	
	public static WebElement NameField(WebDriver driver) {
		element = driver.findElement(By.id("name"));
		return element;
	}

	/**
	 * #2
	 * driver
	 */
	
	public static WebElement DescriptionField(WebDriver driver) {
		element = driver.findElement(By.id("description"));
		return element;
	}

	/**
	 * #3
	 * driver
	 */
	
	public static WebElement PriceLowField(WebDriver driver) {
		element = driver.findElement(By.id("price"));
		return element;
	}

	/**
	 * #4
	 * driver
	 */
	
	public static WebElement PriceHighField(WebDriver driver) {
		element = driver.findElement(By.id("price_to"));
		return element;
	}

	/**
	 * #5
	 * driver
	 */
	
	public static WebElement ColorField(WebDriver driver) {
		element = driver.findElement(By.id("color"));
		return element;
	}

	/**
	 * #6
	 * driver
	 */
	
	public static WebElement SizeField(WebDriver driver) {
		element = driver.findElement(By.id("size"));
		return element;
	}

	/**
	 * #7
	 * driver
	 */
	
	public static WebElement GenderField(WebDriver driver) {
		element = driver.findElement(By.id("gender"));
		return element;
	}

	/**
	 * #8
	 * driver
	 */
	
	public static WebElement PandoraBraceletSizeField(WebDriver driver) {
		element = driver.findElement(By.id("pandora_brl_clsp_bracelet_size"));
		return element;
	}

	/**
	 * #9
	 * driver
	 */
	
	public static WebElement ReleaseDateField(WebDriver driver) {
		element = driver.findElement(By.id("release_date"));
		return element;
	}

	/**
	 * #10
	 * driver
	 */
	
	public static WebElement SearchButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.buttons-set > button.button"));
		return element;
	}
	

}
