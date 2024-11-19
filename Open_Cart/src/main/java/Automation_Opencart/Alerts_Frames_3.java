package Automation_Opencart;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts_Frames_3 {

    public static void main(String[] args) throws InterruptedException {
        
        // Initialize WebDriver instance using ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Set implicit wait to 10 seconds for element loading
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Open the specified URL
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        // Create WebDriverWait instance with a 10-second timeout
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Locate and click the button to trigger a JavaScript prompt alert
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        
        // Pause execution for 5 seconds to allow alert to appear
        Thread.sleep(5000);
        
        // Wait for the alert to be present and switch to it
        Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
        
        // Accept (click "OK") on the alert
        myalert.accept();
        
        // Close the browser (optional step, add if needed)
        driver.quit();
    }
}
