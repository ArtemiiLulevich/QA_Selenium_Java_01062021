package ua.kiev.prog.automation.tests.UI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.tests.base.BasePage;

import java.util.List;

public class LoginPage extends BasePage {

    static final private By EMAIL_LOCATOR_STRING = By.xpath("//div[@id='content']//input[@id='input-email']");
    static final private By PASSWORD_LOCATOR_STRING = By.xpath("//div[@id='content']//input[@id='input-password']");
    static final private By SUBMIT_BUTTON_LOCATOR_STRING = By.xpath("//div[@id='content']//input[@type='submit']");
    static final private By ERROR_LOCATOR_STRING = By.xpath("//div[@id='account-login']//div[contains(@class, 'alert-danger')]");


    final public WebElement email_element = driver.findElement(EMAIL_LOCATOR_STRING);
    final public WebElement password_element = driver.findElement(PASSWORD_LOCATOR_STRING);
    final public WebElement submitButton = driver.findElement(SUBMIT_BUTTON_LOCATOR_STRING);


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        email_element.sendKeys(email);
        password_element.sendKeys(password);
        submitButton.click();
    }

    public List<WebElement> getErrorMessages() {
        return driver.findElements(ERROR_LOCATOR_STRING);
    }


}
