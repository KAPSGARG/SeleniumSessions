package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementClickSendKeys {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

		// Enabled element
		// driver.findElement(By.id("fname")).click();

		// Disabled element
		// driver.findElement(By.id("pass")).click();

		// You will get an exception - ElementNotInteractableException
		// driver.findElement(By.id("pass")).sendKeys("testing");

		// IllegalArgumentException: Keys to send should be a not null CharSequence
		// driver.findElement(By.id("pass")).sendKeys(null);

		StringBuilder sb = new StringBuilder("testing ");
		String str = "is ";

		driver.findElement(By.id("fname")).sendKeys(sb, str, "fun");
	}

}
