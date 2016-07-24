package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by DELL on 7/16/2016.
 */
public class LoginPage extends BasePage{



    @FindBy(id ="mailbox__login" )
	private WebElement loginField;

	@FindBy(id ="mailbox__password" )
	private WebElement passwordField;

	@FindBy(id ="mailbox__auth__button")
	private WebElement button;

    public LoginPage(WebDriver driver) {
        super(driver);

    }


    public AfterPage login(String login, String password) throws InterruptedException {
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        button.click();
        //Thread.sleep(5000);
        return new AfterPage(driver);
    }
}
