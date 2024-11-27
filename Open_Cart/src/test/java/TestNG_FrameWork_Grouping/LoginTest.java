package TestNG_FrameWork_Grouping;

import org.testng.annotations.Test; // Importing TestNG annotations

public class LoginTest {

    // Class definition for grouping and organizing login tests
    public class LoginTests {

        // Test case for logging in via email
        // Priority 1 ensures this test runs first within the same group
        // Grouped under "sanity" for grouping similar tests
        @Test(priority = 1, groups = {"sanity"})
        void loginByEmail() {
            System.out.println("This is login by email..");
        }

        // Test case for logging in via Facebook
        // Priority 2 ensures this test runs after priority 1 tests within the same group
        // Also grouped under "sanity"
        @Test(priority = 2, groups = {"sanity"})
        void loginByFacebook() {
            System.out.println("This is login by facebook..");
        }

        // Test case for logging in via Twitter
        // Priority 3 ensures this test runs after priority 2 tests within the same group
        // Grouped under "sanity"
        @Test(priority = 3, groups = {"sanity"})
        void loginByTwitter() {
            System.out.println("This is login by twitter..");
        }
    }
}
	