package ua.kiev.prog.automation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ua.kiev.prog.automation.UI.pages.AccountPage;
import ua.kiev.prog.automation.UI.pages.LoginPage;
import ua.kiev.prog.automation.base.BaseSteps;
import ua.kiev.prog.automation.base.Session;

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

}
