package Automation_Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dargon_DropAction {

    public static void main(String[] args) {
        // Create a new instance of the ChromeDriver to control the browser
        WebDriver driver = new ChromeDriver();
        
        // Open the given URL in the browser
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        
        // Maximize the browser window
        driver.manage().window().maximize();

        // Create an instance of the Actions class to perform drag and drop actions
        Actions act = new Actions(driver);

        // First drag and drop action
        // Locate the element to be dragged (Rome)
        WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
        
        // Locate the target element where the item will be dropped (Italy)
        WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
        
        // Perform the drag and drop action (drag Rome and drop it on Italy)
        act.dragAndDrop(rome, italy).perform();

        // Second drag and drop action
        // Locate the element to be dragged (Washington)
        WebElement washington = driver.findElement(By.xpath("//div[@id='box3']"));
        
        // Locate the target element where the item will be dropped (US)
        WebElement us = driver.findElement(By.xpath("//div[@id='box103']"));
        
        // Perform the drag and drop action (drag Washington and drop it on US)
        act.dragAndDrop(washington, us).perform();
    }
}
