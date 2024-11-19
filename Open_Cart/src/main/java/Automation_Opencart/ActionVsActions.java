package Automation_Opencart;

import org.openqa.selenium.By; // Importing By class for element locating
import org.openqa.selenium.WebDriver; // Importing WebDriver interface for controlling the browser
import org.openqa.selenium.WebElement; // Importing WebElement interface for working with elements
import org.openqa.selenium.chrome.ChromeDriver; // Importing ChromeDriver for Chrome browser automation
import org.openqa.selenium.interactions.Action; // Importing Action interface
import org.openqa.selenium.interactions.Actions; // Importing Actions class for performing complex interactions

public class ActionVsActions {

    public static void main(String[] args) {
        // Create a new instance of the ChromeDriver to control the browser
        WebDriver driver = new ChromeDriver();
        
        // Open the specified URL in the browser
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        
        // Maximize the browser window for better visibility
        driver.manage().window().maximize();
        
        // Locate the button element which will be right-clicked
        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        
        // Create an instance of the Actions class to perform actions on elements
        Actions act = new Actions(driver);
        
        // Create a context-click action (right-click) on the button and store it in a variable
        Action myaction = act.contextClick(button).build(); // build() is used to create the action
        
        
        
        // Perform the action (right-click) on the button
        myaction.perform(); // The action is executed here
        
        // Close the browser after the action
//        driver.quit(); // It's a good practice to close the browser when done
    }
}
