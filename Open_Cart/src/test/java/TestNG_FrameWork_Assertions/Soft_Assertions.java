package TestNG_FrameWork_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertions {

    SoftAssert sa; // Declare SoftAssert object (can also be initialized directly in the method)

    //@Test
    void test_hardassertions() {
        System.out.println("Starting test with hard assertions...");
        System.out.println("Performing some actions...");
        
        // Hard assertion: If this assertion fails, execution stops immediately
        Assert.assertEquals(1, 2); // This will fail because 1 is not equal to 2
        
        // The below lines will NOT be executed if the above assertion fails
        System.out.println("This line will not execute if assertion fails.");
        System.out.println("Test completed.");
    }

    @Test
    void test_softassertion() {
        System.out.println("Starting test with soft assertions...");
        System.out.println("Performing some actions...");
        
        // Soft assertion: Execution continues even if this assertion fails
        SoftAssert sa = new SoftAssert(); // Initialize SoftAssert object
        
        sa.assertEquals(1, 2); // This assertion fails, but the test continues
        
        System.out.println("This line executes even if the above assertion fails.");
        System.out.println("Performing additional steps...");
        
        // Mandatory: `assertAll` consolidates all the soft assertion results
        // If any assertion failed, the test is marked as failed at this point
        sa.assertAll();
    }
}
