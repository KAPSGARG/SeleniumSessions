package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStrategy {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// 1. id locator - They are unique, can not be duplicate - 1st priority
		// driver.findElement(By.id("input-firstname")).sendKeys("Kapil");
		// driver.findElement(By.id("input-lastname")).sendKeys("Garg");

		// 2. name locator - They are not unique, can be duplicate - 2nd priority
		// driver.findElement(By.name("firstname")).sendKeys("Noni");
		// driver.findElement(By.name("lastname")).sendKeys("Garg");

		// By the help of using utility class
		// By frName = By.name("firstname");
		// By lsName = By.name("lastname");

		// ElementUtil eleUtil = new ElementUtil(driver);
		// eleUtil.doSendKeys(frName, "Kapil");
		// eleUtil.doSendKeys(lsName, "Garg");

		// 3. Class locators - They are not unique, can be duplicate - 3rd priority
		// driver.findElement(By.className("agree")).click();

		// 4. Xpath locator
		// driver.findElement(By.xpath("//*[@id='input-firstname']")).sendKeys("Kapil
		// Garg");
		// driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Garg");

		// By the help of using utility class
		// By firstName = By.xpath("//*[@id='input-firstname']");
		// By lastName = By.xpath("//input[@id='input-lastname']");

		// ElementUtil eleUtil = new ElementUtil(driver);
		// eleUtil.doSendKeys(firstName, "Kaps");
		// eleUtil.doSendKeys(lastName, "Garg");

		// 5. CSS Selector
		// driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Tommy");
		// driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Jackson");

		// 6. LinkText locator - Only works for links and you have to provide the text
		// of that link
		// driver.findElement(By.linkText("Login")).click();

		// By the help of using element util class
		// By loginLink = By.linkText("Login");

		// ElementUtil eleUtil = new ElementUtil(driver);
		// eleUtil.doClick(loginLink);

		// 7. PartialLinkText - Only for links - Provide partial text of the link
		// By forgLink = By.partialLinkText("Forgotten");

		// ElementUtil eleUtil = new ElementUtil(driver);
		// eleUtil.doClick(forgLink);

		// 8. TagName - you just have to provide the HTML tag
		// String header = driver.findElement(By.tagName("h1")).getText();
		// System.out.println(header);

		// By the help of using Utility class
		By header = By.tagName("h1");

		ElementUtil eleUtil = new ElementUtil(driver);
		String headerText = eleUtil.doGetElementText(header);
		System.out.println(headerText);

	}

}
