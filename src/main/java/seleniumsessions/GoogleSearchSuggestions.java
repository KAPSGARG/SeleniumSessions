package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		By searchField = By.name("q");
		By suggestions = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']");

		doSearch(searchField, "selenium", suggestions, "webdriver");

	}

	public static void doSearch(By searchLocator, String searchKey, By searchSuggestions, String value)
			throws InterruptedException {
		driver.findElement(searchLocator).sendKeys(searchKey);

		// Suggestions take time to load that's why wait is required
		Thread.sleep(3000);

		List<WebElement> suggList = driver.findElements(searchSuggestions);

		for (WebElement ele : suggList) {
			String text = ele.getText();

			if (text.contains(value)) {
				ele.click();
				break;
			}
		}
	}

}
