package ua.kiev.prog.automation.UI.pages.account;

import com.codeborne.selenide.Selenide;
import ua.kiev.prog.automation.base.Block;

public class AccountNavigationBlock extends Block {

    public AccountNavigationBlock() {
        super(Selenide.$x("//aside[@id='column-right']"));
    }
}
