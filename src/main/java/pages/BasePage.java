package pages;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserFactory;
import utility.LogLoader;
import utility.PropertiesLoader;

//import static utility.BrowserFactory.prop;

/**
 * Created by navyab on 6/11/18.
 */
public class BasePage {

    WebDriver driver;


    public void BasePage() {
        PageFactory.initElements(driver, this);
    }


    public void onClick(WebElement wb) {
        wb.click();

    }


    public void sendKeys(String text, WebElement wb) {
        wb.sendKeys(text);


    }

    public HomePage navigateToURL(WebDriver driver) {
        driver.get(PropertiesLoader.prop.getProperty("URL"));
        LogLoader.LoadLog4j().info("Logged in to the application");
        return new HomePage(driver);
    }


}
