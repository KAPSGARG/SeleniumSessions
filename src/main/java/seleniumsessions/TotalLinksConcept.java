package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// 1. Calculate the total number of links
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println(totalLinks.size());

		// 2. Print the text of each links except blank links

		// By using for loop
//		for (int i = 0; i < totalLinks.size(); i++) {
//			String linkText = totalLinks.get(i).getText();
//
//			if (linkText.length() != 0) {
//				System.out.println(linkText);
//			}
//
//		}

		// By using for each loop
//		for (WebElement ele : totalLinks) {
//			String linkText = ele.getText();
//
//			if (linkText.length() != 0) {
//				System.out.println(linkText);
//			}
//		}

		List<WebElement> textList = driver.findElements(By.className("form-control"));
		System.out.println(textList.size());

		for (WebElement ele : textList) {
			ele.sendKeys("Kapil");
		}

	}
}
