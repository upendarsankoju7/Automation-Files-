package Automation_Opencart;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_Pagination_Table {
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://demo.opencart.com/admin/index.php");
        driver.manage().window().maximize();
        
        WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
        username.clear();
        username.sendKeys("demo");

        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        password.clear();
        password.sendKeys("demo");
        
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        
        // Close alert window if it appears
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement closeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn-close']")));
            closeButton.click();
        } catch (Exception e) {
            // Alert not present, continue
        }
        
        driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
        
        // Extract the total number of pages
        String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
        int total_pages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));
        
        // Iterate through all pages
        for(int p = 1; p <= total_pages; p++) {
            
            if (p > 1) {
                WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()=" + p + "]"));
                active_page.click();
                Thread.sleep(3000);  // Or use WebDriverWait if needed
            }
            
            // Retrieve data from each row in the table
            int noOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
            
            for(int r = 1; r <= noOfRows; r++) {
                String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]/td[2]")).getText();
                String email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]/td[3]")).getText();
                String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]/td[5]")).getText();
                
                System.out.println(customerName + "\t" + email + "\t" + status);
            }
            
        }
        
        driver.quit();
    }
}
