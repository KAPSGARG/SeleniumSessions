package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// There are many ways to interact with Web element on the web page

		// 1.
		// driver.findElement(By.id("input-email")).sendKeys("kapil@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("Kaps@123");

		// 2.
		// WebElement emailAdd = driver.findElement(By.id("input-email"));
		// emailAdd.sendKeys("kapil@gmail.com");

		// WebElement passWord = driver.findElement(By.id("input-password"));
		// passWord.sendKeys("Kaps@123");

		// 3. By locator
		// By userName = By.id("input-email");
		// WebElement emailAdd = driver.findElement(userName);
		// emailAdd.sendKeys("Kapil@yahoo.com");

		// By userPass = By.id("input-password");
		// WebElement passWord = driver.findElement(userPass);
		// passWord.sendKeys("Billi@123");

		// 4. By locator with some utility
		// By userName = By.id("input-email");
		// WebElement emailAdd = getElement(userName);
		// emailAdd.sendKeys("kapil@gmail.com");

		// By userPass = By.id("input-password");
		// WebElement passWord = getElement(userPass);
		// passWord.sendKeys("Kaps@123");

		// 5. By locator with element utility and action utility
		// By userName = By.id("input-email");
		// doSendKeys(userName, "Kapil@yahoo.com");

		// By userPass = By.id("input-password");
		// doSendKeys(userPass, "Billi@123");

		// 6. By locator with the help of using Element Utility class
		// By userName = By.id("input-email");
		// By userPass = By.id("input-password");

		// ElementUtil eleUtil = new ElementUtil(driver);
		// eleUtil.doSendKeys(userName, "Kaps@abc.com");
		// eleUtil.doSendKeys(userPass, "12345");

		// 7. Browser utility + Element utility
		// We are testing this option by the help of using OpenCartLoginTest class

		// 8. By the help of using utility + String locators
		String username_id = "input-email";
		String password_id = "input-password";

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys("id", username_id, "KapilGarg@gmail.com");
		eleUtil.doSendKeys("id", password_id, "Kaps@3456");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
