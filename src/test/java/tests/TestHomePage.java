package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.SignInPage;
import utility.BrowserFactory;


/**
 * Created by navyab on 5/24/18.
 */
public class TestHomePage extends BaseTest {

    @Test
    public void Test() {
        BasePage basePage = new BasePage();
        System.out.println("Driver in test"+driver);
        HomePage homePage = basePage.navigateToURL(driver);
        SignInPage signinPage = homePage.signInToApplication(driver);
      //  signinPage.createAccount();

    }

    @Test
    public void Test1() {
       System.out.println("inTestHomePageTEst1");
    }





}

