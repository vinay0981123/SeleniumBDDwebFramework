package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/Features/MyApprovals.feature",
            glue = {"StepDefinitions"},
            monochrome = true,
            dryRun = false,
//            plugin = {"pretty","junit:target/JunitReports/index.xml",
//                    "html:target/HtmlReports/index.html",
//                    "json:target/JSONReports/index.json"
//            }
            plugin = {"pretty",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                    "timeline:test-output-thread/","junit:target/JunitReports/index.xml",
                    "html:target/HtmlReports/index.html",
                    "json:target/JSONReports/index.json"
            }
            ,tags = "@task"
    )
    public class testRunner {
    }



