package ua.kiev.prog.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.kiev.prog.automation.tests.UI.factory.LoginFactory;
import ua.kiev.prog.automation.tests.base.BaseUITest;
import ua.kiev.prog.automation.tests.tools.Wait;

import java.util.List;
import java.util.stream.Collectors;

public class LoginTest extends BaseUITest {
    /**
     * Разобраться с XPath. После круса.
     *
     * Поробовать написать тесты самому.
     * Почитать про Selenium + TestNg
     *
     */

//    static final private String LOGIN_URL = "http://zvisno.com/index.php?route=account/login"
    static final private By ACCOUNT_LOCATOR = By.xpath("//div[@id='top-links']/ul/li/a/i[contains(@class, 'fa-user')]/..");
    static final private By AUTH_LOCATOR = By.xpath("./following-sibling::ul/li[2]/a");
//    static final private By EMAIL_LOCATOR_STRING = By.xpath("//div[@id='content']//input[@id='input-email']");
//    static final private By PASSWORD_LOCATOR_STRING = By.xpath("//div[@id='content']//input[@id='input-password']");
//    static final private By SUBMIT_BUTTON_LOCATOR_STRING = By.xpath("//div[@id='content']//input[@type='submit']");
//    static final private By ERROR_LOCATOR_STRING = By.xpath("//div[@id='account-login']//div[contains(@class, 'alert-danger')]");

    static final private String EMAIL_VALID = "yurii.voronenko@gmail.com";
    static final private String EMAIL_INVALID = "invalidLogin@g.123";

    static final private String PASSWORD_VALID = "12345678";
    static final private String PASSWORD_INVALID = "1234567";


    @DataProvider(name="loginData")
    public Object[][] loginData() {
        return new Object[][] {
                {EMAIL_VALID, PASSWORD_VALID, null},
                {EMAIL_INVALID, PASSWORD_VALID, "Предупреждение: Не совпадает адрес электронной почты и/или пароль."},
        };
    }


    @Test(dataProvider = "loginData")
    public void loginTest(String email, String password, String errorMessage){
        WebElement account = driver.findElement(ACCOUNT_LOCATOR);
        account.click();

        WebElement authLink = account.findElement(AUTH_LOCATOR);
        authLink.click();
//  Перенесено в LoginPage
//        WebElement email_element = driver.findElement(EMAIL_LOCATOR_STRING);
//        WebElement password_element = driver.findElement(PASSWORD_LOCATOR_STRING);
//        WebElement submitButton = driver.findElement(SUBMIT_BUTTON_LOCATOR_STRING);

//        email_element.sendKeys(email);
//        password_element.sendKeys(password);
//        submitButton.click();

//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login(email, password);
        LoginFactory loginFactory = new LoginFactory(driver);
        loginFactory.login(email, password);

        Wait.sleep(1000);
//        List<WebElement> errorMessageList = driver.findElements(ERROR_LOCATOR_STRING);

//        List<WebElement> errorMessageList = loginPage.getErrorMessages();// callback функция
        List<WebElement> errorMessageList = loginFactory.errorMessageList;

        if (errorMessage == null){
            Assert.assertEquals(errorMessageList.size(), 0, "Error message are shown: "
                    + errorMessageList.stream()
                    .map(WebElement::getText)
                    .collect(Collectors.toList()));
        } else {
            Assert.assertTrue(errorMessageList.size() > 0);
            Assert.assertEquals(errorMessageList.get(0).getText(), errorMessage,
                    "Error message is not as expected");
        }

    }

//    @Test
//    public void invalidLoginTest() {
//        loginIntoSite(EMAIL_VALID, PASSWORD_INVALID);
//
//        List<WebElement> errorMessageList = driver.findElements(ERROR_LOCATOR_STRING);
//        Assert.assertTrue(errorMessageList.size() > 0,
//                "There is no any error message");
//    }
//
//    private void loginIntoSite(String email, String password) {
//        driver.get("http://zvisno.com/index.php?route=account/login");
//
//        WebElement email_element = driver.findElement(EMAIL_LOCATOR_STRING);
//        WebElement password_element = driver.findElement(PASSWORD_LOCATOR_STRING);
//        WebElement submitButton = driver.findElement(SUBMIT_BUTTON_LOCATOR_STRING);
//
//        email_element.sendKeys(email);
//        password_element.sendKeys(password);
//        submitButton.click();
//    }

}
