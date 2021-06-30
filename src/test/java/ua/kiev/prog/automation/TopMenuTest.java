package ua.kiev.prog.automation;

import ua.kiev.prog.automation.base.BaseUITest;

import java.util.Arrays;
import java.util.List;

public class TopMenuTest extends BaseUITest {


//    String[] expectedCurrency = new String[] {
//            "€ Euro",
//            "£ Pound Sterling",
//            "$ US Dollar",
//            "Sra"
//    };

    List<String> expectedCurrency = Arrays.asList(
            "€ Euro",
            "£ Pound Sterling",
            "$ US Dollar",
            "bla");

//    String[] expectedLanguage = new String[] {
//            "English",
//            "Русский",
//            "Українська",
//            "n,"
//    };

    List<String> expectedLanguage = Arrays.asList(
            "English",
            "Русский",
            "Українська",
            "dfsgf");

//    @Test
//    public void topMenuTest() {
//        IndexPage index = new IndexPage();
//
////        System.out.println(index.topMenu.currency.getValues());
////        System.out.println(index.topMenu.language.getValues());
//
//        SoftAssert softAssert = new SoftAssert();
//
//        List<String> actualCurrency = index.topMenu.currency.getValues();
//        List<String> actualLanguage = index.topMenu.language.getValues();
//
//        Collections.sort(actualCurrency);
//        Collections.sort(expectedCurrency);
//        Collections.sort(actualLanguage);
//        Collections.sort(expectedLanguage);
//
//
//        softAssert.assertEquals(
//                expectedCurrency,
//                actualCurrency,
//                "Currency is not Equals");
//
//
//        softAssert.assertEquals(
//                expectedLanguage,
//                actualLanguage,
//                "Language is not Equals");
//
//        softAssert.assertAll();
////        index.topMenu.currency.selectValue("$ US Dollar");
////        index.topMenu.language.selectValue("Українська");
//
//    }

//    @Test
//    public void topMenuCurr() {
//        IndexPage index = new IndexPage();
//
//        List<String> actualCurrency = index.topMenu.currency.getValues();
//
//        Assert.assertEquals(expectedCurrency, actualCurrency,"Currency is not Equals");
//    }
//
//    @Test
//    public void topMenuLang() {
//        IndexPage index = new IndexPage();
//
//        List<String> actualLanguage = index.topMenu.language.getValues();
//
//        Assert.assertEquals(expectedLanguage, actualLanguage, "Language is not Equals");
//    }

}
