package ua.kiev.prog.automation;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.kiev.prog.automation.tests.UI.pages.IndexPage;
import ua.kiev.prog.automation.tests.base.BaseUITest;
import ua.kiev.prog.automation.tests.tools.Wait;

import java.util.ArrayList;
import java.util.List;

public class TopMenuTest extends BaseUITest {


    String[] expectedCurrency = new String[] {
            "€ Euro",
            "£ Pound Sterling",
            "$ US Dollar",
            "Sra"
    };

    String[] expectedLanguage = new String[] {
            "English",
            "Русский",
            "Українська",
            "n,"
    };

    @Test
    public void topMenuTest() {
        IndexPage index = new IndexPage();

//        System.out.println(index.topMenu.currency.getValues());
//        System.out.println(index.topMenu.language.getValues());

        List<String> actualCurrency = index.topMenu.currency.getValues();
        for(String curr: expectedCurrency){
            Assert.assertTrue(index.topMenu.currency.hasValue(curr), "Currency " + curr + " is not found.");
        }

        List<String> actualLanguage = index.topMenu.language.getValues();
        for(String lang: expectedLanguage){
            Assert.assertTrue(index.topMenu.language.hasValue(lang), "Language " + lang + " is not found.");
        }


        index.topMenu.currency.selectValue("$ US Dollar");
        index.topMenu.language.selectValue("Українська");



        Wait.sleep(1000);


    }
}
