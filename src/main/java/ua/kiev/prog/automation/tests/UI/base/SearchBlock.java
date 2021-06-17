package ua.kiev.prog.automation.tests.UI.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.tests.base.Block;

public class SearchBlock extends Block {

    public SearchBlock() {
        super(By.xpath("//div[@id='search']"));
    }

    private WebElement _getLinkLocatorStr(String xPath) {
        return this.element.findElement(By.xpath(xPath));
    }

    public WebElement searchInput() {
        return _getLinkLocatorStr("./input[@name='search']");
    }

    public WebElement searchButton() {
        return _getLinkLocatorStr(".//button");
    }



}
