package Automation_Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods_2 {

	public static void main(String[] args) {
		
		// Set up WebDriver (ChromeDriver) to control the Chrome browser
		WebDriver driver = new ChromeDriver();
		 
		// Maximize the browser window to ensure the web elements are visible
		driver.manage().window().maximize();
		 
		// Navigate to the nopCommerce demo store registration page
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F"); 
		
		// isDisplayed method: Check if the nopCommerce logo is displayed on the page
		// Locate the logo using its XPath
		boolean log = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		
		// isEnabled method: Check if the "First Name" input field is enabled (ready for interaction)
		boolean status = driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).isEnabled();
		 
		// Print the status of the nopCommerce logo (true if displayed, false if not)
		System.out.println("Is logo displayed: " + log);
		
		// Print the status of the "First Name" input field (true if enabled, false if not)
		System.out.println("Is 'First Name' input field enabled: " + status);

		// Find the radio buttons for gender selection (Male and Female)
		WebElement Male_Rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_Rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		// Print whether the Male and Female radio buttons are initially selected
		System.out.println("Is Male selected (before click): " + Male_Rd.isSelected());
		System.out.println("Is Female selected (before click): " + female_Rd.isSelected());
	    
		// Print a message indicating that the Male radio button is about to be clicked
		System.out.println("After clicking Male button:");
		
		// Click the Male radio button
		Male_Rd.click();
	  
	    // Print the status of Male and Female radio buttons after clicking Male
	    System.out.println("Is Male selected (after click): " + Male_Rd.isSelected()); 
	    System.out.println("Is Female selected (after click): " + female_Rd.isSelected());
	    
	    // Locate the Newsletter checkbox using its input element (corrected)
	    WebElement newsletterCheckbox = driver.findElement(By.xpath("//input[@id='Newsletter']"));
	    
	    // isSelected method: Check if the Newsletter checkbox is selected (checked)
	    boolean News_Button = newsletterCheckbox.isSelected();
	    
	    // Print the status of the Newsletter checkbox (true if selected, false if not)
	    System.out.println("Is Newsletter checkbox selected: " + News_Button);  
	}
}
