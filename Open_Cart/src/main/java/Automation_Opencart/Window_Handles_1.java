package Automation_Opencart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles_1 {

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
		Set<String> WindowsIDs = driver.getWindowHandles();
		
		// Uncommented code using List and index-based handling
		/*
		List<String> WindowList = new ArrayList<>(WindowsIDs);  // Convert Set to List for easier access
		
		// Get the parent and child window IDs using index-based access
		String ParentID = WindowList.get(0);
		String ChildrenID = WindowList.get(1);
		
		// Switch to the child window and print its title
		driver.switchTo().window(ChildrenID);
		System.out.println(driver.getTitle());
		
		// Switch back to the parent window and print its title
		driver.switchTo().window(ParentID);
		System.out.println(driver.getTitle());
		*/
		
		// Enhanced for loop to iterate over each window handle ID
		for (String windID : WindowsIDs) {
			// Switch to each window and get its title
			String title = driver.switchTo().window(windID).getTitle();
			
			// Check if the current window is the OrangeHRM main page
			if(title.equals("OrangeHRM")) {
				// Print the URL of the OrangeHRM main page window
				System.out.println(driver.getCurrentUrl());	
			}
		}
	}
}
