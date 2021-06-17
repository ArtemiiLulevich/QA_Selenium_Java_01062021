package ua.kiev.prog.automation.tests.UI.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import ua.kiev.prog.automation.tests.UI.base.GuestSiteBasePage;

import java.util.List;


public class SearchResultPage extends GuestSiteBasePage {

    @FindBy(xpath = "//h4/a")
    private WebElement searchedItem;

    @FindBys(
            @FindBy(xpath = "//div[@id='content']//div[@class='product-thumb']")
    )
    private List<WebElement> searchedItems;


    @FindBy(xpath = "//div[@id='content']/p[2]")
    private WebElement emptyResult;


    public WebElement getSearchedItem() {
        return searchedItem;
    }

    public List<WebElement> getSearchedItems() {
        return searchedItems;
    }

    public WebElement getEmptyResult() {
        return emptyResult;
    }

//    static final private By SEARCHED_ITEM = By.xpath("//h4/a");
//    static final private By SEARCH_RESULT = By.xpath("//div[@id='content']/p[2]");

//    public SearchResultPage(WebDriver driver) {
//        super(driver);
//    }

//    public WebElement getSearchedElement() {
//        return driver.findElement(SEARCHED_ITEM);
//    }
//
//    public WebElement getSearchResult() {
//        return driver.findElement(SEARCH_RESULT);
//    }

}
