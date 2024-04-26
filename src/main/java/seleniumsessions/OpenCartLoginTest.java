package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginTest {

	public static void main(String[] args) {

		// Here we will be using the concept of Browser Utility + Element Utility

		// Browser Utility
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("Chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String pageTitle = brUtil.getPageTitle();
		System.out.println(pageTitle);

		// Element Utility
		By userName = By.id("input-email");
		By userPass = By.id("input-password");
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(userName, "Noni@gmail.com");
		eleUtil.doSendKeys(userPass, "Billi12345");

		// brUtil.closeBrowser();

	}

}
