package testRun;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\resources",glue="stepDefinition")
public class TestSignUpFeature {

}
