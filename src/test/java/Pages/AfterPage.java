package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by DELL on 7/16/2016.
 */
public class AfterPage {

	@FindBy(xpath = "//i[@id='PH_user-email']")
	private WebElement assertElement;

    public AfterPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public String getAssertElementText() {
        return  assertElement.getText();
    }
}
