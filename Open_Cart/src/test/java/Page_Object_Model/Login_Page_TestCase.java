package Page_Object_Model;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Page_TestCase {

    WebDriver driver; // Declare WebDriver instance
    
    // Setup method to initialize the WebDriver and configure browser settings
    @BeforeClass
    void setup() {
        // Initialize ChromeDriver
        driver = new ChromeDriver();

        // Configure implicit wait for the WebDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Maximize the browser window
        driver.manage().window().maximize();
    }

    // Test method for login functionality
    @Test
    void testLogin() {
        // Create an object of the LoginPage class
        Login_Page_2 lp = new Login_Page_2(driver);

        // Call methods to interact with the login page
        lp.setUserName("Admin"); // Set username
        lp.setPassword("admin123"); // Set password
        lp.clickLogin(); // Click login button

        // Verify the page title after login
        Assert.assertEquals(driver.getTitle(), "OrangeHRM", "Title does not match!");
        
        // If you want to wait for a fixed time (e.g., for demonstration purposes)
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace(); // Handle interruption
        }
    }

    // Tear down method to close the browser
    @AfterClass
    void tearDown() {
        // Quit the browser
        driver.quit();
    }
}
