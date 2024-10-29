package Automation_Opencart;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handlers_3 {

	public static void main(String[] args) {
		// Initialize the WebDriver instance for Chrome
		WebDriver driver = new ChromeDriver();

		// Set an implicit wait time of 10 seconds for locating elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Open the OrangeHRM demo login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Locate the username input field and enter "Admin" as the username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		// Click on the link that opens "OrangeHRM, Inc" in a new window
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		// Get a set of all window handles opened by the WebDriver instance
		Set<String> windowsIDs = driver.getWindowHandles();
		
		// Loop through each window handle
		for (String wid : windowsIDs) {
			// Switch to each window and retrieve its title
			String title = driver.switchTo().window(wid).getTitle();
			
			// Print the title of each window to the console
			System.out.println(title);
			
			// If the window title matches "Human Resources Management Software | OrangeHRM"
			if (title.equals("Human Resources Management Software | OrangeHRM")) {
				// Close the window with this specific title
				driver.close();
			}
		}
	}
}
