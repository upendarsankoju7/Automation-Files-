package Automation_Opencart;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoards_Actions {

    public static void main(String[] args) {
        // Initialize WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Set an implicit wait for elements to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Navigate to the URL of the text compare tool
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize(); // Maximize the browser window
        
        // Locate the first text area and enter text "WELCOME"
        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME");
        
        // Initialize Actions class to handle keyboard actions
        Actions act = new Actions(driver);
        
        // CTRL + A - Select all text in the first text area
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        
        // CTRL + C - Copy the selected text to the clipboard
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        
        // TAB - Move focus from the first text area to the second text area
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        
        // CTRL + V - Paste the text from the clipboard into the second text area
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
        
        // Close the browser session
       //driver.quit();
    }
}
