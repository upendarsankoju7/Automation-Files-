package Automation_Opencart;

import java.time.Duration; // Import the Duration class to specify timeouts
import org.openqa.selenium.By; // Import By class for locating elements
import org.openqa.selenium.WebDriver; // Import WebDriver interface
import org.openqa.selenium.chrome.ChromeDriver; // Import ChromeDriver for Chrome browser automation

public class Alerts_Frames_1 {

    public static void main(String[] args) throws InterruptedException { // Main method with exception handling for InterruptedException
        // Set up ChromeDriver for Selenium WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Set an implicit wait for finding elements (10 seconds)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the test website containing JavaScript alerts
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
     
        /*  
          // Locate and click the button to trigger a simple JavaScript alert
          driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Alert\"]")).click(); 
          
          // Switch to the alert and accept it (click "OK")
          driver.switchTo().alert().accept();
        */
        
        // Locate and click the button to trigger a JavaScript confirm alert
        driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Confirm\"]")).click();
        
        // Wait for 3 seconds to observe the alert (using Thread.sleep for demonstration purposes)
        Thread.sleep(3000); 
        
       // driver.switchTo().alert().accept(); // Accept the alert (click "OK" button)
        driver.switchTo().alert().dismiss(); // Dismiss the alert (click "Cancel" button)
        
        // Optional: Close the driver after completing the test
        // driver.quit();
    }
}
