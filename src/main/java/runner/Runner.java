package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/features/testfeature.feature",
        tags="@Tag1",
        glue = {"steps"},monochrome = true,dryRun = false)

public class Runner {
}
