package TestNG_FrameWork;

// Import necessary TestNG annotations
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/* 
The program demonstrates the usage of TestNG annotations to define test methods 
and setup/teardown methods. The flow is as follows:
1) Login   -- Executed before each test method (@BeforeMethod)
2) Search  -- Test method 1 (@Test)
3) Logout  -- Executed after each test method (@AfterMethod)
4) Login
5) Advanced search  -- Test method 2 (@Test)
6) Logout
*/

public class Annotations_Demo_1 {

    // The method annotated with @BeforeMethod will run before each test method.
    @BeforeMethod
    void login() {
        System.out.println("This is login..");
    }

    // The method annotated with @AfterMethod will run after each test method.
    @AfterMethod
    void logout() {
        System.out.println("This is logout...");
    }

    // Test method 1: Performs a basic search functionality.
    // @Test annotation marks this method as a test case.
    // The "priority=1" ensures this test runs first among tests.
    @Test(priority = 1)
    void search() {
        System.out.println("This is search...");
    }

    // Test method 2: Performs an advanced search functionality.
    // @Test annotation marks this method as a test case.
    // The "priority=2" ensures this test runs after the "search" test.
    @Test(priority = 2)
    void advancedSearch() {
        System.out.println("This is advanced search...");
    }

}
