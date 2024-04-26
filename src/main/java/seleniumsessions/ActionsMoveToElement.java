package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

		By parent = By.className("menulink");
		By submenu = By.linkText("COURSES");

		handleMenuSubMenuLevel2(parent, submenu);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void handleMenuSubMenuLevel2(By parentMenuLocator, By SubMenuLocator) throws InterruptedException {
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenuLocator)).perform();

		Thread.sleep(2000);
		getElement(SubMenuLocator).click();
	}

}
