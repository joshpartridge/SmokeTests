package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.Locatable;

public class RelativeElementLocation {

	private static Point locationPoint;
	private static Locatable elementLocation;
	WebDriver driver = new FirefoxDriver();
	WebElement element;

	public Point location() throws Throwable {
		driver.get("Insert your URL here");
		element = driver.findElement(By.id("Insert id/css/xpath/ here"));
		elementLocation = (Locatable) element;
		locationPoint = elementLocation.getCoordinates().inViewPort();
		System.out.println(locationPoint);

		return locationPoint;
	}
}
