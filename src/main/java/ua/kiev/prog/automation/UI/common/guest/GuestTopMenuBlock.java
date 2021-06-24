package ua.kiev.prog.automation.UI.common.guest;

import com.codeborne.selenide.SelenideElement;
import ua.kiev.prog.automation.UI.base.TopMenuBlock;

public class GuestTopMenuBlock extends TopMenuBlock {

    private boolean isAccountUIDisplayed() {
       return this.account().$x("./following-sibling::ul").isDisplayed();//по аналогии сделать в ДЗ. По мейн меню.
    }

    public SelenideElement accountRegistration () {
        if (!isAccountUIDisplayed()){
            this.account().click();
        }
        return this.account().$x("./following-sibling::ul/li[1]/a");
    }

    public SelenideElement accountAuthorization () {
        if (!isAccountUIDisplayed()){
            this.account().click();
        }
        return this.account().$x("./following-sibling::ul/li[2]/a");
    }
}
