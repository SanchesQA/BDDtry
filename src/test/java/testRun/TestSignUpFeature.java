package testRun;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\resources",glue="stepDefinition",plugin={"html:src\\reports\\cucucmber-report"})
public class TestSignUpFeature{


   }
