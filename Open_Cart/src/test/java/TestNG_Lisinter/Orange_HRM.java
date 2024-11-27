package TestNG_Lisinter;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Orange_HRM {

    WebDriver driver;

    // Setup method to initialize the WebDriver and open the application URL
    @BeforeClass
    void setup() throws InterruptedException {
        driver = new ChromeDriver(); // Instantiate Chrome WebDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait for elements
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // Navigate to OrangeHRM login page
        driver.manage().window().maximize(); // Maximize browser window
        Thread.sleep(3000); // Pause to ensure page loads completely
    }

    // Test to verify if the logo is displayed on the page
    @Test(priority = 1)
    void testLogo() {
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed(); // Check if logo is displayed
        Assert.assertEquals(status, true); // Assert that the logo is displayed
    }

    // Test to validate the application URL
    @Test(priority = 2)
    void testAppUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/"); // Verify current URL
    }

    // Test to validate the home page title, dependent on the testAppUrl method
    @Test(priority = 3, dependsOnMethods = { "testAppUrl" })
    void testHomePageTitle() {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM"); // Verify the title of the homepage
    }

    // Tear down method to close the browser after tests are executed
    @AfterClass
    void tearDown() {
        driver.quit(); // Quit the browser and end the session
    }
}
