package Tests;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by DELL on 7/16/2016.
 */
public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;
    String url="http://mail.ru";

    @BeforeClass
    public void setUp() throws Exception {
     //   WebDriver driver = new RemoteWebDriver( new URL("http://192.168.1.117:4444/wd/hab"), DesiredCapabilities.firefox());
        driver=  new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginPage= new LoginPage(driver);
        driver.get(url);

    }

    @Test
    public void testLogin() throws Exception {
       /* System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());*/
      String actual= loginPage.login("mytest_test","337774a")
                .getAssertElementText();


        String expected="mytest_test@mail.ru";
        Assert.assertEquals(actual,expected);

    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();

    }
}
