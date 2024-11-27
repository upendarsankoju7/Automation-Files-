package Automation_Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Action {

    public static void main(String[] args) {
        // Set up WebDriver and launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the W3Schools demo page for double-click events
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

        // Maximize the browser window for better visibility
        driver.manage().window().maximize();

        // Switch to the iframe that contains the demo content
        driver.switchTo().frame("iframeResult");

        // Locate the input field for "box1" using its ID
        WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));

        // Locate the input field for "box2" where the text should be copied
        WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));

        // Locate the "Copy Text" button which will be double-clicked
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        // Clear any existing text in "box1"
        box1.clear();
        
        // Enter "WELCOME" text into "box1"
        box1.sendKeys("WELCOME");

        // Initialize Actions class to handle mouse actions
        Actions act = new Actions(driver);

        // Perform a double-click action on the "Copy Text" button
        act.doubleClick(button).perform();

        // Validation: Check if "box2" contains the text "WELCOME"
        String text = box2.getAttribute("value");

        // Print the captured value from "box2" for verification
        System.out.println("Captured value is: " + text);

        // Verify if the text copied successfully and print result
        if (text.equals("WELCOME")) {
            System.out.println("Text copied successfully.");
        } else {
            System.out.println("Text was not copied properly.");
        }
    }
}
