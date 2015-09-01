package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailToAFriendPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 */
	
	public static WebElement EmailtoaFriendTitle(WebDriver driver) {
		element = driver.findElement(By.cssSelector("h1"));
		return element;
	}
	
	/**
	 * #2
	 * driver
	 */
	
	public static WebElement SenderNameField(WebDriver driver) {
		element = driver.findElement(By.id("sender_name"));
		return element;
	}
	
	/**
	 * #3
	 * driver
	 */
	
	public static WebElement SenderEmailField(WebDriver driver) {
		element = driver.findElement(By.id("sender_email"));
		return element;
	}
	
	/**
	 * #4
	 * driver
	 */
	
	public static WebElement SenderMessageField(WebDriver driver) {
		element = driver.findElement(By.id("sender_message"));
		return element;
	}
	
	/**
	 * #5
	 * driver
	 */
	
	public static WebElement RecipientNameField(WebDriver driver) {
		element = driver.findElement(By.id("recipients_name"));
		return element;
	}
	
	/**
	 * #6
	 * driver
	 */
	
	public static WebElement RecipientEmailField(WebDriver driver) {
		element = driver.findElement(By.id("recipients_email"));
		return element;
	}
	
	/**
	 * #7
	 * driver
	 */
	
	public static WebElement AddRecipientButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#add_recipient_button > button.button"));
		return element;
	}
	
	/**
	 * #8
	 * driver
	 */
	
	public static WebElement SendEmailButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.buttons-set > button.button"));
		return element;
	}
	
	/**
	 * #9
	 * driver
	 */
	
	public static WebElement BackLink(WebDriver driver) {
		element = driver.findElement(By.linkText("« Back"));
		return element;
	}
	
	/**
	 * #10
	 * driver
	 */
	
	public static WebElement RecipientNameField2(WebDriver driver) {
		element = driver.findElement(By.id("recipients_name0"));
		return element;
	}
	
	/**
	 * #11
	 * driver
	 */
	
	public static WebElement RecipientNameField3(WebDriver driver) {
		element = driver.findElement(By.id("recipients_name1"));
		return element;
	}
	
	/**
	 * #12
	 * driver
	 */
	
	public static WebElement RecipientNameField4(WebDriver driver) {
		element = driver.findElement(By.id("recipients_name2"));
		return element;
	}
	
	/**
	 * #13
	 * driver
	 */
	
	public static WebElement RecipientNameField5(WebDriver driver) {
		element = driver.findElement(By.id("recipients_name3"));
		return element;
	}
	
	/**
	 * #14
	 * driver
	 */
	
	public static WebElement RecipientEmailField2(WebDriver driver) {
		element = driver.findElement(By.id("recipients_email0"));
		return element;
	}
	
	/**
	 * #15
	 * driver
	 */
	
	public static WebElement RecipientEmailField3(WebDriver driver) {
		element = driver.findElement(By.id("recipients_email1"));
		return element;
	}
	
	/**
	 * #16
	 * driver
	 */
	
	public static WebElement RecipientEmailField4(WebDriver driver) {
		element = driver.findElement(By.id("recipients_email2"));
		return element;
	}	
	
	/**
	 * #17
	 * driver
	 */
	
	public static WebElement RecipientEmailField5(WebDriver driver) {
		element = driver.findElement(By.id("recipients_email3"));
		return element;
	}
	
	/**
	 * #18
	 * driver
	 */
	
	public static WebElement RemoveRecipient1Link(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Remove Email\"')]"));
		return element;
	}
	
	/**
	 * #19
	 * driver
	 */
	
	public static WebElement RemoveRecipient2Link(WebDriver driver) {
		element = driver.findElement(By.xpath("(//a[contains(text(),'Remove Email\"')])[2]"));
		return element;
	}
	
	/**
	 * #20
	 * driver
	 */
	
	public static WebElement RemoveRecipient3Link(WebDriver driver) {
		element = driver.findElement(By.xpath("(//a[contains(text(),'Remove Email\"')])[3]"));
		return element;
	}
	
	/**
	 * #21
	 * driver
	 */
	
	public static WebElement RemoveRecipient4Link(WebDriver driver) {
		element = driver.findElement(By.xpath("(//a[contains(text(),'Remove Email\"')])[4]"));
		return element;
	}
	
	/**
	 * #22
	 * driver
	 */
	
	public static WebElement EmailAddressLimitMessage(WebDriver driver) {
		element = driver.findElement(By.cssSelector("p.limit"));
		return element;
	}
	
	/**
	 * #23
	 * driver
	 */
	
	public static WebElement EmailSendSuccess(WebDriver driver) {
		element = driver.findElement(By.cssSelector("li.success-msg > ul > li"));
		return element;
	}
	
	/**
	 * #24
	 * driver
	 */
	
	public static WebElement EmailSentSuccessMessage(WebDriver driver) {
		element = driver.findElement(By.cssSelector("li.success-msg > ul > li > span"));
		return element;
	}
	

}
