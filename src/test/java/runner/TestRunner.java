package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/main/features"},
        glue = {"stepDefinition"},
        plugin={"pretty","json:target/report.json"}



)

public class TestRunner {
}
