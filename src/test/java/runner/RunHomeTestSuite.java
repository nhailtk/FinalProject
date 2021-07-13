package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/report.html"},
        glue= "stepDef",
        features = "src/test/java/feature/Home.feature"
)

public class RunHomeTestSuite {
}
