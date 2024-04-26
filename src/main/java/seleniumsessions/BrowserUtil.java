package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;

	public WebDriver launchBrowser(String browserName) {

		System.out.println("Browser name is " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass the right browser name " + browserName);
			throw new BrowserException("NO SUCH BROWSER EXCEPTION");
		}

		return driver;
	}

	public void launchURL(String url) {
		if (url == null) {
			throw new BrowserException("URL IS NULL");
		}

		if (url.indexOf("http") == 0) {
			driver.get(url);
		} else {
			throw new BrowserException("NO SUCH URL EXISTS");
		}
	}

	public void launchURL(URL url) {
		if (url == null) {
			throw new BrowserException("URL IS NULL");
		}

		String appUrl = String.valueOf(url);

		if (appUrl.indexOf("http") == 0) {
			driver.get(appUrl);
		} else {
			throw new BrowserException("NO SUCH URL EXISTS");
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
