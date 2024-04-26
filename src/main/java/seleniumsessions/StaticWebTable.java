package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();

		System.out.println("Total rows count = " + (rowCount - 1));

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[4]/td[1]
		// *[@id="customers"]/tbody/tr[5]/td[1]

//		String beforeXPath = "//*[@id=\"customers\"]/tbody/tr[";
//		String afterXPath = "]/td[1]";
//
//		for (int row = 2; row <= rowCount; row++) {
//			String xpath = beforeXPath + row + afterXPath;
//
//			System.out.println(driver.findElement(By.xpath(xpath)).getText());
//		}

		// System.out.println("-------------ROW WISE DATA------------------");

//		List<WebElement> rowsList = driver.findElements(By.xpath("//table[@id='customers']//tr/child::td"));
//
//		for (WebElement ele : rowsList) {
//			String text = ele.getText();
//
//			System.out.println(text);
//		}

		System.out.println("-------------COLUMN WISE DATA------------------");

		int colCount = driver.findElements(By.xpath("//table[@id='customers']//tr/child::th")).size();

		for (int col = 1; col <= colCount; col++) {
			List<WebElement> colList = driver
					.findElements(By.xpath("//table[@id='customers']//tr/child::td[" + col + "]"));

			for (WebElement ele : colList) {
				String text = ele.getText();

				System.out.println(text);
			}
		}

	}

}
