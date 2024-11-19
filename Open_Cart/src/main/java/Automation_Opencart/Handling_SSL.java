package Automation_Opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_SSL {

    public static void main(String[] args) {
        // Initialize ChromeOptions to customize the browser's settings
        ChromeOptions options = new ChromeOptions();

        // Disable the "Chrome is being controlled by automated software" message
        // The 'excludeSwitches' option removes the automation banner in the browser
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        // Set the option to accept insecure SSL certificates
        // This allows WebDriver to bypass SSL certificate errors such as expired or self-signed certificates
        options.setAcceptInsecureCerts(true);

        // Initialize the WebDriver with the customized ChromeOptions
        WebDriver driver = new ChromeDriver(options);

        // Open the URL that has an expired SSL certificate
        driver.get("https://expired.badssl.com/");

        // Retrieve and print the title of the page to verify successful navigation[
        // The page should open without blocking due to the SSL error
        System.out.println("Title of the page: " + driver.getTitle()); // Outputs: expired.badssl.com

        // Close the browser to free resources (optional, but recommended)
        driver.quit();
    }
}
