package co.com.choucair.certification.testapi.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/features/methods.feature",
        //tags = "@MethodDelete",
        glue ={"co.com.choucair.certification.testapi.stepdefinitions.hook",
        "co.com.choucair.certification.testapi.stepdefinitions"}
)
public class Runner {
}
