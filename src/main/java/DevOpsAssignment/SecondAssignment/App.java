package DevOpsAssignment.SecondAssignment;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
		plugin = "json:target/cucumber-reports/CucumberTestReport.json"
)
public class App extends AbstractTestNGCucumberTests

{
	private TestNGCucumberRunner testNGCucumberRunner;

		
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
 
    
}
