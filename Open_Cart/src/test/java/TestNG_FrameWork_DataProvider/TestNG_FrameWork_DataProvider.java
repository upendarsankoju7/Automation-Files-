package TestNG_FrameWork_DataProvider;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_FrameWork_DataProvider {
    WebDriver driver; // Declare WebDriver instance

    /**
     * Set up the WebDriver before running the tests.
     */
    @BeforeClass
    void setup() {
        // Initialize the ChromeDriver
        driver = new ChromeDriver();
        // Set an implicit wait timeout to handle dynamic elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /**
     * Test login functionality with provided credentials.
     * @param email - Email address to test
     * @param pwd - Password to test
     */
    @Test(dataProvider = "dp")
    void testLogin(String email, String pwd) throws InterruptedException {
        // Navigate to the login page
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize(); // Maximize browser window
        
        // Enter email in the email input field
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        // Enter password in the password input field
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
        // Click on the login button
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        // Check if the 'My Account' section is displayed after login
        boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();

        // If login is successful
        if (status == true) {
            // Click on the Logout button
            driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
            Assert.assertTrue(true); // Assert test as passed
        } else {
            // If login fails, mark the test as failed
            Assert.fail();
        }
    }

    /**
     * Close the browser after all tests are executed.
     */
    @AfterClass
    void tearDown() {
        driver.close(); // Close the browser instance
    }

    /**
     * Provide test data for login tests.
     * The 'indices' parameter selects specific sets of test data.
     * @return A 2D array of email and password combinations
     */
    @DataProvider(name = "dp", indices = {0, 3, 4})
    Object[][] loginData() {
        // Array containing email and password test data
        Object data[][] = {   
            {"abc@gmail.com", "test123"},
            {"xyz@gmail.com", "test012"},
            {"john@gmail.com", "test@123"},
            {"pavanol123@gmail.com", "test@123"},
            {"johncanedy@gmail.com", "test"},
        };
        return data; // Return the test data array
    }
}
