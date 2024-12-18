package Automation_Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Demo {

    public static void main(String[] args) {
        // Set up the Chrome WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Open the webpage with the price range slider
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize(); // Maximize the browser window for better visibility
    
        // Create an Actions object to handle complex mouse interactions
        Actions act = new Actions(driver);
        
        // Locate the minimum slider element
        WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        
        // Print the default location of the minimum slider
        System.out.println("Default Location of the min slider: " + min_slider.getLocation()); // e.g., (58, 249)
        
        // Move the minimum slider by a specified offset (100 pixels to the right)
        act.dragAndDropBy(min_slider, 100, 0).perform();
        
        // Print the new location of the minimum slider after movement
        System.out.println("Location of the min slider after moving: " + min_slider.getLocation()); // e.g., (157, 249)

        // Locate the maximum slider element
        WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
        
        // Print the default location of the maximum slider
        System.out.println("Default Location of the max slider: " + max_slider.getLocation()); // e.g., (876, 249)
        
        // Move the maximum slider by a specified offset (-100 pixels to the left)
        act.dragAndDropBy(max_slider, -100, 0).perform();
        
        // Print the new location of the maximum slider after movement
        System.out.println("Location of the max slider after moving: " + max_slider.getLocation()); // e.g., (778, 249)

        // Close the browser after completing the slider actions
       //driver.quit();
    }
}
