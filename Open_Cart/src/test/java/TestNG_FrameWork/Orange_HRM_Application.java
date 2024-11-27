package TestNG_FrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 This TestNG class automates testing for the OrangeHRM application. 
 The test includes the following steps:
 1) Open the application
 2) Verify the presence of the company logo
 3) Perform login
 4) Close the application
*/

public class Orange_HRM_Application {

    WebDriver driver;

    // Test case to open the application
    @Test(priority = 1) // Setting priority to ensure execution order
    void openapp() {
        // Initializing the WebDriver instance for Chrome
        driver = new ChromeDriver();
        
        // Setting an implicit wait of 10 seconds for all element lookups
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Navigating to the OrangeHRM demo login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        // Maximizing the browser window for better visibility
        driver.manage().window().maximize();
    }

    // Test case to verify the presence of the company logo
    @Test(priority = 2) // Executes after the application is opened
    void testLogo() throws InterruptedException {
        // Adding a brief wait to ensure the page loads fully
        Thread.sleep(5000);

        // Locating the company logo and checking its visibility status
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        
        // Printing the logo status in the console
        System.out.println("Logo displayed: " + status);
    }

    // Test case to perform login
    @Test(priority = 3) // Executes after verifying the logo presence
    void testLogin() throws InterruptedException {
        // Entering the username in the respective input field
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        
        // Entering the password in the respective input field
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        
        // Clicking the login button to proceed
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(5000);

    }

    // Test case to close the application
    @Test(priority = 4) // Executes last to ensure the cleanup
    void closeApp() {
        // Closing all browser windows and ending the WebDriver session
        driver.quit();
    }
}
