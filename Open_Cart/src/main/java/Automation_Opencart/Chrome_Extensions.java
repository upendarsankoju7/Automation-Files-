package Automation_Opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class Chrome_Extensions {

    public static void main(String[] args) {
        // Initialize ChromeOptions to customize the browser settings
        ChromeOptions options = new ChromeOptions();

        // Specify the path to the Chrome extension (.crx file)
        // The .crx file is a Chrome extension package that can be added to the browser
        File file = new File("C:\\Automation\\automationFiles\\crx files\\SelectorsHub.crx");

        // Add the Chrome extension to the browser session
        options.addExtensions(file);

        // Initialize the WebDriver with the customized ChromeOptions
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the specified website
        driver.get("https://text-compare.com/");

        // (Optional) Additional automation steps can be added here if needed

        // Close the browser (optional, but recommended to free resources)
        driver.quit();
    }
}
