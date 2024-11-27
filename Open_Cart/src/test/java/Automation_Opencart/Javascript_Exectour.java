package Automation_Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Exectour {

    public static void main(String[] args) {
        // Set up the WebDriver and launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the desired URL
        driver.get("https://testautomationpractice.blogspot.com/");
        
        // Maximize the browser window
        driver.manage().window().maximize();

        // Locate the input box element using XPath
        WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
        
        // Initialize the JavascriptExecutor to interact with elements using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        // Using JavaScript to set text in the input box - alternate for sendKeys()
        js.executeScript("arguments[0].setAttribute('value','John')", inputbox); 
        
        // Locate the radio button element using XPath
        WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));
        
        // Using JavaScript to click the radio button - alternate for click()
        js.executeScript("arguments[0].click()", radiobtn);
        
        // Close the browser
        driver.quit();
    }
}
