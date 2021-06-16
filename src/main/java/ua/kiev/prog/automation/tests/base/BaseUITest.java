package ua.kiev.prog.automation.tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUITest {
//    protected WebDriver driver;

//    @BeforeMethod
//    public void beforeMethod(){
//        WebDriverManager.chromedriver().setup(); // Download last ver of chromedriver.exe
//        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--start-maximized");
////        options.addArguments("--disable-web-security"); first problem
////        options.addArguments("--headless");
//
//        driver = new ChromeDriver(options); // Create driver
//
//        driver.get("http://zvisno.com/");
//
////        driver.manage().window().maximize();
//    }

//    @AfterMethod
//    public void afterMethod() {
//        if (driver != null) {
//            driver.quit();
//        }
//         else {
//            throw new RuntimeException("Driver is null.");
//        }
//    }

    protected WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = Session.getInstance().driver();
    }

    @AfterMethod
    public void afterMethod() {
        Session.getInstance().quit();
    }

}
