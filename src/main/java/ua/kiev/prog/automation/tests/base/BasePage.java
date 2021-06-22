package ua.kiev.prog.automation.tests.base;

import org.openqa.selenium.WebDriver;


import java.lang.reflect.Constructor;

public class BasePage {

    final protected WebDriver driver = Session.getInstance().driver();

//    public BasePage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }

    public BasePage() {
//        PageFactory.initElements(driver, this);
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
