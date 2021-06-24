package ua.kiev.prog.automation.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Session {

    final static private Session _instance = new Session();

    static public Session getInstance() {
//        if(_instance == null) {
//            _instance = new Session();
//        }
        return _instance;
    }

    private Session() {}

    private WebDriver _driver;

    final public WebDriver driver() {
        if (_driver == null) {
            WebDriverManager.chromedriver().setup(); // Download last ver of chromedriver.exe
            ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        options.addArguments("--disable-web-security"); first problem
        options.addArguments("--headless");

            _driver = new ChromeDriver(options); // Create driver

            _driver.get("http://zvisno.com/");

//        driver.manage().window().maximize();
        }
        return _driver;
    }

    final public void quit() {
        if (_driver != null) {
            _driver.quit();
        }
        _driver = null;
    }


}
