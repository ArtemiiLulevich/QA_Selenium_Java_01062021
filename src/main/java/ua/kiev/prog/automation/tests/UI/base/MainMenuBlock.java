package ua.kiev.prog.automation.tests.UI.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.tests.base.Block;


import java.util.HashMap;
import java.util.Map;


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
        super(By.xpath("//nav[@id='menu']"));
    }

    private WebElement _getLinkLocatorStr(String name) {
        return this.element.findElement(By.xpath(".//ul/li/a[text()='" + name + "']"));
    }

/*    public WebElement desktops() {
        return _getLinkLocatorStr("Desktops");
    }

    public WebElement laptopsAndNotebooks() {
        return _getLinkLocatorStr("Laptops & Notebooks");
    }

    public WebElement components() {
        return _getLinkLocatorStr("Components");
    }

    public WebElement tablets() {
        return _getLinkLocatorStr("Tablets");
    }

    public WebElement software() {
        return _getLinkLocatorStr("Software");
    }

    public WebElement phonesAndPdas() {
        return _getLinkLocatorStr("Phones & PDAs");
    }

    public WebElement cameras() {
        return _getLinkLocatorStr("Cameras");
    }

    public WebElement mp3players() {
        return _getLinkLocatorStr("MP3 Players");
    }*/

//    private WebElement _getLinkLocatorStr(String name) {
//        return _getLinkLocatorStr(name);
//    }

/*    private boolean isDesktopsDisplayed() {
        return this.desktops()
                .findElement(By.xpath("./following-sibling::div"))
                .isDisplayed();
    }
    private boolean isLaptopDisplayed() {
        return this.choseElement()
                .findElement(By.xpath("./following-sibling::div"))
                .isDisplayed();
    }
    private boolean isComponentsDisplayed() {
        return this.choseElement()
                .findElement(By.xpath("./following-sibling::div"))
                .isDisplayed();
    }
    private boolean isMp3PlayersDisplayed() {
        return this.choseElement()
                .findElement(By.xpath("./following-sibling::div"))
                .isDisplayed();
    }*/

    private boolean isDropdownDisplayed(String name) {
        return this._getLinkLocatorStr(name)
                .findElement(By.xpath("./following-sibling::div"))
                .isDisplayed();
    }

    private WebElement getSubMenu(String menuName, String subMenuName) {
        if (!isDropdownDisplayed(menuName)) {
            this._getLinkLocatorStr(menuName).click();
        }
        return this._getLinkLocatorStr(menuName).findElement(
                By.xpath(this.subMenus.get(subMenuName))
        );
    }


    public WebElement getMenu(String menuName, String subMenuName) {
        if (subMenuName != null) {
            return getSubMenu(menuName, subMenuName);
        } else {
            return this._getLinkLocatorStr(menuName);
        }
    }

}
