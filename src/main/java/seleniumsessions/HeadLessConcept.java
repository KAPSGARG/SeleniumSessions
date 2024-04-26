package seleniumsessions;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadLessConcept {

	public static void main(String[] args) {

		// Headless concept
		// No UI interaction - no browser launch/visibility
		// Everything is executed silently
		// Recommended for server testing

		// 1. For Chrome browser
		// ChromeOptions co = new ChromeOptions();
		// co.addArguments("--headless");
		// co.addArguments("--incognito");

		// WebDriver driver = new ChromeDriver(co);
		// driver.get("https://www.w3schools.com/");
		// System.out.println(driver.getTitle());

		// 2. For Firefox browser
		// FirefoxOptions fo = new FirefoxOptions();
		// fo.addArguments("--headless");

		// WebDriver driver = new FirefoxDriver(fo);
		// driver.get("https://naveenautomationlabs.com/opencart/");
		// System.out.println(driver.getTitle());

		// 3. For Edge browser
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--headless");
		eo.addArguments("--inprivate");

		WebDriver driver = new EdgeDriver(eo);
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
	}

}
