package Tests;

import Context.MyDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

/**
 * Created by DELL on 7/24/2016.
 */
public class BaseTest {
    protected WebDriver driver;
    protected String BaseUrl = "http://mail.ru";

    @BeforeSuite
    public void setSuite() throws Exception {
        driver= new MyDriverFactory().getDriver();
        driver.get(BaseUrl);


    }

    @AfterSuite
    public void tearSuite() throws Exception {
        driver.quit();
    }
}
