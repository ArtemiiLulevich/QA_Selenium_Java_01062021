package ua.kiev.prog.automation.UI.common.user;

import ua.kiev.prog.automation.UI.base.TopMenuBlock;
import ua.kiev.prog.automation.UI.pages.AccountPage;

public class UserTopMenuBlock extends TopMenuBlock {

    final public AccountPage goToAccountPage() {
        this.account().selectValue(0); //Личный кабинет
        return this.page(AccountPage.class);
    }

    final public void logout() {
        this.account().selectValue(4); // выход
    }


}
