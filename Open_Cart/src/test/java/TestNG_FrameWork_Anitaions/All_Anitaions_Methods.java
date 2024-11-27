package TestNG_FrameWork_Anitaions;

import org.testng.annotations.*;

public class All_Anitaions_Methods {

    // This method runs once before all tests in the suite.
    @BeforeSuite
    void bs() {
        System.out.println("This is before suite.....");
    }

    // This method runs once after all tests in the suite are executed.
    @AfterSuite
    void as() {
        System.out.println("This is after suite.....");
    }

    // This method runs once before any test method in the <test> tag of the testng.xml file is executed.
    @BeforeTest
    void bt() {
        System.out.println("This is before test method.....");
    }

    // This method runs once after all the test methods in the <test> tag of the testng.xml file are executed.
    @AfterTest
    void at() {
        System.out.println("This is after test method.....");
    }

    // This method runs once before the first method of the current class is invoked.
    @BeforeClass
    void bc() {
        System.out.println("This is before class method.....");
    }

    // This method runs once after all the methods of the current class have been executed.
    @AfterClass
    void ac() {
        System.out.println("This is after class method.....");
    }

    // This method runs before each test method annotated with @Test is executed.
    @BeforeMethod
    void bm() {
        System.out.println("This is before method.....");
    }

    // This method runs after each test method annotated with @Test is executed.
    @AfterMethod
    void am() {
        System.out.println("This is after method.....");
    }

    // This is a test method with a priority of 1. TestNG will execute this test first.
    @Test(priority = 1)
    void tm1() {
        System.out.println("This is Test Method1...");
    }

    // This is a test method with a priority of 2. TestNG will execute this test after the method with priority 1.
    @Test(priority = 2)
    void tm2() {
        System.out.println("This is Test Method2...");
    }
}
