package Automation_Opencart;

// Importing necessary Selenium classes
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;


public class Automation_Class_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Creating an instance of ChromeDriver to open the browser
        // ChromeDriver driver = new ChromeDriver();

        // Initializing WebDriver with ChromeDriver (can switch to other drivers as needed)
           WebDriver driver = new ChromeDriver();

        // Uncomment the below line to use Edge browser instead
        // WebDriver driver = new EdgeDriver();

        // Opening the Flipkart website using the get() method
           driver.get("https://demo.opencart.com/");
        
        // Storing the actual title of the webpage in a variable
            String act_title = driver.getTitle();

        // Verifying if the actual title matches the expected title
         if (act_title.equals("Your Store")) {
            System.out.println("Test Passed");  // If titles match, print "Test Passed"
         } else {
            System.out.println("Test Failed");  // If titles don't match, print "Test Failed"
         }

        // Closing the browser session using quit() to free up resources
        //driver.quit();
    }
}
