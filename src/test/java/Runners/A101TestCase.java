package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
            features = {"src/test/java/FeatureFiles"},
            glue = {"StepDefinitions"},
            plugin = {"html:target//cucumber-reports.html"}
)
public class A101TestCase extends AbstractTestNGCucumberTests {

}
