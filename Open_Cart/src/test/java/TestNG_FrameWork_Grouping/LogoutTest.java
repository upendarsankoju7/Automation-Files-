package TestNG_FrameWork_Grouping;

import org.testng.annotations.Test; // Importing TestNG annotations

public class LogoutTest {

    // Test case for signing up via email
    // Priority 1 ensures this test runs first within the same group
    // Grouped under "regression" for grouping similar tests
    @Test(priority = 1, groups = {"regression"})
    void signupByEmail() {
        System.out.println("This is signup by email...");
    }

    // Test case for signing up via Facebook
    // Priority 1 means this test will be executed with other tests of the same priority
    // Grouped under "regression"
    @Test(priority = 1, groups = {"regression"})
    void signupByFacebook() {
        System.out.println("This is signup by Facebook...");
    }

    // Test case for signing up via Twitter
    // Priority 1 ensures this test runs in parallel with other tests of the same priority
    // Grouped under "regression"
    @Test(priority = 1, groups = {"regression"})
    void signupByTwitter() {
        System.out.println("This is signup by Twitter...");
    }
}
