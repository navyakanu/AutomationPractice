package tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utility.BrowserFactory;
import utility.LogLoader;
import utility.PropertiesLoader;

import java.io.IOException;

/**
 * Created by navyab on 6/27/18.
 */
public class BaseTest extends BrowserFactory implements ITestListener {

    WebDriver driver;

    @BeforeTest(groups = {"Sanity"})
    public WebDriver setUp() throws IOException {
        PropertiesLoader.LoadProperties();
        driver = BrowserFactory.SelectBrowser();
        return driver;
    }

    @AfterTest(groups = {"Sanity"})
    public void tearDown() {
        driver.quit();
    }


    public void onTestStart(ITestResult iTestResult) {
        LogLoader.info("Starting test " +iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        LogLoader.info("Test Successful " +iTestResult.getName());
    }

    public void onTestFailure(ITestResult iTestResult) {
        driver.quit();
        LogLoader.info("Test Failure " +iTestResult.getName());
    }

    public void onTestSkipped(ITestResult iTestResult) {
        LogLoader.info("Skip Test " +iTestResult.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
