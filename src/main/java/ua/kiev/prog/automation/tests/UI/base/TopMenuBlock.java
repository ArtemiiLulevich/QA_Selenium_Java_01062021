package ua.kiev.prog.automation.tests.UI.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.tests.base.Block;

public class TopMenuBlock extends Block {

    public TopMenuBlock() {
        super(By.xpath("//nav[@id='top']"));
    }

    private WebElement _getLinkLocatorStg(String faName) {
        return this.element.findElement(By.xpath(".//div[@id='top-links']/ul/li/a/i[contains(@class, '" + faName +"')]/.."));
    }

    public WebElement contact() {
        return _getLinkLocatorStg("fa-phone");
    }

    protected WebElement account() {
        return _getLinkLocatorStg("fa-user");
    }

    public WebElement bookmarks() {
        return _getLinkLocatorStg("fa-heart");
    }

    public WebElement cart() {
        return _getLinkLocatorStg("fa-shopping-cart");
    }

    public WebElement checkout() {
        return _getLinkLocatorStg("fa-share");
    }

}
