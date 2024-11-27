package Automation_Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_Action {

    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver and launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the jQuery Context Menu demo page
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        
        // Maximize the browser window for better visibility
        driver.manage().window().maximize();

        // Locate the button element to right-click on using XPath
        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        // Initialize the Actions class to handle mouse actions
        Actions act = new Actions(driver);

        // Perform a right-click (context click) action on the button
        act.contextClick(button).perform();

        // Click on the "Copy" option from the context menu
        driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();

        // Pause for 5 seconds to observe the action
        Thread.sleep(5000);

        // Switch to the alert pop-up and accept it to close
        driver.switchTo().alert().accept();
    }
}
