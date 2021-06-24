package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/cucumber",
        glue = {"ua.kiev.prog.automation.steps"},
        plugin = {
                "pretty:target/cucumber-pretty.txt",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)
public class CucumberSuiteTest extends AbstractTestNGCucumberTests {

}
