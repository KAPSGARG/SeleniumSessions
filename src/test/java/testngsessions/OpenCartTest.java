package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {
	// before annotations:

	// 1.
	@BeforeSuite
	public void dbConnection() {
		System.out.println("Before Suite - dbConnection");
	}

	// 2.
	@BeforeTest
	public void createUser() {
		System.out.println("Before Test - createUser");
	}

	// 3.
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Before Class - launchBrowser");
	}

	// 4. //7. //10.
	@BeforeMethod
	public void login() {
		System.out.println("Before Method - login");
	}

	// 8.
	@Test
	public void titleTest() {
		System.out.println("Title Test method called");
	}

	// 5.
	@Test
	public void headerTest() {
		System.out.println("Header Test method called");
	}

	// 11.
	@Test
	public void urlTest() {
		System.out.println("URL Test method called");
	}

	// after annotations:

	// 6. //9. //12.
	@AfterMethod
	public void logout() {
		System.out.println("After Method - logout");
	}

	// 13.
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class - closeBrowser");
	}

	// 14.
	@AfterTest
	public void deleteUser() {
		System.out.println("After Test - deleteUser");
	}

	// 15.
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("After Suite - disconnectWithDB");
	}

}
