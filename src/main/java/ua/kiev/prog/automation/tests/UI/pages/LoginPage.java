package ua.kiev.prog.automation.tests.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import ua.kiev.prog.automation.tests.UI.base.GuestSiteBasePage;

import java.util.List;

public class LoginPage extends GuestSiteBasePage {

/*    static final private By EMAIL_LOCATOR_STRING = By.xpath("//div[@id='content']//input[@id='input-email']");
    static final private By PASSWORD_LOCATOR_STRING = By.xpath("//div[@id='content']//input[@id='input-password']");
    static final private By SUBMIT_BUTTON_LOCATOR_STRING = By.xpath("//div[@id='content']//input[@type='submit']");
    static final private By ERROR_LOCATOR_STRING = By.xpath("//div[@id='account-login']//div[contains(@class, 'alert-danger')]");


    final public WebElement email_element = driver.findElement(EMAIL_LOCATOR_STRING);
    final public WebElement password_element = driver.findElement(PASSWORD_LOCATOR_STRING);
    final public WebElement submitButton = driver.findElement(SUBMIT_BUTTON_LOCATOR_STRING);

//    public LoginPage(WebDriver driver) {
//        super(driver);
//    }

    public void login(String email, String password) {
        email_element.sendKeys(email);
        password_element.sendKeys(password);
        submitButton.click();
    }

    public List<WebElement> getErrorMessages() {
        return driver.findElements(ERROR_LOCATOR_STRING);
    }*/
//    static final private By ERROR_LOCATOR_STRING = By.xpath("//div[@id='account-login']//div[contains(@class, 'alert-danger')]");

    @FindBy(xpath = "//div[@id='content']//input[@id='input-email']")
    public WebElement email_element;

    @FindBy(xpath = "//div[@id='content']//input[@id='input-password']")
    public WebElement password_element;

    @FindBy(xpath = "//div[@id='content']//input[@type='submit']")
    public WebElement submitButton;

    @FindBys(@FindBy(xpath = "//div[@id='account-login']//div[contains(@class, 'alert-danger')]"))
    public List<WebElement> errorMessageList;

    public AccountPage login(String email, String password) {
        email_element.sendKeys(email);
        password_element.sendKeys(password);
        submitButton.click();
        return page(AccountPage.class);
    }

/*    public AccountPage login(String email, String password, boolean clickSubmit){
        email_element.sendKeys(email);
        password_element.sendKeys(password);
        submitButton.click();
        return page(AccountPage.class);
    }*/

}
