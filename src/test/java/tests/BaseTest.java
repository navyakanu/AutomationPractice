package tests;

import org.openqa.selenium.WebDriver;
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
public class BaseTest extends BrowserFactory {

    WebDriver driver;

    @BeforeTest(groups = {"Sanity"})
    public WebDriver setUp() throws IOException {
        PropertiesLoader.LoadProperties();
        driver = BrowserFactory.SelectBrowser();
        LogLoader.LoadLog4j().info("Started test");
        return driver;
    }

    @AfterTest(groups = {"Sanity"})
    public void tearDown(ITestResult testname) {
        String s = "Finished test "+testname.getMethod().getMethodName();

        LogLoader.LoadLog4j().info(s  );
        driver.quit();
    }


}
