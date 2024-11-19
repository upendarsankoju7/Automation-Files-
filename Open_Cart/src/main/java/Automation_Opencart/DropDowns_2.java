package Automation_Opencart;

// Import necessary classes for Selenium WebDriver functionality
import java.time.Duration; // Import Duration class for time-related operations
import java.util.List; // Import List for handling collections of elements
import org.openqa.selenium.By; // Import By class to locate elements
import org.openqa.selenium.WebDriver; // Import WebDriver interface
import org.openqa.selenium.WebElement; // Import WebElement class to interact with web elements
import org.openqa.selenium.chrome.ChromeDriver; // Import ChromeDriver for controlling Chrome browser

public class DropDowns_2 {

    public static void main(String[] args) {

        // Initialize the ChromeDriver instance, which opens the Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Set an implicit wait of 10 seconds, allowing elements to load before any actions are attempted
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Navigate to the website containing a multi-select dropdown example
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        
        // Maximize the browser window for better visibility and ease of automation
        driver.manage().window().maximize();
        
        // Locate the dropdown button by its class name and store it in a WebElement variable
        WebElement dropdownButton = driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]"));
        
        // Click on the dropdown button to reveal all options
        dropdownButton.click();

        // Find all options within the dropdown by locating the labels within the dropdown's unordered list
        List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
        
        // Print the total number of options available in the dropdown
        System.out.println("Number of Options: " + options.size());
        
        // Loop through the list of options and print each option's text
        /* Uncomment this block to print all option texts
        for (WebElement Op : options) {
            // Output the text of each option
            System.out.println(Op.getText());    
        }
        */
        
        // Iterate through each option in the dropdown
        for (WebElement op : options) {
            // Get the text of the current option
            String option = op.getText();
            
            
        // Check if the option is one of the specified values (Java, Python, MySQL)
        
            if  (option.equals("Java") || option.equals("Angular") || option.equals("MySql")) {
                // Click the option if it matches
                op.click();  // Corrected click method to select the option
            }
        }	
       
        // Close the browser and terminate the WebDriver instance
       // driver.quit();
    }
}
