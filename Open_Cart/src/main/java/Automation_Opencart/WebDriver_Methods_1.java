package Automation_Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class WebDriver_Methods_1 {

    public static void main(String[] args) throws InterruptedException {

        // Create a new instance of ChromeDriver (this will launch the Chrome browser)
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the given URL (OrangeHRM login page)
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        // Wait for 6 seconds to allow the page to fully load
        Thread.sleep(6000);

        // Get and print the title of the current web page
        System.out.println(driver.getTitle());

        // Get and print the current URL of the web page
        System.out.println(driver.getCurrentUrl());

        // Get the current window handle (ID of the window), useful for handling multiple windows
        // String WindowID = driver.getWindowHandle();
        // System.out.println("Window Id:" + WindowID);
        
        // Find the link with text "OrangeHRM, Inc" and click it (this opens a new window/tab)
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        
        // Get all the window handles (IDs) of the browser windows opened by WebDriver
        Set<String> Windowsidf = driver.getWindowHandles();
      
        // Print the set of window handles (useful for identifying windows when handling multiple)
        System.out.println(Windowsidf);
        
        // Close all browser windows opened by WebDriver and end the session
        // driver.quit();
    }
}
