package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountInformationPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement AccountInformationHeader(WebDriver driver) {

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
	public static WebElement EmailField(WebDriver driver) {

		element = driver.findElement(By.id("email"));

		return element;
	}
	
	/**
	 * #8
	 * driver
	 *
	 */
	public static WebElement TaxVatField(WebDriver driver) {

		element = driver.findElement(By.id("taxvat"));

		return element;
	}
	
	/**
	 * #9
	 * driver
	 *
	 */
	public static WebElement GenderDropdown(WebDriver driver) {

		element = driver.findElement(By.id("gender"));

		return element;
	}
	
	/**
	 * #10
	 * driver
	 *
	 */
	public static WebElement ChangePasswordCheckbox(WebDriver driver) {

		element = driver.findElement(By.cssSelector("li.control > label"));

		return element;
	}
	
	/**
	 * #11
	 * driver
	 *
	 */
	public static WebElement CurrentPasswordField(WebDriver driver) {

		element = driver.findElement(By.id("current_password"));

		return element;
	}
	
	/**
	 * #12
	 * driver
	 *
	 */
	public static WebElement NewPasswordField(WebDriver driver) {

		element = driver.findElement(By.id("password"));

		return element;
	}
	
	/**
	 * #13
	 * driver
	 *
	 */
	public static WebElement ConfirmNewPasswordField(WebDriver driver) {

		element = driver.findElement(By.id("confirmation"));

		return element;
	}
	
	/**
	 * #14
	 * driver
	 *
	 */
	public static WebElement BackLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("p.back-link > a"));

		return element;
	}
	
	/**
	 * #15
	 * driver
	 *
	 */
	public static WebElement SaveButton(WebDriver driver) {

		element = driver.findElement(By.cssSelector("div.buttons-set > button.button"));

		return element;
	}
	
	

}
