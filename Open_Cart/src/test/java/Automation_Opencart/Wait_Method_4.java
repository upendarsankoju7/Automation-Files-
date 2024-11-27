package Automation_Opencart;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_Method_4 {

    public static void main(String[] args) throws MalformedURLException {	
        // Main method to execute the program
        
        // Set up WebDriver instance to use Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window for better visibility
        driver.manage().window().maximize();
        
        // Navigate to the OpenCart demo website
        driver.navigate().to("https://demo.opencart.com/");
        
        // Navigate to the OrangeHRM demo website login page
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Go back to the previous page, which is the OpenCart demo site
        driver.navigate().back();
        
        // Print the current URL after going back to verify navigation
        System.out.println("Url-Name-1: " + driver.getCurrentUrl());
        
        // Move forward to the OrangeHRM demo site again
        driver.navigate().forward();
        
        // Print the current URL after moving forward to verify navigation
        System.out.println("Url-Name-2: " + driver.getCurrentUrl());

        // Refresh the current page
        driver.navigate().refresh();
        
        // Optional: Close the browser after execution
        // Uncomment the line below if you want to close the browser at the end
        // driver.quit();	
    }
}
