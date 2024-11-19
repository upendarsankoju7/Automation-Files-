package Automation_Opencart;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Frames_2 {

    public static void main(String[] args) throws InterruptedException {
        // Initialize ChromeDriver for Selenium WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Set an implicit wait of 10 seconds for locating elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Maximize the browser window for better visibility
        driver.manage().window().maximize();
        
        // Navigate to the webpage containing JavaScript alerts
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Locate and click the button to trigger the JavaScript prompt alert
        driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Prompt\"]")).click();
        
        // Pause for 3 seconds to ensure the alert is displayed
        Thread.sleep(3000);  
        
        // Switch the context to the alert window
        Alert myalert = driver.switchTo().alert();
        
        // Print the alert message to the console
        System.out.println("Text Message On Alert: " + myalert.getText());

        // Enter text into the JavaScript prompt
        myalert.sendKeys("Welcome Upendar");
        
        // Accept the alert (equivalent to clicking 'OK')
        myalert.accept();
        
        // Retrieve the result text displayed on the page after handling the alert
        String res = driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();

        // Validate if the result contains the expected input text
        if (res.contains("Welcome Upendar")) {
            System.out.println("Your Test Case Passes");
        } else {
            System.out.println("Your Test Case Failed");
        }
        
        // Optionally, close the browser session
        // driver.quit();
    }
}
