package ua.kiev.prog.automation.UI.common.guest;

import ua.kiev.prog.automation.UI.base.TopMenuBlock;

public class GuestTopMenuBlock extends TopMenuBlock {

    public void accountRegistration () {

         this.account().selectValue("Регистрация");
    }

    public void goToAuthorization() {
         this.account().selectValue("Авторизация");
    }
}
