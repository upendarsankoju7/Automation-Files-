package TestNG_FrameWork_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_Demo {

    // TestNG test method to validate the title of a webpage or application
    @Test
    void testTitle() {
        // Expected and actual titles for comparison
        String exp_title = "Opencart"; // Define the expected title
        String act_title = "Opencart"; // Define the actual title

        // Commented-out traditional if-else implementation for comparison
        /*
        if(exp_title.equals(act_title)) {
            System.out.println("test passed"); // Prints if titles match
        } else {
            System.out.println("test failed"); // Prints if titles do not match
        }
        */

        // Using TestNG assertion to compare expected and actual titles
        // Uncomment the following line if you want to directly compare titles
        // Assert.assertEquals(exp_title, act_title);

        // Alternative approach using assertTrue with custom condition
        if (exp_title.equals(act_title)) {
            System.out.println("test passed"); // Logs the success message
            Assert.assertTrue(true); // Pass the test case by asserting true
        } else {
            System.out.println("test failed"); // Logs the failure message
            Assert.assertTrue(false); // Fail the test case by asserting false
        }
    }
}
