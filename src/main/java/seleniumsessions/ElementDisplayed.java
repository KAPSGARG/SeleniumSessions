package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1. Without utility
//		boolean flag = driver.findElement(By.xpath("//img[@class='img-responsive' and @title='naveenopencart']"))
//				.isDisplayed();
//
//		if (flag) {
//			System.out.println("Logo is displayed");
//		} else {
//			System.out.println("Logo is not displayed");
//		}

		// 2. With Utility
//		By logo = By.xpath("//img[@class='img-responsive' and @title='naveenopencart']");
//
//		if (isElementDisplayed(logo)) {
//			System.out.println("Logo is displayed");
//		} else {
//			System.out.println("Logo is not displayed");
//		}

		// 3. Without utility
//		List<WebElement> logoList = driver
//				.findElements(By.xpath("//img[@class='img-responsive' and @title='naveenopencart']"));
//
//		if (logoList.size() == 1) {
//			System.out.println("Logo is displayed");
//		} else {
//			System.out.println("Logo is not displayed");
//		}

		// 4. With utility
		if (isElementExist(By.xpath("//img[@class='img-responsive' and @title='naveenopencart']"))) {
			System.out.println("Logo exists");
		} else {
			System.out.println("Logo does not exist");
		}
	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public static boolean isElementExist(By locator) {
		List<WebElement> eleList = getElements(locator);

		if (eleList.size() == 1) {
			return true;
		}

		return false;
	}

}
