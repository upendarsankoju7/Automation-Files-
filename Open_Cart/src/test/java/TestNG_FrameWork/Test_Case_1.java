package TestNG_FrameWork;

/*
This class demonstrates a simple TestNG framework setup for testing an application.
It includes three test cases:
1. Opening the application
2. Logging into the application
3. Logging out of the application

Annotations like @Test are used to define test methods, and the priority attribute is 
utilized to control the order of test execution.
*/

import org.testng.annotations.Test;

public class Test_Case_1 {

    // Test case to open the application
    @Test(priority = 1) // Priority ensures this test executes first
    void OpenApplication() {
        System.out.println("Opening The Application");
        // Add assertions or validations here to verify the application is opened successfully
    }

    // Test case to log into the application 
    @Test(priority = 2) // Executes after opening the application
    void LoginApplication() {
        System.out.println("Login Application");
        // Add assertions or validations to confirm successful login
    }

    // Test case to log out of the application
    @Test(priority = 3) // Executes last to simulate logging out
    void LogoutApplication() {
        System.out.println("Logout Application");
        // Add assertions or validations to ensure the user is logged out successfully
    }
}
