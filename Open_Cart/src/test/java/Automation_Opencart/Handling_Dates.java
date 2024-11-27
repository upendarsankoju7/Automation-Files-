package Automation_Opencart;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Dates {

    // Method to select a future date in the date picker
    static void selectFutureDate(WebDriver driver, String year, String month, String date) {
        // Loop to navigate to the specified month and year
        while (true) {
            // Get the currently displayed month and year in the date picker
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            // Break the loop if the desired month and year are displayed
            if (currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }

            // Click the "Next" button to go to the next month
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }

        // Locate all date elements within the date picker
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td/a"));

        // Loop through the dates to find the desired date and click it
        for (WebElement dt : allDates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }

    // Method to select a past date in the date picker
    static void selectPastDate(WebDriver driver, String year, String month, String date) {
        // Loop to navigate to the specified month and year
        while (true) {
            // Get the currently displayed month and year in the date picker
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            // Break the loop if the desired month and year are displayed
            if (currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }

            // Click the "Previous" button to go to the previous month
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
        }

        // Locate all date elements within the date picker
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td/a"));

        // Loop through the dates to find the desired date and click it
        for (WebElement dt : allDates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }

    public static void main(String[] args) {

        // Set up the Chrome driver and configure implicit wait
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the URL containing the date picker
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        // Switch to the frame that contains the date picker
        driver.switchTo().frame(0);

        // Open the date picker by clicking on the input field
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        // Define the desired year, month, and date for selection
        String year = "2022";
        String month = "May";
        String date = "10";

        // Call the method to select a past date based on the defined values
        selectPastDate(driver, year, month, date);

        // Close the browser window after selection
        driver.quit();
    }
}
