package smarttech.ny.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//How do configure testNg with Cucumber? 
// Ans: with the help of "extends AbstractTestNGCucumberTests"
// How to run runner class? Ans: by creating .xml file 

@CucumberOptions(
		plugin = {"pretty","json:target/cucumber.json" }, // generate the report
		features = {".//Feature/"},		// location of feature file
		glue = {"smarttech.ny.stepdefinitions", "smarttech.ny.hooks" } 		// location of step definition file 
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}




   
