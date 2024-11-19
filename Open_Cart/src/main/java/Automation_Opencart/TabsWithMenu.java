package Automation_Opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsWithMenu {

	public static void main(String[] args) {
		// Set up the WebDriver and specify the path to ChromeDriver (if necessary)
		// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Uncomment if the path needs to be set
		
		// Initialize the WebDriver instance for Chrome
		WebDriver driver = new ChromeDriver();
		
		// Open the OpenCart website in the initial browser tab
		driver.get("https://www.opencart.com/");
		
		// Using Selenium 4 feature to open a new tab
		// Switches to a new tab within the same window
		driver.switchTo().newWindow(WindowType.TAB); // opens a new tab
		
		// Navigate to the OrangeHRM website in the newly opened tab
		driver.get("https://orangehrm.com/");
		
		// Optional: You may add driver.quit() at the end to close all tabs/windows after execution
		// driver.quit();
	}
}
