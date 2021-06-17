package Homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.kiev.prog.automation.tests.UI.pages.IndexPage;
import ua.kiev.prog.automation.tests.UI.pages.SearchResultPage;
import ua.kiev.prog.automation.tests.base.BaseUITest;


public class SearchTest extends BaseUITest {

    static final private By SEARCH_INPUT_LOCATOR = By.xpath("//div[@id='search']/input[@name='search']");
    static final private By SEARCH_BUTTON_LOCATOR = By.xpath("//div[@id='search']//button");

    static final private String SEARCHING_ITEM_1 = "Samsung SyncMaster 941BW";
    static final private String SEARCHING_ITEM_2 = "iMac";
    static final private String SEARCHING_ITEM_3 = "Apple Cinema 30\"";
    static final private String SEARCHING_ITEM_4 = "Dell";
    static final private String SEARCHING_ITEM_5 = "";

    static final private String SEARCH_RESULT = "Не найдено товаров, соответствующих критериям поиска.";


    @DataProvider(name="searchingItem")
    public Object[] searchingItems() {
        return new Object[][]{
                {SEARCHING_ITEM_1, SEARCHING_ITEM_1, 1},
                {SEARCHING_ITEM_2, SEARCHING_ITEM_2, 1},
                {SEARCHING_ITEM_3, SEARCHING_ITEM_3, 1},
                {SEARCHING_ITEM_4, SEARCH_RESULT, 0},
                {SEARCHING_ITEM_5, SEARCH_RESULT, 0}
        };
    }


    @Test(dataProvider = "searchingItem")
    public void searchTest(String item, String result, int count) {

        IndexPage landingPage = new IndexPage();

        SearchResultPage searchResultPage = landingPage.search(item);

/*        WebElement searchInput = driver.findElement(SEARCH_INPUT_LOCATOR);
        searchInput.sendKeys(item);

        WebElement searchButton = driver.findElement(SEARCH_BUTTON_LOCATOR);
        searchButton.click();


        SearchResultPage searchResultPage = new SearchResultPage();*/

        if(count == 0) {
            Assert.assertEquals(searchResultPage.getEmptyResult().getText(), result);
        } else {
            Assert.assertEquals(searchResultPage.getSearchedItem().getText(), result);
        }

    }


}
