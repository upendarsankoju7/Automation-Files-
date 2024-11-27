package Automation_Opencart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Method_2 {

    public static void main(String[] args) {
        // Create an instance of ChromeDriver (This will open a new Chrome browser window)
        WebDriver driver = new ChromeDriver();

        // Create a WebDriverWait object to wait up to 10 seconds before throwing an exception
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Navigate to the OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Maximize the browser window to ensure all elements are visible
        driver.manage().window().maximize();
        
        // Wait until the Username field is visible (using explicit wait) and store it in a WebElement variable
        WebElement Username = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        
        // Input the username "Admin" into the Username field
        Username.sendKeys("Admin");
       
        // Wait until the Password field is visible and store it in a WebElement variable
        WebElement Password = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));

        // Input the password "admin123" into the Password field
        Password.sendKeys("admin123");
        
        // Wait until the Login button is clickable and store it in a WebElement variable
        WebElement Button = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        
        // Click the Login button
        Button.click();

        // Optional: You can uncomment the following line to close the browser after the task is completed
        // driver.quit();
    }
}
