package Automation_Opencart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatros_Class_1 {

    public static void main(String[] args) {
        // Initialize the Chrome WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Open the URL of the demo OpenCart website
        driver.get("https://demo.opencart.com/");
        //name locator 
        // Locate the search box by its 'name' attribute and input the text "Macbook"
        //driver.findElement(By.name("search")).sendKeys("Macbook");

        // Optionally, the above code could have been done using WebElement (commented code below)
        // WebElement search_box = driver.findElement(By.name("search"));
        // search_box.sendKeys("Macbook");
   
        //Id  Locator 
        
        //boolean Status = driver.findElement(By.id("logo")).isDisplayed();
       
       // System.out.println("Logo_Display:" + Status);
       
       
       //link text and PratialLinkText  Only for link items 
       
       //driver.findElement(By.linkText("Tablets")).click(); //link text
       
       //driver.findElement(By.partialLinkText("Tab")).click(); //PratialLinkText
      
        //ClassName Finding the Elements 
        
       //  List <WebElement> HeaderLinks=driver.findElements(By.className("list-inline-item"));
 
      // System.out.println(HeaderLinks.size());
 
        //TagName Finding The Elements 
        
        
        List <WebElement> AnchorTagname=driver.findElements(By.tagName("a"));
            System.out.println(AnchorTagname.size());
           
           List <WebElement> ImageTagname=driver.findElements(By.tagName("img"));
            System.out.println(ImageTagname.size());
        
            driver.quit();
    }
}
