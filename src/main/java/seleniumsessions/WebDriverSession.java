package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSession {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();
		
		//driver.quit();
		
		driver = new ChromeDriver();//here we will get a new session id
		
		driver.get("https://www.google.com/");
		
		String title1 = driver.getTitle();
		
		System.out.println(title1);
		
		driver.close();

	}

}
