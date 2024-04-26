package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SHubWebTable {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		selectUser("Jordan.Mathews");
		selectUser("Joe.Root");

		System.out.println(getUserDetails("Jordan.Mathews"));
		System.out.println(getUserDetails("Joe.Root"));

	}

	public static void selectUser(String userName) {
		By xpath = By.xpath("//a[text()='" + userName + "']/ancestor::tr/td/input[@type='checkbox']");
		driver.findElement(xpath).click();
	}

	public static List<String> getUserDetails(String userName) {
		By xpath = By.xpath("//a[text()='" + userName + "']/parent::td/following-sibling::td");
		List<WebElement> userInfoEles = driver.findElements(xpath);
		List<String> userInfoList = new ArrayList<String>();

		for (WebElement ele : userInfoEles) {
			String text = ele.getText();

			userInfoList.add(text);
		}

		return userInfoList;
	}

}
