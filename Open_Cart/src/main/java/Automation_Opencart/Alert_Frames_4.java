package Automation_Opencart;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Frames_4 {

	public static void main(String[] args) throws InterruptedException {
		// Setting up WebDriver instance for Chrome browser
		WebDriver driver = new ChromeDriver();

		// Setting implicit wait time for finding web elements (10 seconds)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximizing the browser window
		driver.manage().window().maximize();

		// Pausing the execution for 5 seconds (optional delay)
		Thread.sleep(5000);

		// Opening a URL with basic authentication (username and password in the URL)
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	   // The Website will open, bypassing the authentication popup
	}
}
