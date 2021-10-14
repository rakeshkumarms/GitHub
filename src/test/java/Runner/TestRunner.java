package Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Login.feature", glue = "StepDef",
				plugin = {"pretty","html:target/cucumberReport.html", "json:src\\test\\resources\\Report\\output.json", "junit:target/cucumberjunit.xml", "rerun:testrun/rerun.txt"})
public class TestRunner {
	
	@AfterClass
	public static void afterClass() {
		String path= System.getProperty("user.dir");
		Reporting.jvmReport(path + "\\src\\test\\resources\\Report\\output.json");
		
		
	}
	

}
 