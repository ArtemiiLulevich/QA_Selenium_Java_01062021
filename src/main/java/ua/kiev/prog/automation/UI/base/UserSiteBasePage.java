package ua.kiev.prog.automation.UI.base;

import ua.kiev.prog.automation.UI.common.user.UserTopMenuBlock;
import ua.kiev.prog.automation.base.BasePage;

abstract public class UserSiteBasePage extends BasePage {
    final public UserTopMenuBlock topMenu = new UserTopMenuBlock();
    final public MainMenuBlock mainMenu = new MainMenuBlock();
}
