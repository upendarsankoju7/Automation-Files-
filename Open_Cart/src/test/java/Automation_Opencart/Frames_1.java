package Automation_Opencart;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_1 {

    public static void main(String[] args) {
        // Setting up WebDriver instance for Chrome browser
        WebDriver driver = new ChromeDriver();

        // Setting implicit wait time for finding web elements (10 seconds)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Maximizing the browser window for better visibility
        driver.manage().window().maximize();

        // Opening the test URL for the frames demo
        driver.get("https://ui.vision/demo/webtest/frames/");

        // Switching to frame 1 and entering text in the input field
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1); // Switching context to frame 1
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello Upendar"); // Typing in frame 1 input field

        // Switching back to the main content before accessing another frame
        driver.switchTo().defaultContent();

        // Switching to frame 2 and entering text in the input field
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2); // Switching context to frame 2
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hello Rowdy"); // Typing in frame 2 input field

        // Switching back to the main content before accessing another frame
        driver.switchTo().defaultContent();

        // Switching to frame 3 and entering text in the input field
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3); // Switching context to frame 3
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Hello Sankoju"); // Typing in frame 3 input field

        // Switching to the inner frame within frame 3
        driver.switchTo().frame(0); // Switching to the first inner frame inside frame 3
        driver.findElement(By.xpath("//div[@id=\"i5\"]//div[@class=\"AB7Lab Id5V1\"]")).click(); // Clicking an element within the inner frame

        // Closing the browser after test execution (optional)
        // Uncomment the line below to close the browser after the test
        // driver.quit();
    }
}




