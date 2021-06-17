package ua.kiev.prog.automation.tests.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import ua.kiev.prog.automation.tests.UI.base.GuestSiteBasePage;

import java.util.List;

public class MainMenuPage extends GuestSiteBasePage {

    @FindBys
    (@FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']"))
    private List<WebElement> menuItems;

    public List<WebElement> getMenuItems() {
        return menuItems;
    }
}
