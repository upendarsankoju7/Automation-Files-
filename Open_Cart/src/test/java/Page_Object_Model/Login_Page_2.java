package Page_Object_Model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_2 {
    WebDriver driver;
    
    // Constructor: Initializes the WebDriver and PageFactory elements for the Login Page
    Login_Page_2(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this); // MANDATORY: Initializes the WebElements annotated with @FindBy
    }
    
    // Locators (elements) for the Login Page
    
    // Locator for the Username input field
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement txt_username;
    
    // Locator for the Password input field
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement txt_password;
    
    // Locator for the Login button
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement btn_login;
    
    // Locator for all anchor links on the page (if needed for additional validation or actions)
    @FindBy(tagName = "a")
    List<WebElement> links;
    
    // Action Methods (representing user interactions with the page)
    
    // Method to set the Username in the Username input field
    public void setUserName(String user)
    {
        txt_username.sendKeys(user); // Sends the username text to the username input field
    }
    
    // Method to set the Password in the Password input field
    public void setPassword(String pwd)
    {
        txt_password.sendKeys(pwd); // Sends the password text to the password input field
    }

    // Method to click the Login button
    public void clickLogin()
    {
        btn_login.click(); // Clicks the Login button
    }
}
