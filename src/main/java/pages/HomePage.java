package pages;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //@FindBy(xpath="\"//a[text()[normalize-space() = 'Sign in']]\")")
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement signInButton;


    public SignInPage signInToApplication(WebDriver driver) {
        onClick(signInButton);
      //  BasePage.getLogger(HomePage.class).info("Click sign in button");
        return new SignInPage();


    }


}
