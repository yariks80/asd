package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by DELL on 7/24/2016.
 */
public class BasePage {

    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

}
