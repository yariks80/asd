package Context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by DELL on 7/24/2016.
 */
public class MyDriverFactory {
 private WebDriver driver;

 public    WebDriver getDriver() {
     String name=   System.getProperty("driver");
        if (name.equals("chrome")){
            driver = new ChromeDriver();}
        if (name.equals("firefox")){
            driver = new FirefoxDriver();

        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
      return  driver;
    }
}
