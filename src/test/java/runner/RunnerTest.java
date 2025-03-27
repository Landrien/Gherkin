package runner;

import BaseTest.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Exo1_Connexion.feature",
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true

)


public class RunnerTest  {

}
