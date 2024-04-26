package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithoutUsingSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		By optionsLocator = By.xpath("//select[@id='Form_getForm_Country']/option");

		DoSelectValueFromDropDown(optionsLocator, "New Zealand");

	}

	public static void DoSelectValueFromDropDown(By locator, String value) {
		List<WebElement> optionsList = driver.findElements(locator);

		for (WebElement e : optionsList) {
			String text = e.getText();

			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
