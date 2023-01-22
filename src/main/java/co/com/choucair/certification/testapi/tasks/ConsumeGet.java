package co.com.choucair.certification.testapi.tasks;

import co.com.choucair.certification.testapi.interaction.ExecutedGet;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ConsumeGet implements Task {

    private final String resource;

    public ConsumeGet(String resource) {
        this.resource = resource;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ExecutedGet.service(resource));
    }

    public static ConsumeGet service(String resource){
        return Tasks.instrumented(ConsumeGet.class,resource);
    }
}
