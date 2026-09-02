package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.*;
import utils.ExtentManager;
import utils.ExtentTestManager;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentManager.getInstance();

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTest test =
                extent.createTest(result.getMethod().getMethodName());

        ExtentTestManager.setTest(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        ExtentTestManager.getTest()
                .pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        ExtentTestManager.getTest()
                .fail(result.getThrowable());
    }

    @Override
    public void onFinish(org.testng.ITestContext context) {
        extent.flush();
    }
}