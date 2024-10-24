	package Automation_Opencart;
	
	// Importing required Selenium libraries
	import org.openqa.selenium.By; // Provides mechanisms to locate elements on a web page
	import org.openqa.selenium.WebDriver; // WebDriver interface for browser automation
	import org.openqa.selenium.chrome.ChromeDriver; // ChromeDriver class to automate Chrome browser
	
	public class Css_Selectors_1 {
	
	    public static void main(String[] args) {
	        // Main method - Entry point of the Java program
	
	        // Creating an instance of ChromeDriver to launch Chrome browser
	        WebDriver driver = new ChromeDriver(); 
	        
	        // Navigating to the Amazon India homepage
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
	        
	        // Maximizing the browser window to full screen
	        driver.manage().window().maximize(); 
	        
	        // -------- Examples of CSS Selectors --------
	        
	        // 1. Tag and ID CSS Selector: "tag#id" 
	        // Example: Using CSS selector with tag <input> and ID 'twotabsearchtextbox'
	        // driver.findElement(By.cssSelector("input#")).sendKeys("Iphone");
	        
	        // 2. ID-only CSS Selector: "#id" 
	        // Example: Targeting the same search box using only its ID
	        // driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Watch");
	        
	        // 3. Tag and Class CSS Selector: "tag.class"
	        // Example: Using CSS selector with tag <input> and class 'small-searchterms'
	        // driver.findElement(By.cssSelector("input.small-searchterms")).sendKeys("Iphone");
	        
	        // 4. Class-only CSS Selector: ".class"
	        // Example: Using only class name to locate the element
	        // driver.findElement(By.cssSelector(".small-searchterms")).sendKeys("Iphone");
	        
	        // 5. Tag and Attribute Selector: "tag[attribute='value']"
	        // Example: Using <input> tag and 'placeholder' attribute to locate the search box
	        //driver.findElement(By.cssSelector("input[placeholder='Search Store']")).sendKeys("Macbook");
	        
	        //Tag Attribute & ClassName 
	        
	         // driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Watches");
	         driver.findElement(By.cssSelector("input#oxd-input")).sendKeys("Hello");
	         
	
	        // Uncomment when you want to close the browser after execution.
	        // driver.quit(); 
	    }
	}
