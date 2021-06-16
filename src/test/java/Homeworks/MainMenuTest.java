package Homeworks;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.kiev.prog.automation.tests.UI.pages.IndexPage;
import ua.kiev.prog.automation.tests.UI.pages.MainMenuPage;
import ua.kiev.prog.automation.tests.base.BaseUITest;
import ua.kiev.prog.automation.tests.tools.Wait;

import java.util.List;

public class MainMenuTest extends BaseUITest {

    @DataProvider(name="mainMenuItems")
    public Object[] mainMenuItems() {
        return new Object[][] {
                {"Desktops",            "PC",           0},
                {"Desktops",            "Mac",          1},
                {"Laptops & Notebooks", "Macs",         0},
                {"Laptops & Notebooks", "Windows",      0},
                {"Tablets",             null,           1},
                {"Software",            null,           1},
                {"Phones & PDAs",       null,           1},
                {"Cameras",             null,           1}
        };
    }


    @Test(dataProvider = "mainMenuItems")
    public void mainMenuTest(String menu, String submenu, int count){
        IndexPage landingPage = new IndexPage();
        MainMenuPage mainMenuPage;

//        Wait.sleep(5000);
        //#TODO Нужно добавить тест. Довать разделение по методу goToMenu с другой сигнатурой

        if (submenu == null) {
            mainMenuPage = landingPage.goToMenu(menu);
        } else {
            mainMenuPage = landingPage.goToMenu(menu, submenu);
        }

        List<WebElement> menuItems = mainMenuPage.getMenuItems();
        Assert.assertEquals(menuItems.size(), count);

    }

}
