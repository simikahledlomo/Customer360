package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"C:\\Development\\Automation\\Work Space\\NewDemo\\360\\Customer360\\src\\test\\resources\\Feature\\Customer360.feature"},
				glue = {"Steps"},
				dryRun = false,
				monochrome = true,
				plugin = {"pretty", "html:target/htmlreport.html"})

public class TestRunnerCustomer360 extends AbstractTestNGCucumberTests{

}
