package Automation_Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Bar {

    public static void main(String[] args) throws InterruptedException {
        // Setting up ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Launching the URL and maximizing the browser window
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        
        // Creating JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        // Scroll down to the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        
        // Printing the Y offset to check if scroll to the bottom was successful
        System.out.println(js.executeScript("return window.pageYOffset;")); // Should print the Y offset after scrolling down
        
        // Adding a delay to keep the page scrolled down for a while
        Thread.sleep(5000);
        
        // Scroll up to the top of the page
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        
        // Closing the browser (optional in testing environments)
        //driver.quit();
    }
}
