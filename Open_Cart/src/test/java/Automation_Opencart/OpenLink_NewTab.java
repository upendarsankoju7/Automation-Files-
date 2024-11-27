package Automation_Opencart;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLink_NewTab {

    public static void main(String[] args) {
        // Set up ChromeDriver and launch the browser
        WebDriver driver = new ChromeDriver();

        // Navigate to nopCommerce demo website
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // Find the 'Register' link on the home page
        WebElement regLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));

        // Initialize Actions class for handling keyboard and mouse actions
        Actions act = new Actions(driver);

        // Open 'Register' link in a new tab by holding down Control key
        act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();

        // Get the list of window handles after opening the new tab
        List<String> ids = new ArrayList<>(driver.getWindowHandles());

        // Switch to the registration page (newly opened tab)
        driver.switchTo().window(ids.get(1));
        
        // Enter "John KENEDY" into the 'First Name' field on the registration page
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John KENEDY");

        // Switch back to the original home page tab
        driver.switchTo().window(ids.get(0));

        // Enter "TShirts" in the search bar on the home page
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("TShirts");

        // Close the driver after operations
       //driver.quit();
    }
}
