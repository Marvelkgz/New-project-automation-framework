package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/UIfeatures",
        glue = "stepDefs",
        tags =  "@AddNewUser",
        monochrome = true,
        dryRun = false
)
public class RunnerSmoke {

}
