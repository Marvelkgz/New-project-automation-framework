package AllMyWork.homeWork.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "AllMyWork/homeWork/stepDefibitions",
        tags =  "@Demo",
        dryRun = false
)
public class RunnerClass {

}