package ua.kiev.prog.automation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import ua.kiev.prog.automation.UI.pages.AccountPage;
import ua.kiev.prog.automation.UI.pages.LoginPage;
import ua.kiev.prog.automation.base.BaseSteps;
import ua.kiev.prog.automation.base.Session;
import ua.kiev.prog.automation.tools.Util;

public class LoginTestSteps extends BaseSteps {

    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    @Given("^I am navigating to login page$")
    public void iAmNavigatingToLoginPage() {
        System.out.println("Navigating");
        Session.getInstance().driver().get("http://zvisno.com/index.php?route=account/login");
    }

    @When("^I enter \"(.+?)\" to email filed$")
    public void iEnterValueToEmailFiled(String value){
        if("$_INVALID_EMAIL_$".equals(value)){
            value = Util.randomString(10) + "@gmail.com";
        }
        loginPage.email_element.sendKeys(value);
    }

    @When("^I enter \"(.+?)\" to password filed$")
    public void iEnterValueToPasswordFiled(String value){
        loginPage.password_element.sendKeys(value);
    }

    @When("^I click login button$")
    public void iClickLoginButton(){
        loginPage.submitButton.click();
    }

    @Then("^account page is displayed$")
    public void accountPageIsDisplayed() {
        accountPage.confirmPage();
    }

    @When("^I enter invalid email \"(.+?)\"$")
    public void iEnterInvalidEmail(String value) {
        loginPage.email_element.sendKeys(value);
    }

    @When("^I enter invalid password \"(.+?)\"$")
    public void iEnterInvalidPassword(String value) {
        loginPage.password_element.sendKeys(value);
    }

    @Then("^error message is displayed$")
    public void errorMessageIsDisplayed() {
        loginPage.confirmError();
    }

    @Then("^login result must be \"(.+?)\" and error message \"(.+?)\" is displayed$")
    public void loginResultMustBeResultAndErrorMessage(String result, String errorMessage) {
        if ("success".equalsIgnoreCase(result)) {
            accountPage.confirmPage();
        } else if ("fail".equalsIgnoreCase(result)) {
            loginPage.confirmPage();
            Assert.assertTrue(loginPage.isErrorMessageDisplayed(errorMessage),
                    "Error message is not displayed: " + errorMessage);
        } else {
            throw new RuntimeException("Unknown result");
        }
    }

}
