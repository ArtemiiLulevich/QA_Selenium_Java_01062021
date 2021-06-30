package ua.kiev.prog.automation.UI.base;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ua.kiev.prog.automation.UI.widgets.Dropdown;
import ua.kiev.prog.automation.base.Block;

public class TopMenuBlock extends Block {

    final public Dropdown currency = new Dropdown(this.element.$x(".//form[@id='form-currency']//button[@data-toggle='dropdown']"));
    final public Dropdown language = new Dropdown(this.element.$x(".//form[@id='form-language']//button[@data-toggle='dropdown']"));

    public TopMenuBlock() {
        super(Selenide.$x("//nav[@id='top']"));
    }

    private SelenideElement _getLinkLocatorStg(String faName) {
        return this.element.$x(".//div[@id='top-links']" +
                "/ul/li/a/i[contains(@class, '" + faName +"')]/..");
    }

    public SelenideElement contact() {
        return _getLinkLocatorStg("fa-phone");
    }

    protected Dropdown account() {
        return new Dropdown(_getLinkLocatorStg("fa-user"));
    }

    public SelenideElement bookmarks() {
        return _getLinkLocatorStg("fa-heart");
    }

    public SelenideElement cart() {
        return _getLinkLocatorStg("fa-shopping-cart");
    }

    public SelenideElement checkout() {
        return _getLinkLocatorStg("fa-share");
    }



}
