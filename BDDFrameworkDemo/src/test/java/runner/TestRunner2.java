package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
/*@RunWith->is a junit specific annotation
 & configures JUnit to use Cucumber as the test runner for executing the Cucumber scenarios
 defined in the TestRunner class
@RunWith(Cucumber.class)->is used with cucumber to take advtg of cucumber gherkin feature & functionality*/
@CucumberOptions(
        features="src/test/java/features/AddCategory.feature"
        ,glue={"stepdef"}
        , plugin = {
        "pretty","html:target/cucumber-reports/Report.html"}
//plugin={"pretty->Scenario ,usage->time taken"}
)
/*
@CucumberOptions->provide the necessary info for
Cucumber to find the feature files and match the steps with their corresponding step definitions.
features->path for feature file
glue->it configures respective stepdef class with feature file.
 */
public class TestRunner2 {
}