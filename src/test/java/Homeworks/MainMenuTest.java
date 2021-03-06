package Homeworks;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.kiev.prog.automation.UI.pages.IndexPage;
import ua.kiev.prog.automation.UI.pages.MainMenuPage;
import ua.kiev.prog.automation.base.BaseUITest;

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
                {"Software",            null,           0},
                {"Phones & PDAs",       null,           3},
                {"Cameras",             null,           2}
        };
    }


    @Test(dataProvider = "mainMenuItems")
    public void mainMenuTest(String menu, String submenu, int count){
        IndexPage landingPage = new IndexPage();
        MainMenuPage mainMenuPage;

        if (submenu == null) {
            mainMenuPage = landingPage.goToMenu(menu);
        } else {
            mainMenuPage = landingPage.goToMenu(menu, submenu);
        }

        List<SelenideElement> menuItems = mainMenuPage.getMenuItems();
        Assert.assertEquals(menuItems.size(), count);
    }

}
