package Automation_Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_Host {

    public static void main(String[] args) throws InterruptedException {	
        // Set up WebDriver for Chrome
        WebDriver driver = new ChromeDriver();

        // Navigate to the target web application
        driver.get("https://books-pwakit.appspot.com/");
        
        // Maximize the browser window for better visibility
        driver.manage().window().maximize();

        // Attempting to directly locate the shadow DOM element will fail
        // This line is commented out as it throws NoSuchElementException
        // driver.findElement(By.cssSelector("#input")).sendKeys("WELCOME");

        // Handle shadow DOM element
        // Shadow DOM elements cannot be accessed directly. Instead, we must first access their shadow root.
        SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
        
        // Pause execution for 1 second to ensure the element is rendered
        Thread.sleep(1000);

        // Locate and interact with the shadow DOM element inside the shadow root
        shadow.findElement(By.cssSelector("#input")).sendKeys("WELCOME");

        // (Optional) Add additional actions or validations here

        // End of the program
    }
}
