package co.com.choucair.certification.testapi.interaction;

import co.com.choucair.certification.testapi.models.TestData;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ExecutedGet implements Interaction {

    private final String resource;

    public ExecutedGet(String resource) {
        this.resource = resource;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.reset();
        actor.attemptsTo(Get.resource(resource).
                with(request->request.contentType(ContentType.JSON).
                params(TestData.getData()).relaxedHTTPSValidation().log().all()));
    }

    public static ExecutedGet service(String resource){
        return Tasks.instrumented(ExecutedGet.class,resource);
    }
}
