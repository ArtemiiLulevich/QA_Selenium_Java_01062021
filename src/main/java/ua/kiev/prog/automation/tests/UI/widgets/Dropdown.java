package ua.kiev.prog.automation.tests.UI.widgets;

import com.codeborne.selenide.SelenideElement;
import ua.kiev.prog.automation.tests.base.Widget;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dropdown extends Widget {

    final private SelenideElement _menuList;

    public Dropdown(SelenideElement element) {
        super(element);
        _menuList = this.element.$x("../ul[contains(@class, 'dropdown-menu')]");
    }

    public void click(){
        this.element.click();
    }

    public List<String> getValues(){
//        List<String> result = new ArrayList<>();
//        List<SelenideElement> liList = _menuList.$$x("./li");
//
//        for (SelenideElement e: liList
//             ) {
//            result.add(e.getAttribute("innerText").trim());
//        }
//        return result;

        return _menuList.$$x("./li")
                .stream()
                .map(element1 -> element1
                        .getAttribute("innerText").trim())
                        .collect(Collectors.toList());

    }

    public void selectValue(String value) {
        value = value.trim();
        if(!_menuList.isDisplayed())
            this.element.click();
        SelenideElement valToSelect = _menuList.$x("./li[normalize-space()='" + value +"']");
        if(valToSelect.exists())
            valToSelect.click();
        else
            throw new RuntimeException("Value \"" + value + "\" is not found for dropdown");
    }

    public boolean hasValue(String value) {
        return _menuList.$x("./li[normalize-space()='" + value +"']").exists();
    }


}