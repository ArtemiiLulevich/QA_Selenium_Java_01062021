package ua.kiev.prog.automation.UI.base;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ua.kiev.prog.automation.base.Block;

public class SearchBlock extends Block {
//#TODO рефактор селенид

    public SearchBlock() {
        super(Selenide.$x("//div[@id='search']"));
    }

    private SelenideElement _getLinkLocatorStr(String xPath) {
        return this.element.$x(xPath);
    }

    public SelenideElement searchInput() {
        return _getLinkLocatorStr("./input[@name='search']");
    }

    public SelenideElement searchButton() {
        return _getLinkLocatorStr(".//button");
    }

}
