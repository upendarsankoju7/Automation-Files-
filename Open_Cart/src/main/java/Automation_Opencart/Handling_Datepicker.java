package Automation_Opencart;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Datepicker {

    // Other methods remain the same...

    public static void main(String[] args) {

        // Set up the Chrome WebDriver and configure implicit wait
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the URL with the date picker widget
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Define the required year, month, and date to be selected
        String requiredYear = "2025";
        String requiredMonth = "June";
        String requiredDate = "15";

        // Explicit wait to ensure the frame is available
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        try {
            // Wait for the frame to be present before switching to it
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("frame-one796456169")));

            // Click on the calendar icon to open the date picker
            driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

            // Call the method to select the desired date
            selectDate(driver, requiredYear, requiredMonth, requiredDate);
        } catch (Exception e) {
            System.out.println("Frame not found or another error occurred: " + e.getMessage());
        } finally {
            // Close the browser after the date selection
            driver.quit();
        }
    }

	private static void selectDate(WebDriver driver, String requiredYear, String requiredMonth, String requiredDate) {
		// TODO Auto-generated method stub
		
	}
}
