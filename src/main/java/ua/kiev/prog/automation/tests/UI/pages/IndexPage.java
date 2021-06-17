package ua.kiev.prog.automation.tests.UI.pages;

import ua.kiev.prog.automation.tests.UI.base.GuestSiteBasePage;

public class IndexPage extends GuestSiteBasePage {

    public LoginPage goToLoginPage() {
        topMenu.accountAuthorization().click();
        return page(LoginPage.class);
    }

    public MainMenuPage goToMenu(String menuName, String subMenuName) {
        mainMenu.selectMenu(menuName, subMenuName).click();
        return page(MainMenuPage.class);
    }

    public MainMenuPage goToMenu(String menuName) {
        mainMenu.selectMenu(menuName, null).click();
        return page(MainMenuPage.class);
    }

    public SearchResultPage search(String item) {
        search.searchInput().sendKeys(item);
        search.searchButton().click();
        return page(SearchResultPage.class);
    }

}
