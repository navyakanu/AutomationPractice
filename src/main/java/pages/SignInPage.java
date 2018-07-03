package pages;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by navyab on 6/25/18.
 */
public class SignInPage extends BasePage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"email_create\"]")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
    private WebElement createAccount;


    public void SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    public void createAccount() {

        sendKeys("abc@gmail.com", emailField);
        //.getLogger(SignInPage.class).info("Entered email ID");
        onClick(createAccount);
        //BasePage.getLogger(SignInPage.class).info("Click on create account");
    }


}
