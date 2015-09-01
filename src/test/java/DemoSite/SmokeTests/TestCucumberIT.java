// This file makes your entire project run so don't screw it up

package DemoSite.SmokeTests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// Location of feature files
		features = { "src/test/resource" },
		
		// Makes results files nice and pretty, you can also choose what type
		// of file you want your results to be
		plugin = { "pretty",
		"html:target/cucumber-html-report", "json:target/json/output.json",
		"junit:target/cucumber-junit-report/allcukes.xml" },
		
		// Use tags to determine what tests you want to run
		tags = {}
)

public class TestCucumberIT extends AbstractPageStepDefinitions {

}