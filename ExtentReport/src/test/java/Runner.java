import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@tarea2",
        glue = "stepdefinitions",
        //plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        //plugin = {"html:target/cucumber-report/index.html", "json:target/cucumber-report/cucumber.json"}
)


public class Runner {
}
