package Runner;

 
	
	import cucumber.api.CucumberOptions;

	import cucumber.api.testng.AbstractTestNGCucumberTests;

	@CucumberOptions(features="Feature", glue="Script",tags={"@MyHCl,@Itime"})
	public class runner extends AbstractTestNGCucumberTests {

	}


