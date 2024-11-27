package Automation_Opencart;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_WebTable_1 {

    public static void main(String[] args) {
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Set an implicit wait of 10 seconds to handle element loading time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the test automation practice page
        driver.get("https://testautomationpractice.blogspot.com/");

        // Maximize the browser window to ensure all elements are visible
        driver.manage().window().maximize();

        // Finding the number of rows in the table
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Number of rows: " + rows);

        // Finding the number of columns in the table
        int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of Columns: " + cols);

        // Reading all the data from the table (Optional: Uncomment to print the entire table data)
        /*
        System.out.println("BookName" + "\t" + "Author" + "\t" + "Subject" + "\t" + "Price");
        
        // Loop through each row and column to print the table's content
        for (int r = 2; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        */

        // Reading the book name from the table where the author name is "Mukesh" (Optional: Uncomment to use this)
        /*
        for (int r = 2; r <= rows; r++) {
            // Get the author's name from the second column
            String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]")).getText();
            
            // Check if the author's name matches "Mukesh"
            if (authorName.equals("Mukesh")) {
                // If it matches, get the book name from the first column in the same row
                String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]")).getText();
                System.out.println(bookName + "\t" + authorName);
            }
        }
        */

        // Calculate the total price of all the books in the table
        int total = 0;  // Initialize the total price variable
        for (int r = 2; r <= rows; r++) {
            // Retrieve the price from the 4th column in the current row
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
            // Convert the price to an integer and add it to the total
            total = total + Integer.parseInt(price);
        }
        
        // Print the total price of all books
        System.out.println("Total Price of the books: " + total); // Expected output: 7100

        // Close the browser session to end the test
        driver.quit();
    }
}
