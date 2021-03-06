package ua.kiev.prog.automation.UI.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ua.kiev.prog.automation.UI.base.UserSiteBasePage;
import ua.kiev.prog.automation.UI.pages.account.AccountNavigationBlock;


public class AccountPage extends UserSiteBasePage {

    public final AccountNavigationBlock accountNavigationBlock = new AccountNavigationBlock();

    @Override
    protected SelenideElement readyElement() {
        return Selenide.$x("//aside[@id='column-right']//a[contains(@href,'account/logout')]");
    }

}
