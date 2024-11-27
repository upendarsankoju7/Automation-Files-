package Automation_Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Action {

    public static void main(String[] args) {
        // Set up WebDriver and launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the OpenCart demo website
        driver.get("https://demo.opencart.com/");
        
        // Maximize the browser window for better visibility
        driver.manage().window().maximize();

        // Locate the "Desktops" menu item using XPath
        WebElement desktops = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        
        // Locate the "Mac" submenu item under "Desktops"
        WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        // Initialize the Actions class to handle mouse actions
        Actions act = new Actions(driver);

        // Perform mouse hover action over "Desktops", then move to "Mac" and click it
        act.moveToElement(desktops).moveToElement(mac).click().build().perform();
    }
}
