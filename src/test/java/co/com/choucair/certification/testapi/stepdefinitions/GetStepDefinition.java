package co.com.choucair.certification.testapi.stepdefinitions;

import co.com.choucair.certification.testapi.questions.StatusCode;
import co.com.choucair.certification.testapi.tasks.ConsumeGet;
import co.com.choucair.certification.testapi.tasks.Load;
import co.com.choucair.certification.testapi.utils.resource.WebServiceEndPointsGet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import java.util.List;
import java.util.Map;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class GetStepDefinition {

    @Given("Api login")
    public void apiLogin(List<Map<String, String>> data) {
        theActorInTheSpotlight().wasAbleTo(Load.testData(data.get(0)));
    }

    @When("I use the GET method")
    public void iUseTheGETMethod() {
        theActorInTheSpotlight().attemptsTo(ConsumeGet.service(WebServiceEndPointsGet.URI.getUrl()));
    }

    @Then("I can see the confirmation code {int}")
    public void iCanSeeTheConfirmationCode(int code)  {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat((StatusCode.is(code))));
    }

}
