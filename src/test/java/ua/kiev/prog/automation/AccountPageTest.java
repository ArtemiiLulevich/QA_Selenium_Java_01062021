package ua.kiev.prog.automation;

import org.testng.annotations.Test;
import ua.kiev.prog.automation.UI.pages.AccountPage;
import ua.kiev.prog.automation.UI.pages.UserIndexPage;
import ua.kiev.prog.automation.base.BaseUITest;

public class AccountPageTest extends BaseUITest {

    UserIndexPage userIndexPage = new UserIndexPage();

    @Test
    public void testRightMenu() {
        api.loginIntoWebSite();

        userIndexPage.confirmPage();

        AccountPage accountPage = userIndexPage.topMenu.goToAccountPage();

        accountPage.confirmPage();



    }

}
