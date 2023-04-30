package smarttech.ny.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//How do configure testNg with Cucumber? 
// Ans: with the help of "extends AbstractTestNGCucumberTests"
// How to run runner class? Ans: by create .xml file 

@CucumberOptions(
		//  plugin = {""}, // generate the report
		features = {".//Feature/"},// location of feature file
		glue = {"smarttech.ny.stepdefinitions"}  // location of step definition file 
		)
public class TestRunner extends AbstractTestNGCucumberTests {

	  
	
}
   