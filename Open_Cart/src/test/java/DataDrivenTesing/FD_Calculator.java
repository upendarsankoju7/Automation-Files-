package DataDrivenTesing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FD_Calculator {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Initialize WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Set implicit wait timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Open the FD Calculator application
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Define the path to the Excel file
        String filePath = System.getProperty("user.dir") + "\\testdata\\caldata.xlsx";
        
        // Get the total number of rows in the Excel sheet
        int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
        
        // Iterate through each row in the Excel file
        for (int i = 1; i <= rows; i++) {
            // 1) Read test data from Excel sheet
            String pric = ExcelUtils.getCellData(filePath, "Sheet1", i, 0); // Principal amount
            String rateofinterest = ExcelUtils.getCellData(filePath, "Sheet1", i, 1); // Interest rate
            String per1 = ExcelUtils.getCellData(filePath, "Sheet1", i, 2); // Tenure value
            String per2 = ExcelUtils.getCellData(filePath, "Sheet1", i, 3); // Tenure period (e.g., months/years)
            String fre = ExcelUtils.getCellData(filePath, "Sheet1", i, 4); // Frequency of compounding
            String exp_mvalue = ExcelUtils.getCellData(filePath, "Sheet1", i, 5); // Expected maturity value
            
            // 2) Pass the test data into the application
            driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric); // Enter principal amount
            driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest); // Enter interest rate
            driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1); // Enter tenure
            
            // Select tenure period (months/years) from dropdown
            Select perdrp = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
            perdrp.selectByVisibleText(per2);
            
            // Select compounding frequency from dropdown
            Select fredrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
            fredrp.selectByVisibleText(fre);
            
            // Click the calculate button
            driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
            
            // Validation: Get the actual maturity value displayed
            String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
            
            // Compare actual and expected maturity values
            if (Double.parseDouble(exp_mvalue) == Double.parseDouble(act_mvalue)) {
                // Test passed: Write "Passed" to Excel and fill cell with green color
                System.out.println("Test passed");
                ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
                ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);
            } else {
                // Test failed: Write "Failed" to Excel and fill cell with red color
                System.out.println("Test failed");
                ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
                ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
            }
            
            // Wait for 3 seconds before clearing the fields
            Thread.sleep(3000);
            
            // Click the clear button to reset the form for the next iteration
            driver.findElement(By.xpath("//img[@class='PL5']")).click();
        } // End of for loop
        
        // Close the browser
        driver.quit();
    }
}
