package Automation_Opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito_mode {

    public static void main(String[] args) {
        // Initialize ChromeOptions to customize the browser's settings
        ChromeOptions options = new ChromeOptions();

        // Add the "--incognito" argument to enable incognito mode in Chrome
        // Incognito mode ensures that the browser starts without any cookies, cache, or saved data
        options.addArguments("--incognito");

        // Initialize the WebDriver with the customized ChromeOptions
        WebDriver driver = new ChromeDriver(options);

        // Open the URL of the OpenCart demo site
        driver.get("https://demo.opencart.com/");

        // Retrieve the actual title of the webpage
        String act_title = driver.getTitle();

        // Verify if the title matches the expected value "Your Store"
        // If it matches, the test passes; otherwise, it fails
        if (act_title.equals("Your Store")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        // Close the browser (optional, but recommended to free resources)
        //driver.quit();
    }
}
