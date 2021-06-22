package ua.kiev.prog.automation.tests.UI.base;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ua.kiev.prog.automation.tests.base.Block;


import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$x;


public class MainMenuBlock extends Block {


    private final Map<String, String> subMenus = new HashMap<String, String>(){{
        put("PC", "./following-sibling::div//ul/li[1]");
        put("Mac", "./following-sibling::div//ul/li[2]");
        put("Macs", "./following-sibling::div//ul/li[1]");
        put("Windows", "./following-sibling::div//ul/li[2]");
        put("Mice and Trackballs", "./following-sibling::div//ul/li[1]");
        put("Monitors", "./following-sibling::div//ul/li[2]");
        put("Printers", "./following-sibling::div//ul/li[3]");
        put("Scanners", "./following-sibling::div//ul/li[4]");
        put("Web Cameras", "./following-sibling::div//ul/li[5]");

    }};


    public MainMenuBlock() {
        super(Selenide.$x("//nav[@id='menu']"));
    }

    private SelenideElement _getLinkLocatorStr(String name) {
        return this.element.$x(".//ul/li/a[text()='" + name + "']");
    }


    private boolean isDropdownDisplayed(String name) {
        return this._getLinkLocatorStr(name)
                .$x("./following-sibling::div")
                .isDisplayed();
    }

    private SelenideElement getSubMenu(String menuName, String subMenuName) {
        if (!isDropdownDisplayed(menuName)) {
            this._getLinkLocatorStr(menuName).click();
        }
        return this._getLinkLocatorStr(menuName).$x(this.subMenus.get(subMenuName));
    }


    public SelenideElement getMenu(String menuName, String subMenuName) {
        if (subMenuName != null) {
            return getSubMenu(menuName, subMenuName);
        } else {
            return this._getLinkLocatorStr(menuName);
        }
    }

}
