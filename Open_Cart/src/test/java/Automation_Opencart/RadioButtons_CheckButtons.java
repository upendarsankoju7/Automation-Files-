package Automation_Opencart;

// Import necessary packages for time management, WebDriver, and Web elements
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons_CheckButtons {

    public static void main(String[] args) {

        // Set up the Chrome WebDriver instance to interact with the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Set an implicit wait time of 10 seconds, so WebDriver will wait
        // up to 10 seconds for elements to be available before throwing an error
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the specified URL
        driver.get("https://testautomationpractice.blogspot.com/");

        // Maximize the browser window for better visibility and to avoid hidden
        // elements
        driver.manage().window().maximize();

        // Locate the checkbox element for 'Sunday' using its XPath
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='sunday']"));

        // Print the selection status of the checkbox before clicking it
        System.out.println("Before Selection of CheckBox: " + checkbox.isSelected());

        // Click the checkbox element to change its selection status
        driver.findElement(By.xpath("//input[@id='sunday']")).click();

        // Print the selection status of the checkbox after clicking it
        System.out.println("After Selection of CheckBox: " + checkbox.isSelected());

        // Optional: Close the browser after the operation
        // driver.quit();

        

        
    }

}
