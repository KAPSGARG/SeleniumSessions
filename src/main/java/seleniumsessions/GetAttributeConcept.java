package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		String fn_placeholder = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		System.out.println(fn_placeholder);
//
//		String fn_type = driver.findElement(By.id("input-firstname")).getAttribute("type");
//		System.out.println(fn_type);
//
//		String fn_name = driver.findElement(By.id("input-firstname")).getAttribute("name");
//		System.out.println(fn_name);

		By firstName = By.id("input-firstname");
		String fn_placeholder = doElementGetAttribute(firstName, "placeholder");
		System.out.println(fn_placeholder);

		String fn_type = doElementGetAttribute(firstName, "type");
		System.out.println(fn_type);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String doElementGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
}
