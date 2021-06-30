package ua.kiev.prog.automation.base;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import ua.kiev.prog.automation.tools.Wait;

import java.lang.reflect.Constructor;
import java.time.Instant;

abstract public class BasePage {

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
    final public void confirmPage() {
        int timeOut = 30;
        long endTime = Instant.now().getEpochSecond() + timeOut;
        boolean found = false;

        while (!found && endTime > Instant.now().getEpochSecond()){
            found = this.readyElement().exists();
            if(!found){
                Wait.sleep(500);
            }
        }

        if(!found)
            throw new RuntimeException("Ready element is not found for page: "
                    + this.getClass().getSimpleName());
    }




    abstract protected SelenideElement readyElement();

}
