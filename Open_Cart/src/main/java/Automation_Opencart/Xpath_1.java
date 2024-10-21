package Automation_Opencart;  // Package declaration for organizing related classes and interfaces

// Importing necessary Selenium libraries for browser automation
import org.openqa.selenium.By;  // Provides methods to locate elements within a web page
import org.openqa.selenium.WebDriver;  // Interface to control a browser instance
import org.openqa.selenium.chrome.ChromeDriver;  // Class to instantiate a Chrome browser

public class Xpath_1 {  // Class declaration

    // Main method – Entry point of the Java program
    public static void main(String[] args) {

        // Set the path to the ChromeDriver executable (required if not set in the system PATH)
        // Example: System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        // This line is needed if the driver is not already configured in your environment variables.

        // Instantiate a new ChromeDriver object to launch a Chrome browser
        WebDriver driver = new ChromeDriver();  

        // Navigate to the OpenCart demo website using the get() method
        driver.get("https://demo.opencart.com/");

        // Maximize the browser window to ensure all elements are visible and accessible
        driver.manage().window().maximize();

        // **Example 1: XPath with a Single Attribute**
        // Locate the search input field using the 'placeholder' attribute 
        // and enter the text "iphone" in the search field.
        // driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iphone"); 

        // **Example 2: XPath with Multiple Attributes**
        // Use both 'placeholder' and 'name' attributes to accurately locate the search input field.
        // This approach helps to avoid ambiguity if multiple elements share similar attributes.
        // driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("MacBook"); 

        // **Example 3: Using 'and' Operator in XPath**
        // Locate the search input field with both 'placeholder' and 'name' attributes using 'and' operator.
        // The text "MacBook" will be entered only if both conditions are satisfied.
        // driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("MacBook");

        // **Example 4: Using 'or' Operator in XPath**
        // Locate the search field using either 'placeholder' or a non-existent 'name' attribute 'searching'.
        // The 'or' operator matches any of the conditions; if one is valid, the input is located.
        // driver.findElement(By.xpath("//input[@placeholder='Search' or @name='searching']")).sendKeys("MacBook");

        // **Using text() Method in XPath**
        // Locate an element by matching its exact text content and click on it (in this case, "MacBook").
        // driver.findElement(By.xpath("//*[text()='MacBook']")).click();

        // **Check Element Display Status**
        // Verify if an element with the text 'Featured' is displayed on the page.
        // boolean displayStatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
        // System.out.println(displayStatus);  // Print the status to the console.

        // **XPath with contains() Method**
        // Locate an input field whose 'placeholder' attribute contains the substring 'Sea'.
        // driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Iphone");

        // **XPath with starts-with() Method**
        // Locate an input field whose 'placeholder' attribute starts with 'Sea'.
        // driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Iphone");

        // **Chained XPath Example**
        // Locate an image element inside a parent 'div' with id='logo' using a chained XPath.
        boolean status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();

        // Print the display status of the element to the console.
        System.out.println(status);  // Output: true if the element is displayed, false otherwise.

        // **Close the Browser**
        // It's good practice to close the browser after test execution to free up resources.
        // Uncomment the line below to close the browser after execution.
        // driver.quit();
    }
}
