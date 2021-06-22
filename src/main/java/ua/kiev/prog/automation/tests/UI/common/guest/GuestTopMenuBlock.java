package ua.kiev.prog.automation.tests.UI.common.guest;

import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.tests.UI.base.TopMenuBlock;

public class GuestTopMenuBlock extends TopMenuBlock {

    private boolean isAccountUIDisplayed() {
       return this.account().$x("./following-sibling::ul").isDisplayed();//по аналогии сделать в ДЗ. По мейн меню.
    }

    public WebElement accountRegistration () {
        if (!isAccountUIDisplayed()){
            this.account().click();
        }
        return this.account().$x("./following-sibling::ul/li[1]/a");
    }

    public WebElement accountAuthorization () {
        if (!isAccountUIDisplayed()){
            this.account().click();
        }
        return this.account().$x("./following-sibling::ul/li[2]/a");
    }
}
