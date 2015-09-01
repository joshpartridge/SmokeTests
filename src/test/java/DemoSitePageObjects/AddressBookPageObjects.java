package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressBookPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement AddressBookHeader(WebDriver driver) {

		element = driver.findElement(By.cssSelector("h1"));

		return element;
	}
	
	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement PrefixField(WebDriver driver) {

		element = driver.findElement(By.id("prefix"));

		return element;
	}
	
	/**
	 * #3
	 * driver
	 *
	 */
	public static WebElement FirstNameField(WebDriver driver) {

		element = driver.findElement(By.id("firstname"));

		return element;
	}
	
	/**
	 * #4
	 * driver
	 *
	 */
	public static WebElement MiddleNameField(WebDriver driver) {

		element = driver.findElement(By.id("middlename"));

		return element;
	}
	
	/**
	 * #5
	 * driver
	 *
	 */
	public static WebElement LastNameField(WebDriver driver) {

		element = driver.findElement(By.id("lastname"));

		return element;
	}
	
	/**
	 * #6
	 * driver
	 *
	 */
	public static WebElement SuffixField(WebDriver driver) {

		element = driver.findElement(By.id("suffix"));

		return element;
	}
	
	/**
	 * #7
	 * driver
	 *
	 */
	public static WebElement CompanyField(WebDriver driver) {

		element = driver.findElement(By.id("company"));

		return element;
	}
	
	/**
	 * #8
	 * driver
	 *
	 */
	public static WebElement TelephoneField(WebDriver driver) {

		element = driver.findElement(By.id("telephone"));

		return element;
	}
	
	/**
	 * #9
	 * driver
	 *
	 */
	public static WebElement FaxField(WebDriver driver) {

		element = driver.findElement(By.id("fax"));

		return element;
	}
	
	/**
	 * #10
	 * driver
	 *
	 */
	public static WebElement StreetAddressField(WebDriver driver) {

		element = driver.findElement(By.id("street_1"));

		return element;
	}
	
	/**
	 * #11
	 * driver
	 *
	 */
	public static WebElement StreetAddress2Field(WebDriver driver) {

		element = driver.findElement(By.id("street_2"));

		return element;
	}
	
	/**
	 * #12
	 * driver
	 *
	 */
	public static WebElement CityField(WebDriver driver) {

		element = driver.findElement(By.id("city"));

		return element;
	}
	
	/**
	 * #13
	 * driver
	 *
	 */
	public static WebElement StateDropdown(WebDriver driver) {

		element = driver.findElement(By.id("region_id"));

		return element;
	}
	
	/**
	 * #14
	 * driver
	 *
	 */
	public static WebElement PostalCodeField(WebDriver driver) {

		element = driver.findElement(By.id("zip"));

		return element;
	}
	
	/**
	 * #15
	 * driver
	 *
	 */
	public static WebElement CountryDropdown(WebDriver driver) {

		element = driver.findElement(By.id("country"));

		return element;
	}
	
	/**
	 * #16
	 * driver
	 *
	 */
	public static WebElement BackLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("p.back-link > a"));

		return element;
	}
	
	/**
	 * #17
	 * driver
	 *
	 */
	public static WebElement SaveAddressButton(WebDriver driver) {

		element = driver.findElement(By.cssSelector("div.buttons-set > button.button"));

		return element;
	}
	
	/**
	 * #18
	 * driver
	 *
	 */
	public static WebElement SuccessMessage(WebDriver driver) {

		element = driver.findElement(By.cssSelector("li.success-msg > ul > li"));

		return element;
	}
	
	/**
	 * #19
	 * driver
	 *
	 */
	public static WebElement SuccessMessageText(WebDriver driver) {

		element = driver.findElement(By.cssSelector("li > span"));

		return element;
	}
	
	/**
	 * #20
	 * driver
	 *
	 */
	public static WebElement AddNewAddressButton(WebDriver driver) {

		element = driver.findElement(By.cssSelector("div.page-title.title-buttons > button.button"));

		return element;
	}
	
	

}
