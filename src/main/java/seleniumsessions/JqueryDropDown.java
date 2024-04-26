package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");

		Thread.sleep(2000);

		By drpdwnLocator = By.id("justAnInputBox");
		By choices = By.xpath("//ul//span[@class='comboTreeItemTitle']");

		// 1. tc_01: single selection
		// selectChoice(drpdwnLocator, choices, "choice 6 2 1");

		// 2. tc_02: multiple selection
//		selectChoice(drpdwnLocator, choices, "choice 6 2 1", "choice 2 1", "choice 1", "choice 2 3", "choice 4",
//				"choice 6");

		// 3. tc_03: all selection
		selectChoice(drpdwnLocator, choices, "all");

	}

	public static void selectChoice(By dropDownLocator, By choices, String... value) throws InterruptedException {
		driver.findElement(dropDownLocator).click();

		Thread.sleep(2000);

		List<WebElement> choicesList = driver.findElements(choices);

		if (!value[0].equals("all")) {

			for (WebElement ele : choicesList) {
				String text = ele.getText();

				for (String val : value) {
					if (val.equals(text)) {
						ele.click();
					}
				}
			}
		} else {
			for (WebElement ele : choicesList) {

				try {
					ele.click();
				} catch (ElementNotInteractableException e) {
					break;
				}
			}
		}
	}

}
