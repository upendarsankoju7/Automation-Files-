package Automation_Opencart;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Buttons {

    public static void main(String[] args) {
        
        // Initialize a new instance of ChromeDriver to control the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Set an implicit wait time of 10 seconds for finding elements
        // This allows the driver to wait for elements to load before throwing an exception
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Maximize the browser window to ensure all elements are visible
        driver.manage().window().maximize();

        // Open the target URL where radio buttons are located
        driver.get("https://testautomationpractice.blogspot.com/");

        // Locate the "Male" radio button element using its unique ID attribute
        WebElement Male_Radio_Button = driver.findElement(By.xpath("//input[@id='male']"));

        // Locate the "Female" radio button element using its unique ID attribute
        WebElement Female_Radio_Button = driver.findElement(By.xpath("//input[@id='female']"));

        // Print the selection status of each radio button before any clicks
        System.out.println("Before Selection:");
        System.out.println("Status of Male Radio Button: " + Male_Radio_Button.isSelected());
        System.out.println("Status of Female Radio Button: " + Female_Radio_Button.isSelected());

        // Select the "Male" radio button by clicking it
        Male_Radio_Button.click();

        // Print the selection status of each radio button after the click
        System.out.println("After Selection:");
        System.out.println("Status of Male Radio Button: " + Male_Radio_Button.isSelected());
        System.out.println("Status of Female Radio Button: " + Female_Radio_Button.isSelected());

        // Close the browser after completing the actions
        driver.quit();
    }
}
