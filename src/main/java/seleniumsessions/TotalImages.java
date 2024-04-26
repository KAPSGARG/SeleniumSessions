package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		// Get total number of images
		List<WebElement> imageList = driver.findElements(By.tagName("img"));

		System.out.println(imageList.size());

		for (WebElement ele : imageList) {
			String altVal = ele.getAttribute("alt");
			String srcVal = ele.getAttribute("src");

			System.out.println("ALT-> " + altVal + " " + "SRC-> " + srcVal);
		}
	}

}
