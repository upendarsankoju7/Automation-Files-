package Automation_Opencart;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns_1 {

    public static void main(String[] args) {
        // Setting up the Chrome WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Setting implicit wait to allow elements to load before actions are performed
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Navigating to the target website
        driver.get("https://testautomationpractice.blogspot.com/");
        
        // Maximizing the browser window
        driver.manage().window().maximize();
        
        // Locating the dropdown element by its XPath
        WebElement countryDropdown = driver.findElement(By.xpath("//select[@id=\"country\"]"));
        
        // Creating a Select object to interact with the dropdown
        Select countrySelector = new Select(countryDropdown);

        // Uncomment the method you want to use to select an option

        // Select option by visible text (e.g., "India")
        // countrySelector.selectByVisibleText("India");
       
        // Select option by value attribute (e.g., "japan")
        // countrySelector.selectByValue("japan");
       
        // Select option by index (e.g., selecting the 3rd option)
        // countrySelector.selectByIndex(2);

        // Retrieving all options available in the dropdown
        List<WebElement> options = countrySelector.getOptions();

        // Print the number of options in the dropdown
        System.out.println("Number of Options = " + options.size());

        // Using a for-each loop to iterate through options and print each one
        System.out.println("Options using for-each loop:");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // Using a normal for loop to iterate through options and print each one
        System.out.println("\nOptions using normal for loop:");
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }

        // Close the browser after performing the action
        driver.quit();
    }
}
