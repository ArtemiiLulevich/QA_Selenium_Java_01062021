package ua.kiev.prog.automation.tests.UI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.tests.UI.base.GuestSiteBasePage;
import ua.kiev.prog.automation.tests.base.BasePage;

public class SearchResultPage extends GuestSiteBasePage {

    static final private By SEARCHED_ITEM = By.xpath("//h4/a");
    static final private By SEARCH_RESULT = By.xpath("//div[@id='content']/p[2]");

//    public SearchResultPage(WebDriver driver) {
//        super(driver);
//    }

    public WebElement getSearchedElement() {
        return driver.findElement(SEARCHED_ITEM);
    }

    public WebElement getSearchResult() {
        return driver.findElement(SEARCH_RESULT);
    }

}
