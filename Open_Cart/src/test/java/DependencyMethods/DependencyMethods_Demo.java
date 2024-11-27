package DependencyMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods_Demo {

    // Test method to simulate opening the application
    @Test(priority = 1)
    void openapp() {
        // Asserts that the application opens successfully
        Assert.assertTrue(true);
    }

    // Test method to simulate user login
    // This method depends on the successful execution of 'openapp'
    @Test(priority = 2, dependsOnMethods = {"openapp"})
    void login() {
        // Asserts that login functionality works correctly
        Assert.assertTrue(true);
    }

    // Test method to simulate search functionality
    // This method depends on the successful execution of 'login'
    @Test(priority = 3, dependsOnMethods = {"login"})
    void search() {
        // Simulating a failed test case for search functionality
        Assert.assertTrue(true);
    }

    // Test method to simulate advanced search functionality
    // This method depends on the successful execution of both 'login' and 'search'
    @Test(priority = 4, dependsOnMethods = {"login", "search"})
    void advsearch() {
        // Asserts that advanced search functionality works correctly
        Assert.assertTrue(true);
    }

    // Test method to simulate logout functionality
    // This method depends on the successful execution of 'login'
    @Test(priority = 5, dependsOnMethods = {"login"})
    void logout() {
        // Asserts that logout functionality works correctly
        Assert.assertTrue(true);
    }
}

