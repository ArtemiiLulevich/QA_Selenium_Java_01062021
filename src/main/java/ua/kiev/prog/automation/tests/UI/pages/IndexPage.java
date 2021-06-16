package ua.kiev.prog.automation.tests.UI.pages;

import ua.kiev.prog.automation.tests.UI.base.GuestSiteBasePage;

public class IndexPage extends GuestSiteBasePage {

    public LoginPage goToLoginPage() {
        topMenu.accountAuthorization().click();
        return page(LoginPage.class);
    }

}
