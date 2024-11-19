package Automation_Opencart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown_3 {

    public static void main(String[] args) {
        // Set up ChromeDriver and initialize WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Set implicit wait time for locating elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");

        // Maximize the browser window for better visibility
        driver.manage().window().maximize();

        // Login steps
        // Locate the username field and enter "Admin" as the username
        driver.findElement(By.name("username")).sendKeys("Admin");

        // Locate the password field and enter "admin123" as the password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // Locate and click on the Login button to submit login credentials
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // Navigate to PIM (Personnel Information Management) section after login
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

        // Click on a specific dropdown element in the PIM section
        driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();

        // Use explicit wait to ensure that the dropdown options are fully loaded and visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']//span")));

        // Locate all span elements within the dropdown list with the role 'listbox' and store them in a List
        List<WebElement> elements = driver.findElements(By.xpath("//div[@role='listbox']//span"));

        // Print the count of dropdown elements found
        System.out.println("Number of Elements: " + elements.size());

        // Loop through each element in the list and print the text content
        for (WebElement option : elements) {
            System.out.println(option.getText());
        }

        // Close the browser to clean up
        driver.quit();
    }
}
