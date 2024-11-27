package TestNG_Lisinter;

//Importing necessary TestNG and ExtentReports libraries
import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

//This class implements ITestListener to generate ExtentReports for TestNG tests
public class ExtentReportManager implements ITestListener {

 // ExtentSparkReporter manages the visual representation of the report
 public ExtentSparkReporter sparkReporter;

 // ExtentReports is used to add common information across the report
 public ExtentReports extent;

 // ExtentTest creates test case entries in the report and tracks test method status
 public ExtentTest test;

 // This method runs when the test suite starts
 public void onStart(ITestContext context) {
     // Specifying the location for the ExtentReport
     sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myReport.html");

     // Configuring the ExtentReport details
     sparkReporter.config().setDocumentTitle("Automation Report"); // Title of the report
     sparkReporter.config().setReportName("Functional Testing"); // Report name
     sparkReporter.config().setTheme(Theme.STANDARD); // Report theme (STANDARD/DARK)

     // Initializing ExtentReports
     extent = new ExtentReports();
     extent.attachReporter(sparkReporter);

     // Adding system-specific information to the report
     extent.setSystemInfo("Computer Name", "localhost");
     extent.setSystemInfo("Environment", "QA");
     extent.setSystemInfo("Tester Name", "Pavan");
     extent.setSystemInfo("OS", "Windows10");
     extent.setSystemInfo("Browser Name", "Chrome");
 }

 // This method runs when a test method is marked as passed
 public void onTestSuccess(ITestResult result) {
     // Creating a new entry in the report for the passed test
     test = extent.createTest(result.getName());
     // Logging the pass status
     test.log(Status.PASS, "Test case PASSED is: " + result.getName());
 }

 // This method runs when a test method is marked as failed
 public void onTestFailure(ITestResult result) {
     // Creating a new entry in the report for the failed test
     test = extent.createTest(result.getName());
     // Logging the failure status with the exception
     test.log(Status.FAIL, "Test case FAILED is: " + result.getName());
     test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable());
 }

 // This method runs when a test method is marked as skipped
 public void onTestSkipped(ITestResult result) {
     // Creating a new entry in the report for the skipped test
     test = extent.createTest(result.getName());
     // Logging the skipped status
     test.log(Status.SKIP, "Test case SKIPPED is: " + result.getName());
 }

 // This method runs after the entire test suite has finished
 public void onFinish(ITestContext context) {
     // Flushing the ExtentReports to ensure all data is written to the report
     extent.flush();
 }
}
