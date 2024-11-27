package Automation_Opencart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_Method_1 {

	public static void main(String[] args) throws InterruptedException {
		// Initialize WebDriver instance for Chrome browser
		WebDriver driver = new ChromeDriver();
		
		// Set an implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Navigate to the OrangeHRM login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
	        
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Locate the Username field and input the text "Admin"
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		Thread.sleep(5000);
		
		// Close the browser and end the session
		driver.quit();
	}

}
