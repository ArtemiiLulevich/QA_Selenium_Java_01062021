package Homework_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
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
                {SEARCHING_ITEM_1, null},
                {SEARCHING_ITEM_2, null},
                {SEARCHING_ITEM_3, null},
//                {SEARCHING_ITEM_4, SEARCH_RESULT},
//                {SEARCHING_ITEM_5, SEARCH_RESULT}
        };
    }


    @Test(dataProvider = "searchingItem")
    public void searchTest(String item, String result) {
        WebElement searchInput = driver.findElement(SEARCH_INPUT_LOCATOR);
        searchInput.sendKeys(item);

        WebElement searchButton = driver.findElement(SEARCH_BUTTON_LOCATOR);
        searchButton.click();


        SearchResultPage searchResultPage = new SearchResultPage(driver);

        WebElement searchedItem = searchResultPage.getSearchedElement();

        if (searchedItem != null){
            Assert.assertEquals(searchedItem.getText(), item);
        } else {
            WebElement searchResult = searchResultPage.getSearchResult();
            Assert.assertEquals(searchResult.getText(), result);
        }

    }


}
