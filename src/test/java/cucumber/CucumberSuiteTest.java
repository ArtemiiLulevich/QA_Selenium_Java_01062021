package cucumber;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ua.kiev.prog.automation.base.Session;


@CucumberOptions(
        features = "src/test/resources/cucumber",
        glue = {"ua.kiev.prog.automation.steps"},
        plugin = {
                "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)
public class CucumberSuiteTest extends AbstractTestNGCucumberTests {
        @BeforeMethod
        public void before() {
                WebDriverRunner.setWebDriver(Session.getInstance().driver());
        }

        @AfterMethod
        public void after() {
                Session.getInstance().quit();
        }
}
