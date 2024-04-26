package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		// Learning about navigation methods
		WebDriver driver = new ChromeDriver();

		URL url = new URL("https://www.google.com");
		driver.navigate().to(url);
		System.out.println(driver.getTitle());

		driver.navigate().to("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());

		driver.navigate().to("https://www.w3schools.com/");
		System.out.println(driver.getTitle());

		Thread.sleep(3000);

		driver.navigate().back();
		System.out.println(driver.getTitle());

		Thread.sleep(3000);

		driver.navigate().forward();
		System.out.println(driver.getTitle());

		Thread.sleep(3000);

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().refresh();

	}

}
