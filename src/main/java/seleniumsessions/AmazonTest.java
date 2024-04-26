package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {

		String browserName = "firefox";

		BrowserUtil brUtil = new BrowserUtil();

		// Launch the new browser
		brUtil.launchBrowser(browserName);

		// Launch the url
		brUtil.launchURL("https://www.amazon.in/");

		// Get the page title
		String title = brUtil.getPageTitle();

		if (title.contains("Amazon")) {
			System.out.println("TITLE PASSED");
		} else {
			System.out.println("TITLE FAILED");
		}

		// Get current url
		String url = brUtil.getPageURL();

		if (url.contains("amazon.in")) {
			System.out.println("URL PASSED");
		} else {
			System.out.println("URL FAILED");
		}

		// Close the browser
		brUtil.closeBrowser();
	}

}
