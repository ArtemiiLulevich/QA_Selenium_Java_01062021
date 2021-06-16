package ua.kiev.prog.automation.tests.UI.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ua.kiev.prog.automation.tests.base.Block;
import ua.kiev.prog.automation.tests.tools.Wait;

public class MainMenuBlock extends Block {

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

    private WebElement choseElement(String name) {
        return _getLinkLocatorStr(name);
    }

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
        return this.choseElement(name)
                .findElement(By.xpath("./following-sibling::div"))
                .isDisplayed();
    }

    public WebElement selectMenu(String menuName, String subMenuName) {
        /*
        Работает пока только с Desktop - PC
         */

        if (!isDropdownDisplayed(menuName)) {
            Wait.sleep(5000);
            this.choseElement(menuName).click();
        }
        return this.
                choseElement(menuName).
                findElement(By.xpath("./following-sibling::div//ul/li[1]"));
    }

}
