package TestNG_FrameWork_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertions {

    @Test
    void test() {
        // TestNG assertions allow you to validate test conditions during execution.
        // If an assertion fails, the test case will be marked as failed, and execution stops immediately (hard assertion).

        // Assert.assertEquals: Verifies that two values are equal
        // Assert.assertEquals("xyz", "xyz"); // Passes because both strings are equal
        // Assert.assertEquals(123, 345);    // Fails because the numbers are not equal

        // Invalid comparisons with Assert.assertEquals:
        // Assert.assertEquals("abc", 123); // This will throw a compilation error because types don't match
        // Assert.assertEquals("123", 123); // Also throws an error due to type mismatch

        // Assert.assertNotEquals: Verifies that two values are NOT equal
        // Assert.assertNotEquals(123, 123);  // Fails because the values are equal
        // Assert.assertNotEquals(123, 345);  // Passes because the values are not equal

        // Assert.assertTrue: Verifies that a condition is true
        // Assert.assertTrue(true);  // Passes because the condition is true
        // Assert.assertTrue(false); // Fails because the condition is false

        // Assert.assertTrue with logical conditions:
        // Assert.assertTrue(1 == 2); // Fails because the condition (1 == 2) is false
        // Assert.assertTrue(1 == 1); // Passes because the condition (1 == 1) is true

        // Assert.assertFalse: Verifies that a condition is false
        // Assert.assertFalse(1 == 2); // Passes because the condition (1 == 2) is false
        // Assert.assertFalse(1 == 1); // Fails because the condition (1 == 1) is true

        // Assert.fail: Forces the test case to fail
        // Assert.fail(); // This method is useful for marking a test as failed intentionally, for example, when a critical error occurs
    }
}
