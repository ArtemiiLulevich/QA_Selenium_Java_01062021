package ua.kiev.prog.automation.UI.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ua.kiev.prog.automation.UI.base.GuestSiteBasePage;
import ua.kiev.prog.automation.tools.Wait;

import java.time.Instant;
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

    public SelenideElement email_element = Selenide.$x("//div[@id='content']//input[@id='input-email']");

    public SelenideElement password_element = Selenide.$x("//div[@id='content']//input[@id='input-password']");

    public SelenideElement submitButton = Selenide.$x("//div[@id='content']//input[@type='submit']");

    public List<SelenideElement> errorMessageList = Selenide.$$x("//div[@id='account-login']//div[contains(@class, 'alert-danger')]");

    public SelenideElement errorMessage = Selenide.$x("//div[@id='account-login']//div[contains(@class, 'alert-danger')]");

    public AccountPage login(String email, String password) {
        email_element.sendKeys(email);
        password_element.sendKeys(password);
        submitButton.click();
        return page(AccountPage.class);
    }
    
    public boolean isErrorMessageDisplayed(String message) {
        message = message.trim();

        for (SelenideElement elem:
             errorMessageList) {
            if(elem.getText().trim().equals(message)){
                return true;
            }
        }

        return false;
    }


    final public void confirmError() {
        int timeOut = 30;
        long endTime = Instant.now().getEpochSecond() + timeOut;
        boolean found = false;

        while (!found && endTime > Instant.now().getEpochSecond()){
            found = this.errorElement().exists();
            if(!found){
                Wait.sleep(500);
            }
        }

        if(!found)
            throw new RuntimeException("Error element is not found for page: "
                    + this.getClass().getSimpleName());
    }

    @Override
    protected SelenideElement readyElement() {
        return email_element;
    }

    // TODO: 29.06.2021 переделать. Перенести данный элемент из Base PAge 

    protected SelenideElement errorElement() {
        return errorMessage;
    }

    /*    public AccountPage login(String email, String password, boolean clickSubmit){
        email_element.sendKeys(email);
        password_element.sendKeys(password);
        submitButton.click();
        return page(AccountPage.class);
    }*/

}
