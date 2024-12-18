package Automation_Opencart;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1) Link    href="https://xyz.com"

2) https://xyz.com ---> server ---> status code

3)  status code>=400   broken link
 status code <400   not a broken link

 */


public class Broken_Links {

    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/"); // Open the target website
        driver.manage().window().maximize();

        // Capture all the links from the website
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: " + links.size());

        int noOfBrokenLinks = 0; // Counter for broken links

        for (WebElement linkElement : links) {
            // Retrieve href attribute value from each link
            String hrefattValue = linkElement.getAttribute("href");

            // Check if the href attribute is null or empty
            if (hrefattValue == null || hrefattValue.isEmpty()) {
                System.out.println("href attribute value is null or empty. So Not possible to check.");
                continue; // Skip this iteration
            }

            // Send request to the server and validate the response
            try {
                // Convert href string to URL
                URL linkURL = new URL(hrefattValue);

                // Open connection to the server
                HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
                conn.connect(); // Send the request to the server

                // Check the response code
                if (conn.getResponseCode() >= 400) {
                    System.out.println(hrefattValue + " =====> Broken link");
                    noOfBrokenLinks++;
                } else {
                    System.out.println(hrefattValue + " =====> Not a broken link");
                }
            } catch (Exception e) {
                // Handle exceptions gracefully, such as malformed URL or server issues
                System.out.println(hrefattValue + " =====> Exception occurred while checking this link.");
            }
        }

        // Print the total number of broken links
        System.out.println("Number of broken links: " + noOfBrokenLinks);

        // Close the driver
        ///driver.quit();
    }
}
