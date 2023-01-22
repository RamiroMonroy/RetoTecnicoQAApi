package co.com.choucair.certification.testapi.stepdefinitions;

import co.com.choucair.certification.testapi.questions.StatusCode;
import co.com.choucair.certification.testapi.tasks.ConsumeGet;
import co.com.choucair.certification.testapi.utils.resource.WebServiceEndPointsDelete;
import co.com.choucair.certification.testapi.utils.resource.WebServiceEndPointsPut;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DeleteStepDefinition {

    @When("I use the DELETE method")
    public void iUseTheDELETEMethod() {
        theActorInTheSpotlight().attemptsTo(ConsumeGet.service(WebServiceEndPointsDelete.URI.getUrl()));
    }


    @Then("I can see the confirmation delete code {int}")
    public void iCanSeeTheConfirmationDeleteCode(int responseCode) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat((StatusCode.is(responseCode))));
    }

}
