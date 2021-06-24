package ua.kiev.prog.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.kiev.prog.automation.base.BaseUITest;
import ua.kiev.prog.automation.tools.Wait;


public class TestClassTest extends BaseUITest {

    @Test
    public void testMethod() {
//        System.out.println("Hello World!");


        WebElement tablets = driver.findElement(
                By.xpath("//nav[@id='menu']//ul/li[normalize-space()='Tablets']"));
        tablets.click();

        WebElement addToCart = driver.findElement(
                By.xpath("//div[@id='content']//div[contains(@class, 'product-thumb')]//button[1]"
        ));
        addToCart.click();
        Wait.sleep(5000);
        WebElement successMessage = driver.findElement(
                By.xpath("//div[contains(@class, alert-success)]")
        );

        Assert.assertTrue(successMessage.isDisplayed(), "Message is not displayed");
        Assert.assertTrue(successMessage.getText().contains("Успешно. Вы добавили"));
//        List<WebElement> menuItemsList = driver.findElements(
//                By.xpath("//nav[@id='menu']//ul/li/a"));

//        List<WebElement> menuItemsList = driver.findElements(
//                By.cssSelector("nav#menu ul > li > a"));

//        for (WebElement element: menuItemsList){
////            if (element.getText().equalsIgnoreCase("software")){
////                element.click();
////                break;
////            }
//
//            if ("software".equalsIgnoreCase(element.getText())){
////                element.click();
//                ((JavascriptExecutor) driver).executeScript(
//                        "arguments[0].click();", element);
//                break;
//            }
//        }
        Wait.sleep(5000);
    }
}
