package TestNG_FrameWork;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
This class demonstrates the usage of @BeforeClass and @AfterClass annotations in TestNG.
The execution flow is as follows:
1) Login operation is performed before any test methods are executed (@BeforeClass).
2) Search operation is performed as a test case (@Test with priority 1).
3) Advanced search operation is performed as another test case (@Test with priority 2).
4) Logout operation is performed after all test methods have executed (@AfterClass).
*/

public class Before_Class_After_Class {

    // This method will execute before the first test method in the current class is invoked.
    // Used here for setting up preconditions like login.
    @BeforeClass
    void login() {
        System.out.println("This is login...");
    }

    // This method will execute after all the test methods in the current class have been executed.
    // Used here for cleanup actions like logout.
    @AfterClass
    void logout() {
        System.out.println("This is logout...");
    }

    // Test method for performing a basic search operation.
    // This test has priority 1, so it will execute before the advanced search test.
    @Test(priority = 1)
    void search() {
        System.out.println("This is search...");
    }

    // Test method for performing an advanced search operation.
    // This test has priority 2, so it will execute after the basic search test.
    @Test(priority = 2)
    void advacedsearch() {
        System.out.println("This is advanced search...");
    }
}
