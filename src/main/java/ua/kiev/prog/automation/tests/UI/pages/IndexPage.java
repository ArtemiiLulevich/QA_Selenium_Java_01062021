package ua.kiev.prog.automation.tests.UI.pages;

import ua.kiev.prog.automation.tests.UI.base.GuestSiteBasePage;

public class IndexPage extends GuestSiteBasePage {

    public LoginPage goToLoginPage() {
        topMenu.accountAuthorization().click();
        return page(LoginPage.class);
    }

    public MainMenuPage goToMenu(String menuName, String subMenuName) {
        mainMenu.selectSubmenu(menuName, subMenuName).click();
        return page(MainMenuPage.class);
    }

    public MainMenuPage goToMenu(String menuName) {
        mainMenu.selectSubmenu(menuName, null).click();
        return page(MainMenuPage.class);
    }

}
