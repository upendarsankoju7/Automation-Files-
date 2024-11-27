package Automation_Opencart;

import org.openqa.selenium.WebDriver; // Importing WebDriver interface for browser interactions
import org.openqa.selenium.chrome.ChromeDriver; // Importing ChromeDriver for Chrome browser interactions
import org.openqa.selenium.chrome.ChromeOptions; // Importing ChromeOptions to set Chrome-specific options

public class Chorme_Headless_Options {

    public static void main(String[] args) {
        // Creating an instance of ChromeOptions to set browser-specific configurations
        ChromeOptions options = new ChromeOptions();
        
        // Adding an argument to enable headless mode (browser runs in the background without UI)
        options.addArguments("--headless=new");
        
        // Initializing WebDriver with the ChromeDriver and the specified options
        WebDriver driver = new ChromeDriver(options);
        
        // Opening the URL of the OpenCart demo site
        driver.get("https://demo.opencart.com/");
        
        // Fetching the title of the current web page
        String act_title = driver.getTitle();
        
        // Validating if the page title matches the expected value
        if (act_title.equals("Your Store")) {
            System.out.println("Test Passed"); // Test passed if the title matches "Your Store"
        } else {
            System.out.println("Test Failed"); // Test failed otherwise
        }
        
        // Closing the browser and terminating the WebDriver instance
        driver.quit();
    }
}
