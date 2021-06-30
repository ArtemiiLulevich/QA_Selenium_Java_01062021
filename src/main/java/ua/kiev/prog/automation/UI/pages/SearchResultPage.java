package ua.kiev.prog.automation.UI.pages;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import ua.kiev.prog.automation.UI.base.GuestSiteBasePage;

import java.util.List;


public class SearchResultPage extends GuestSiteBasePage {

    private SelenideElement searchedItem = Selenide.$x("//h4/a");


    private List<SelenideElement> searchedItems = Selenide.$$x("//div[@id='content']//div[@class='product-thumb']");

    private SelenideElement emptyResult = Selenide.$x("//div[@id='content']/p[2]");


    public SelenideElement getSearchedItem() {
        return searchedItem;
    }

    public List<SelenideElement> getSearchedItems() {
        return searchedItems;
    }

    public SelenideElement getEmptyResult() {
        return emptyResult;
    }

    @Override
    protected SelenideElement readyElement() {
        return null;
    }

}
