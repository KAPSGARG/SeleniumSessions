package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/women-s-premier-league-2023-24-1411373/delhi-capitals-women-vs-up-warriorz-women-4th-match-1417719/full-scorecard");

		System.out.println(getWicketTakerName("Tahlia McGrath"));
		System.out.println(getWicketTakerName("Sophie Ecclestone"));

		System.out.println(getScoreCard("Dinesh Vrinda"));
		System.out.println(getScoreCard("Grace Harris"));

	}

	public static String getWicketTakerName(String userName) {
		By xpath = By.xpath("//span[text()='" + userName + "']/ancestor::td/following-sibling::td//span/span");

		return driver.findElement(xpath).getText();
	}

	public static List<String> getScoreCard(String userName) {
		By xpath = By.xpath("//span[text()='" + userName
				+ "']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]");

		List<WebElement> scoreEles = driver.findElements(xpath);
		List<String> scoreCardList = new ArrayList<String>();

		for (WebElement ele : scoreEles) {
			String text = ele.getText();

			scoreCardList.add(text);
		}

		return scoreCardList;
	}

}
