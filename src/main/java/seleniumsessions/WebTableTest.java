package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(4000);

		// NoSuchElementException
		// driver.findElement(By.linkText("Contacts")).click();

		// NoSuchElementException
		// driver.findElement(By.linkText("CONTACTS")).click();

		driver.switchTo().frame("mainpanel");

		driver.findElement(By.linkText("CONTACTS")).click();

		selectContact("Pankaj Mishra");

		System.out.println(getCompName("Pankaj Mishra"));

		System.out.println(getContactsInfoList("Pankaj Mishra"));

		System.out.println(getEmailId("Pankaj Mishra"));

	}

	public static void selectContact(String userName) {
		By xpath = By.xpath(
				"//a[text()='" + userName + "']/parent::td/preceding-sibling::td/child::input[@type='checkbox']");

		driver.findElement(xpath).click();
	}

	public static String getCompName(String userName) {
		By xpath = By
				.xpath("//a[text()='" + userName + "']/parent::td/following-sibling::td/child::a[@context='company']");

		return driver.findElement(xpath).getText();
	}

	public static List<String> getContactsInfoList(String userName) {
		By xpath = By.xpath("//a[text()='" + userName + "']/parent::td/following-sibling::td/span[@context='phone']");

		List<WebElement> contactsList = driver.findElements(xpath);
		List<String> strContactsList = new ArrayList<String>();

		for (WebElement ele : contactsList) {
			String text = ele.getText();

			strContactsList.add(text);
		}

		return strContactsList;
	}

	public static String getEmailId(String userName) {
		By xpath = By.xpath("(//a[text()='" + userName + "']/parent::td/following-sibling::td/child::a)[2]");

		return driver.findElement(xpath).getText();
	}

}
