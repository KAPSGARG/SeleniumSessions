package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultileSelectionWithSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");

		By dropDownEle = By.xpath("//select[@multiple]");

		Select select = new Select(driver.findElement(dropDownEle));
		System.out.println(select.isMultiple());

		// Scenario - We need to select multiple options from the dropdown
		if (select.isMultiple()) {
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("James's flamingo");

			select.deselectByVisibleText("American flamingo");

			select.deselectAll();
		}

	}

}
