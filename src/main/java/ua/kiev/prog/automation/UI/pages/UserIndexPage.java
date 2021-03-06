package ua.kiev.prog.automation.UI.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ua.kiev.prog.automation.UI.base.UserSiteBasePage;

public class UserIndexPage extends UserSiteBasePage {
    @Override
    protected SelenideElement readyElement() {
        return Selenide.$x("//aside[@id='column-right']//a[contains(@href,'account/logout')]");
    }

}
