package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");

//		boolean flag = driver.findElement(By.id("submitButton")).isDisplayed();
//		System.out.println(flag);
//
//		boolean flag1 = driver.findElement(By.name("agreeTerms")).isDisplayed();
//		System.out.println(flag1);
//
//		boolean flag2 = driver.findElement(By.id("submitButton")).isEnabled();
//		System.out.println(flag2);
//
//		boolean flag3 = driver.findElement(By.name("agreeTerms")).isEnabled();
//		System.out.println(flag3);
//
//		boolean flag4 = driver.findElement(By.name("agreeTerms")).isSelected();
//		System.out.println(flag4);

		driver.findElement(By.name("agreeTerms")).click();

		boolean flag5 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(flag5);

		boolean flag6 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(flag6);

	}

}
