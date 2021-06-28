package ua.kiev.prog.automation.UI.pages;

import com.codeborne.selenide.SelenideElement;
import ua.kiev.prog.automation.UI.base.GuestSiteBasePage;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class MainMenuPage extends GuestSiteBasePage {


    private List<SelenideElement> menuItems = $$x("//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']");

    public List<SelenideElement> getMenuItems() {
        return menuItems;
    }

    @Override
    protected SelenideElement readyElement() {
        return null;
    }

    @Override
    protected SelenideElement errorElement() {
        return null;
    }
}
