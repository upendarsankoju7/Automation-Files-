package Automation_Opencart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class RadioButtons_CheckButtons_1 {

    public static void main(String[] args) throws InterruptedException {

        // Set the path to the ChromeDriver executable if required (only if not in PATH).
        // Uncomment the following line and specify the path if needed:
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize a new instance of ChromeDriver to control the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Set an implicit wait time of 10 seconds for finding elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Maximize the browser window to ensure all elements are visible
        driver.manage().window().maximize();

        // Open the target URL where checkboxes are located
        driver.get("https://testautomationpractice.blogspot.com/");

        // Locate all checkbox elements on the page using XPath and store them in a list
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        // Print the number of checkboxes found on the page
        System.out.println("Number of CheckBoxes = " + checkBoxes.size());

        // Check if any checkboxes were found before proceeding
        if (checkBoxes.isEmpty()) {
            System.out.println("No checkboxes found on the page.");
        } else {
            
            // Uncomment one of the following sections to perform a specific checkbox operation:

            // 1. Select all checkboxes
            /*
            for (int i = 0; i < checkBoxes.size(); i++) {
                checkBoxes.get(i).click();
            }
            */

            // 2. Select all checkboxes using an enhanced for loop
            /*
            for (WebElement checkbox : checkBoxes) {
                checkbox.click();
            }
            */

            // 3. Select the last 3 checkboxes
            /*
            for (int i = checkBoxes.size() - 3; i < checkBoxes.size(); i++) {
                checkBoxes.get(i).click();
            }
            */

            // 4. Select the first 3 checkboxes
            /*
            for (int i = 0; i < 3; i++) {
                checkBoxes.get(i).click();
            }
            */

            // 5. Toggle all checkboxes (deselect if selected, select if not selected)
            /*
            for (WebElement checkbox : checkBoxes) {
                if (checkbox.isSelected()) {
                    checkbox.click(); // Deselect if already selected
                } else {
                    checkbox.click(); // Select if not selected
                }
            }
            */

            // 6. Select specific checkboxes by index (e.g., 2nd, 4th, and 7th checkboxes)
            for (int i = 0; i < checkBoxes.size(); i++) {
                if (i == 1 || i == 3 || i == 6) {
                    checkBoxes.get(i).click();
                }
            }

            // Optional: Wait for a few seconds to observe the checkbox selections in the browser
            Thread.sleep(6000);
        }

        // Close the browser after completing the task
        driver.close(); 
    }
}
