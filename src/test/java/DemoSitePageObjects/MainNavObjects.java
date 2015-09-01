package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavObjects {
	
	//Main links
	
	private static WebElement element = null;
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement MainNavWomenLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li/a"));

		return element;
	}
	
	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement MainNavMenLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[2]/a"));

		return element;
	}
	
	/**
	 * #3
	 * driver
	 *
	 */
	public static WebElement MainNavAccessoriesLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[3]/a"));

		return element;
	}
	
	/**
	 * #4
	 * driver
	 *
	 */
	public static WebElement MainNavHomeDecorLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[4]/a"));

		return element;
	}
	
	/**
	 * #5
	 * driver
	 *
	 */
	public static WebElement MainNavElectronicsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[5]/a"));

		return element;
	}
	
	/**
	 * #6
	 * driver
	 *
	 */
	public static WebElement MainNavSportingGoodsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[6]/a"));

		return element;
	}
	
	/**
	 * #7
	 * driver
	 *
	 */
	public static WebElement MainNavVIPLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[7]/a"));

		return element;
	}
	
	/**
	 * #8
	 * driver
	 *
	 */
	public static WebElement MainNavGiftCardLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[8]/a"));

		return element;
	}
	
	//Women sublinks
	/**
	 * #9
	 * driver
	 *
	 */
	public static WebElement MainNavWomenViewAll(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li/ul/li/a"));

		return element;
	}
	
	/**
	 * #10
	 * driver
	 *
	 */
	public static WebElement MainNavWomenNewArrivals(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li/ul/li[2]/a"));

		return element;
	}
	
	/**
	 * #11
	 * driver
	 *
	 */
	public static WebElement MainNavWomenTopsBlouses(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li/ul/li[3]/a"));

		return element;
	}
	
	/**
	 * #12
	 * driver
	 *
	 */
	public static WebElement MainNavWomenPantsDenim(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li/ul/li[4]/a"));

		return element;
	}
	
	/**
	 * #13
	 * driver
	 *
	 */
	public static WebElement MainNavWomenDressesSkirts(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li/ul/li[5]/a"));

		return element;
	}
	
	/**
	 * #14
	 * driver
	 *
	 */
	public static WebElement MainNavWomenElisaIlana(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li/ul/li[6]/a"));

		return element;
	}
	
	//Men sublinks
	
	/**
	 * #15
	 * driver
	 *
	 */
	public static WebElement MainNavMenViewAll(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[2]/ul/li/a"));

		return element;
	}
	
	/**
	 * #16
	 * driver
	 *
	 */
	public static WebElement MainNavMenNewArrivals(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[2]/ul/li[2]/a"));

		return element;
	}
	
	/**
	 * #17
	 * driver
	 *
	 */
	public static WebElement MainNavMenShirts(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[2]/ul/li[3]/a"));

		return element;
	}
	
	/**
	 * #18
	 * driver
	 *
	 */
	public static WebElement MainNavMenTeesKnitsandPolos(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[2]/ul/li[4]/a"));

		return element;
	}
	
	/**
	 * #19
	 * driver
	 *
	 */
	public static WebElement MainNavMenPantsDenim(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[2]/ul/li[5]/a"));

		return element;
	}
	
	/**
	 * #20
	 * driver
	 *
	 */
	public static WebElement MainNavMenBlazers(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[2]/ul/li[6]/a"));

		return element;
	}
	
	/**
	 * #21
	 * driver
	 *
	 */
	public static WebElement MainNavMenFootwear(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[2]/ul/li[7]/a"));

		return element;
	}
	
	//Accessories sublinks
	
	/**
	 * #17
	 * driver
	 *
	 */
	public static WebElement MainNavAccessoriesViewAll(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[3]/ul/li/a"));

		return element;
	}
	
	/**
	 * #18
	 * driver
	 *
	 */
	public static WebElement MainNavAccessoriesEyewear(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[3]/ul/li[2]/a"));

		return element;
	}
	
	/**
	 * #19
	 * driver
	 *
	 */
	public static WebElement MainNavAccessoriesJewelry(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[3]/ul/li[3]/a"));

		return element;
	}
	
	/**
	 * #20
	 * driver
	 *
	 */
	public static WebElement MainNavAccessoriesShoes(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[3]/ul/li[4]/a"));

		return element;
	}
	
	/**
	 * #21
	 * driver
	 *
	 */
	public static WebElement MainNavAccessoriesBagsLuggage(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[3]/ul/li[5]/a"));

		return element;
	}
	
	//Home & Decor sublinks
	
	/**
	 * #22
	 * driver
	 *
	 */
	public static WebElement MainNavHomeDecorViewAll(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[4]/ul/li/a"));

		return element;
	}
	
	/**
	 * #23
	 * driver
	 *
	 */
	public static WebElement MainNavHomeDecorBooksMusic(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[4]/ul/li[2]/a"));

		return element;
	}
	
	/**
	 * #24
	 * driver
	 *
	 */
	public static WebElement MainNavHomeDecorBedBath(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[4]/ul/li[3]/a"));

		return element;
	}
	
	/**
	 * #25
	 * driver
	 *
	 */
	public static WebElement MainNavHomeDecorDecorativeAccents(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[4]/ul/li[4]/a"));

		return element;
	}

	//Electronics sublinks
	
	/**
	 * #26
	 * driver
	 *
	 */
	public static WebElement MainNavElectronicsViewAll(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[5]/ul/li/a"));

		return element;
	}
	
	/**
	 * #27
	 * driver
	 *
	 */
	public static WebElement MainNavElectronicsAudio(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[5]/ul/li[2]/a"));

		return element;
	}
	
	/**
	 * #28
	 * driver
	 *
	 */
	public static WebElement MainNavElectronicsPhotography(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[5]/ul/li[3]/a"));

		return element;
	}
	
	//Sporting Goods sublinks
	
	/**
	 * #29
	 * driver
	 *
	 */
	public static WebElement MainNavSportingGoodsViewAll(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[6]/ul/li/a"));

		return element;
	}
	
	/**
	 * #30
	 * driver
	 *
	 */
	public static WebElement MainNavSportingGoodsBasketball(WebDriver driver) {

		element = driver.findElement(By.xpath("//nav[@id='nav']/ol/li[6]/ul/li[2]/a"));

		return element;
	}

}
