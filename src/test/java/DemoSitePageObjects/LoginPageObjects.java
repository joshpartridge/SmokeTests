package DemoSitePageObjects;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	private static String price = null;
	private static int numberInt;
	private static BigDecimal numberDecimal;
	private static DecimalFormat format = new DecimalFormat();
	private static DecimalFormatSymbols symbols = new DecimalFormatSymbols();
	
	/**
	 * #1
	 * driver
	 */
	
	public static WebElement LoginTitle(WebDriver driver) {
		element = driver.findElement(By.cssSelector("h1"));
		return element;
	}
	
	/**
	 * #2
	 * driver
	 */
	
	public static WebElement CreateAnAccountButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("a.button"));
		return element;
	}
	
	/**
	 * #3
	 * driver
	 */
	
	public static WebElement CreateAnAccountButtonText(WebDriver driver) {
		element = driver.findElement(By.cssSelector("a.button > span > span"));
		return element;
	}
	
	/**
	 * #4
	 * driver
	 */
	
	public static WebElement AlreadyRegisteredTitle(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.content.fieldset > h2"));
		return element;
	}
	
	/**
	 * #5
	 * driver
	 */
	
	public static WebElement EmailAddressField(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		return element;
	}
	
	/**
	 * #6
	 * driver
	 */
	
	public static WebElement PasswordField(WebDriver driver) {
		element = driver.findElement(By.id("pass"));
		return element;
	}
	
	/**
	 * #7
	 * driver
	 */
	
	public static WebElement ForgotYourPasswordLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Forgot Your Password?')]"));
		return element;
	}
	
	/**
	 * #8
	 * driver
	 */
	
	public static WebElement LoginButton(WebDriver driver) {
		element = driver.findElement(By.id("send2"));
		return element;
	}
	
	

}
