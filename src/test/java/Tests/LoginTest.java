package Tests;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by DELL on 7/16/2016.
 */
public class LoginTest extends BaseTest {
    LoginPage loginPage;


    @BeforeClass
    public void setUp() throws Exception {
        loginPage= new LoginPage(driver);
     }

    @Test
    public void testLogin() throws Exception {

         String actual= loginPage.login("mytest_test","337774a")
                .getAssertElementText();

        String expected="mytest_test@mail.ru";
        Assert.assertEquals(actual,expected);

    }


}
