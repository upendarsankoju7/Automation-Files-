package Automation_Opencart;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenShot_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		/*
		//1) full page screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\target\\fullpage.png");
		sourcefile.renameTo(targetfile); // copy sourcefile to target file
		*/
		
		//2) capture the screenshot of specific section
		/*WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page	-product-grid']"));
		
		File sourcefile=featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\featredproducts.png");
		sourcefile.renameTo(targetfile); // copy sourcefile to target file
		*/
		/*
		//3) capture the screenshot of webelement
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		sourcefile.renameTo(targetfile); // copy sourcefile to target file
		*/
		
	}

}