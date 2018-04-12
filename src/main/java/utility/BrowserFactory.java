package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    WebDriver wb;

    public void SelectBrowser(String browser){
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
            wb = new ChromeDriver();
        }
    }


    }



