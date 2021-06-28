package ua.kiev.prog.automation.UI.pages;

import com.codeborne.selenide.SelenideElement;
import ua.kiev.prog.automation.UI.base.GuestSiteBasePage;

public class IndexPage extends GuestSiteBasePage {

    public LoginPage goToLoginPage() {
        topMenu.accountAuthorization().click();
        return page(LoginPage.class);
    }

    public MainMenuPage goToMenu(String menuName, String subMenuName) {
        mainMenu.getMenu(menuName, subMenuName).click();
        return page(MainMenuPage.class);
    }

    public MainMenuPage goToMenu(String menuName) {
        mainMenu.getMenu(menuName, null).click();
        return page(MainMenuPage.class);
    }

    public SearchResultPage search(String item) {
        search.searchInput().sendKeys(item);
        search.searchButton().click();
        return page(SearchResultPage.class);
    }

    @Override
    protected SelenideElement readyElement() {
        return topMenu.accountAuthorization();
    }

    @Override
    protected SelenideElement errorElement() {
        return null;
    }
}
