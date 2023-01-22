package co.com.choucair.certification.testapi.stepdefinitions;

import co.com.choucair.certification.testapi.questions.StatusCode;
import co.com.choucair.certification.testapi.tasks.ConsumeGet;
import co.com.choucair.certification.testapi.utils.resource.WebServiceEndPointsPost;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PostStepDefinition {

    @When("I use the POST method")
    public void iUseThePOSTMethod() {
        theActorInTheSpotlight().attemptsTo(ConsumeGet.service(WebServiceEndPointsPost.URI.getUrl()));
    }


    @Then("I can see the confirmation post code {int}")
    public void iCanSeeTheConfirmationPostCode(int responseCode) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat((StatusCode.is(responseCode))));
    }

}
