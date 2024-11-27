package TestNG_FrameWork_Grouping;

import org.testng.annotations.Test; // Importing TestNG annotations

public class Payment_Method {

    // Test case for payment in Rupees
    // Priority 1 ensures this test runs before other tests with higher priorities
    // Grouped under "sanity", "regression", and "functional" for flexible test execution
    @Test(priority = 1, groups = {"sanity", "regression", "functional"})
    void paymentInRupees() {
        System.out.println("Payment in rupees...");
    }

    // Test case for payment in Dollars
    // Priority 2 ensures this test runs after tests with priority 1
    // Grouped under "sanity", "regression", and "functional" for flexible test execution
    @Test(priority = 2, groups = {"sanity", "regression", "functional"})
    void paymentInDollars() {
        System.out.println("Payment in dollars...");
    }
}
