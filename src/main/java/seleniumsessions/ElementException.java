package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		// findElement() will give you an exception if web element not found
		// driver.findElement(By.id("Billi")).sendKeys("Pilli");//
		// NoSuchElementException

		List<WebElement> eleList = driver.findElements(By.tagName("victor"));

		System.out.println(eleList.size());
		System.out.println(eleList);

	}

}
