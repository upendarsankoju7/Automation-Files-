package Automation_Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Uploading {

    public static void main(String[] args) {
        // Initialize WebDriver (using ChromeDriver for Chrome browser)
        WebDriver driver = new ChromeDriver();

        // Open the target URL for file upload
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize(); // Maximize browser window

        // **Single File Upload**
        // Upload a single file (Test1.txt) by sending the file path to the file input element
        /*
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Automation\\automationFiles\\Test1.txt");
        
        // Validate if the file upload was successful by checking the displayed file name
        if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Test1.txt")) {
            System.out.println("File is successfully uploaded");
        } else {
            System.out.println("Upload failed.");
        }
        */

        // **Multiple File Upload**
        // Define paths for multiple files
        String file1 = "C:\\Automation\\automationFiles\\Test1.txt";
        String file2 = "C:\\Automation\\automationFiles\\Test2.txt";
        
        // Upload multiple files by sending their paths separated by a newline character
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);
        
        // Count the number of files uploaded by checking the items in the file list
        int noOfFilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
        
        // **Validation 1 - Number of Files Uploaded**
        // Check if exactly two files were uploaded
        if (noOfFilesUploaded == 2) {
            System.out.println("All files are uploaded");
        } else {
            System.out.println("Files are not uploaded or incorrect files uploaded");
        }
        
        // **Validation 2 - File Name Verification**
        // Check if the uploaded files' names match the expected file names
        if (driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Test1.txt")
                && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Test2.txt")) {
            System.out.println("File names match.");
        } else {
            System.out.println("File names do not match.");
        }
        
        // Close the browser session
       //  driver.quit();
    }
}
