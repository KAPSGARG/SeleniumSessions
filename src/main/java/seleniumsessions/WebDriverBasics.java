package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//Step1 : Open the Chrome browser
		WebDriver driver = new ChromeDriver();//Top casting
		
		//Step2 : Launch the URL
		driver.get("https://www.google.com/");
		
		//Step3: Get title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Step4 : Verification points/Check points
		if(title.equals("Google"))
		{
			System.out.println("Title PASSED"); 
		}
		else
		{
			System.out.println("Title FAILED");
		}
		
		String currURL = driver.getCurrentUrl();
		
		//Verification url
		if(currURL.contains("google.com"))
		{
			System.out.println("URL PASSED");
		}
		else
		{
			System.out.println("URL FAILED");
		}
		
		//Step 5 : Close the browser
		driver.close();

	}

}
