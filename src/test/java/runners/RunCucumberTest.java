package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions"},
        tags = "@Smoke",
        
        plugin = {
                "pretty",
                "html:target/htmlreports/report.html",
                "json:target/jsonreports/report.json",
                "junit:target/junitreports/report.xml"
        },

        monochrome = true
)

public class RunCucumberTest {

}

