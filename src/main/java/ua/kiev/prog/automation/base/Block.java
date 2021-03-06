package ua.kiev.prog.automation.base;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Constructor;

abstract public class Block {

    final protected WebDriver driver = Session.getInstance().driver();
    final protected SelenideElement element;

//    public Block(By locator) {
//        try {
//            element = driver.findElement(locator);
//        } catch (Throwable e) {
//            throw new RuntimeException("Could not find block", e);
//        }
//    }

    public Block(SelenideElement e) {
            this.element = e;
    }

    protected <T extends BasePage> T page(Class<T> pageClass){
        try{
            Constructor<T> constructor = pageClass.getConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Could not create instance", e);
        }
    }

}
