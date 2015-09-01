package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SiteMapCategoryPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement ElectronicsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[3]"));

		return element;
	}
	
	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement ElectronicsAudioLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Audio')])[2]"));

		return element;
	}
	
	/**
	 * #3
	 * driver
	 *
	 */
	public static WebElement ElectronicsPhotographyLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Photography')])[2]"));

		return element;
	}
	
	/**
	 * #4
	 * driver
	 *
	 */
	public static WebElement GiftCardLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Gift Card')])[2]"));

		return element;
	}
	
	/**
	 * #5
	 * driver
	 *
	 */
	public static WebElement WomenLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Women')])[3]"));

		return element;
	}
	
	/**
	 * #6
	 * driver
	 *
	 */
	public static WebElement WomenNewArrivalsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'New Arrivals')])[3]"));

		return element;
	}
	
	/**
	 * #7
	 * driver
	 *
	 */
	public static WebElement WomenTopsBlousesLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Tops & Blouses')])[2]"));

		return element;
	}
	
	/**
	 * #8
	 * driver
	 *
	 */
	public static WebElement WomenPantsDenimLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Pants & Denim')])[3]"));

		return element;
	}
	
	/**
	 * #9
	 * driver
	 *
	 */
	public static WebElement WomenDressesSkirtsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Dresses & Skirts')])[2]"));

		return element;
	}
	
	/**
	 * #10
	 * driver
	 *
	 */
	public static WebElement WomenElisaIlanaLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Elisa Ilana')])[2]"));

		return element;
	}
	
	/**
	 * #11
	 * driver
	 *
	 */
	public static WebElement MenLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Men')])[3]"));

		return element;
	}
	
	/**
	 * #12
	 * driver
	 *
	 */
	public static WebElement MenNewArrivalsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'New Arrivals')])[4]"));

		return element;
	}
	
	/**
	 * #13
	 * driver
	 *
	 */
	public static WebElement MenShirtsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Shirts')])[2]"));

		return element;
	}
	
	/**
	 * #14
	 * driver
	 *
	 */
	public static WebElement MenTeesKnitsandPolosLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Tees, Knits and Polos')])[2]"));

		return element;
	}
	
	/**
	 * #15
	 * driver
	 *
	 */
	public static WebElement MenPantsDenimLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Pants & Denim')])[4]"));

		return element;
	}
	
	/**
	 * #16
	 * driver
	 *
	 */
	public static WebElement MenBlazersLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Blazers')])[2]"));

		return element;
	}
	
	/**
	 * #17
	 * driver
	 *
	 */
	public static WebElement MenFootwearLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Footwear')])[2]"));

		return element;
	}
	
	/**
	 * #18
	 * driver
	 *
	 */
	public static WebElement SportingGoodsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Sporting Goods')])[3]"));

		return element;
	}
	
	/**
	 * #19
	 * driver
	 *
	 */
	public static WebElement BasketballLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Basketball')])[2]"));

		return element;
	}
	
	/**
	 * #20
	 * driver
	 *
	 */
	public static WebElement BasketballBasketballsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Basketballs')]"));

		return element;
	}
	
	/**
	 * #21
	 * driver
	 *
	 */
	public static WebElement BasketballShoesLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Shoes')])[2]"));

		return element;
	}
	
	/**
	 * #22
	 * driver
	 *
	 */
	public static WebElement ThreeWireLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'3Wire')]"));

		return element;
	}
	
	/**
	 * #23
	 * driver
	 *
	 */
	public static WebElement FisherLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Fisher')]"));

		return element;
	}
	
	/**
	 * #24
	 * driver
	 *
	 */
	public static WebElement AccessoriesLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Accessories')])[3]"));

		return element;
	}
	
	/**
	 * #25
	 * driver
	 *
	 */
	public static WebElement AccessoriesEyewearLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Eyewear')])[2]"));

		return element;
	}
	
	/**
	 * #26
	 * driver
	 *
	 */
	public static WebElement AccessoriesJewelryLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Jewelry')])[2]"));

		return element;
	}
	
	/**
	 * #27
	 * driver
	 *
	 */
	public static WebElement AccessoriesShoesLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Shoes')])[3]"));

		return element;
	}
	
	/**
	 * #28
	 * driver
	 *
	 */
	public static WebElement AccessoriesBagsLuggageLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Bags & Luggage')])[2]"));

		return element;
	}
	
	/**
	 * #29
	 * driver
	 *
	 */
	public static WebElement HomeDecorLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Home & Decor')])[3]"));

		return element;
	}
	
	/**
	 * #30
	 * driver
	 *
	 */
	public static WebElement BooksMusicLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Books & Music')])[2]"));

		return element;
	}
	
	/**
	 * #31
	 * driver
	 *
	 */
	public static WebElement BedBathLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Bed & Bath')])[2]"));

		return element;
	}
	
	/**
	 * #32
	 * driver
	 *
	 */
	public static WebElement DecorativeAccentsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Decorative Accents')])[2]"));

		return element;
	}
	
	
	/**
	 * #33
	 * driver
	 *
	 */
	public static WebElement SaleLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Sale')]"));

		return element;
	}
	
	/**
	 * #34
	 * driver
	 *
	 */
	public static WebElement SaleWomenLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Women')])[4]"));

		return element;
	}
	
	/**
	 * #35
	 * driver
	 *
	 */
	public static WebElement SaleMenLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Men')])[4]"));

		return element;
	}
	
	/**
	 * #36
	 * driver
	 *
	 */
	public static WebElement SaleAccessoriesLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Accessories')])[4]"));

		return element;
	}
	
	/**
	 * #37
	 * driver
	 *
	 */
	public static WebElement SaleHomeDecorLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Home & Decor')])[4]"));

		return element;
	}
	
	/**
	 * #38
	 * driver
	 *
	 */
	public static WebElement VIPLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'VIP')])[2]"));

		return element;
	}
	
	/**
	 * #39
	 * driver
	 *
	 */
	public static WebElement SiteMapHeader(WebDriver driver) {

		element = driver.findElement(By.cssSelector("h1"));

		return element;
	}
	
	
	

}
