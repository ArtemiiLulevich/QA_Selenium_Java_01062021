package ua.kiev.prog.automation.tests.base;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class Widget {

    final protected SelenideElement element;

    public Widget(SelenideElement element) {
        this.element = element;
    }
}
