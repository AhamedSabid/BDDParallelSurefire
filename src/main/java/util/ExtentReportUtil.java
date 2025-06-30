package util;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import pages.BasePage;

public class ExtentReportUtil extends BasePage {
    private static ExtentReports extent;
    private static ExtentTest test;

    // Initialize ExtentReports with the specified report path
    public static void initializeReport(String reportPath) {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    // Create a test instance in the report
    public static ExtentTest createTest(String testName) {
        test = extent.createTest(testName);
        return test;
    }

    // Flush the report to save changes
    public static void flushReport() {
        if (extent != null) {
            extent.flush();
        }
    }

}
