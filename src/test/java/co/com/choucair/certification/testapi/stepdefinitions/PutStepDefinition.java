package co.com.choucair.certification.testapi.stepdefinitions;

import co.com.choucair.certification.testapi.questions.StatusCode;
import co.com.choucair.certification.testapi.tasks.ConsumeGet;
import co.com.choucair.certification.testapi.utils.resource.WebServiceEndPointsPost;
import co.com.choucair.certification.testapi.utils.resource.WebServiceEndPointsPut;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PutStepDefinition {

    @When("I use the PUT method")
    public void iUseThePUTMethod() {
        theActorInTheSpotlight().attemptsTo(ConsumeGet.service(WebServiceEndPointsPut.URI.getUrl()));
    }


    @Then("I can see the confirmation put code {int}")
    public void iCanSeeTheConfirmationPutCode(int responseCode) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat((StatusCode.is(responseCode))));
    }

}
