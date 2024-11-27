package Automation_Opencart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomIn_ZoomOut {

    public static void main(String[] args) throws InterruptedException {
        // Initialize the WebDriver (using ChromeDriver for Chrome browser)
        WebDriver driver = new ChromeDriver();
        
        // Open the target URL in the browser
        driver.get("https://demo.nopcommerce.com/");
        
        // Maximize the browser window
        driver.manage().window().maximize();
        Thread.sleep(5000);  // Wait for 5 seconds to allow the page to load

        // Create an instance of JavascriptExecutor to execute JavaScript code
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Set the zoom level to 50% using JavaScript
        js.executeScript("document.body.style.zoom='50%'");
        Thread.sleep(5000);  // Wait for 5 seconds to observe the zoom effect

        // Change the zoom level to 80% using JavaScript
        js.executeScript("document.body.style.zoom='80%'");
        Thread.sleep(5000);  // Wait for 5 seconds to observe the zoom effect

        // Close the browser session
       //driver.quit();
    }
}
