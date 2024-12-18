package Automation_Opencart;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;

public class Wait_Method_3 {

    public static void main(String[] args) {
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Adding implicit wait for all elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Declaration Of The FluentWait Method
        Wait<WebDriver> myWait = new FluentWait<WebDriver>(driver)
               .withTimeout(Duration.ofSeconds(10))
               .pollingEvery(Duration.ofSeconds(2))
               .ignoring(NoSuchElementException.class);
        
        // Open the URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        
        // Using FluentWait with Function to wait for the Username field
        WebElement usernameField = myWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//input[@placeholder='Username']"));
            }
        });
        
        // Enter the username after waiting for the element
        usernameField.sendKeys("Admin");
        
        // Close the browser
      //  driver.quit();
    }
}
