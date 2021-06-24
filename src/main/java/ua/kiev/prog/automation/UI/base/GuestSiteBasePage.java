package ua.kiev.prog.automation.UI.base;

import ua.kiev.prog.automation.UI.common.guest.GuestTopMenuBlock;
import ua.kiev.prog.automation.base.BasePage;

abstract public class GuestSiteBasePage extends BasePage {
     final public GuestTopMenuBlock topMenu = new GuestTopMenuBlock();
     final public MainMenuBlock mainMenu = new MainMenuBlock();
     final public SearchBlock search = new SearchBlock();

}
