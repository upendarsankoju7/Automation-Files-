package Automation_Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Handling_Svg_File {

    public static void main(String[] args) {
        // Set up WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Configure implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Enter the username in the login field
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

        // Enter the password in the password field
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

        // Click on the Login button
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // Identify and interact with SVG elements on the page
        // Uncomment the appropriate xpath depending on the requirement

        // Absolute XPath example (not recommended as it is brittle)
        // driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/svg")).click();

        // Relative XPath using text content
        // driver.findElement(By.xpath("//span[normalize-space()='Time']")).click();

        // XPath to handle SVG element (recommended approach using `name()` for SVG-specific elements)
        driver.findElement(By.xpath("//button[@title='Timesheets']//*[name()='svg']")).click();

        // Add additional code for further actions or validations as needed

        // Close the browser
       // driver.quit();
    }
}
