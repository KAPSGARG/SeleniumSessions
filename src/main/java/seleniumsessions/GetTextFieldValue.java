package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.id("input-email")).sendKeys("Testing");

//		String textVal = driver.findElement(By.id("input-email")).getAttribute("value");
//		System.out.println(textVal);

		// getText() - is only applicable for links, label, headers, span
		String text = driver.findElement(By.id("input-email")).getText();
		System.out.println(text);
	}

}
