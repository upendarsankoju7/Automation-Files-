package TestNG_FrameWork_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_FrameWork_ParaMeter {
    WebDriver driver; // WebDriver instance

    /**
     * Setup method to initialize the WebDriver based on the browser parameter.
     * @param br - The browser type passed from the TestNG XML file.
     * @param url - The URL to be tested, passed from the TestNG XML file.
     * @throws InterruptedException - For thread sleep.
     */
    @BeforeClass
    @Parameters({"browser", "url"}) // Accept parameters for browser and URL
    void setup(String br, String url) throws InterruptedException {
        // Initialize WebDriver based on the browser parameter
        switch (br.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser"); // Invalid browser case
                return; // Exit if an invalid browser is specified
        }

        // Set an implicit wait for the WebDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Navigate to the specified URL
        driver.get(url);
        // Maximize the browser window
        driver.manage().window().maximize();
        // Pause to ensure the page is fully loaded
        Thread.sleep(5000);
    }

    /**
     * Test to check if the logo is displayed on the page.
     */
    @Test(priority = 1)
    void testLogo() {
        // Check if the logo is displayed
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status, true, "Logo is not displayed!"); // Assert with a message
    }

    /**
     * Test to validate the title of the page.
     */
    @Test(priority = 2)
    void testTitle() {
        // Verify the page title
        Assert.assertEquals(driver.getTitle(), "OrangeHRM", "Title mismatch!");
    }

    /**
     * Test to validate the current URL of the page.
     */
    @Test(priority = 3)
    void testURL() {
        // Verify the current URL
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",
                "URL mismatch!");
    }

    /**
     * Tear down method to close the browser after all tests.
     */
    @AfterClass
    void tearDown() {
        driver.quit(); // Close all browser windows and end the session
    }
}
