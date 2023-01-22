package co.com.choucair.certification.testapi.tasks;

import co.com.choucair.certification.testapi.models.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Load implements Task {
    private final Map<String,String> testdata;

    public Load(Map<String, String> testdata) {
        this.testdata = testdata;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<Map.Entry<String,String>> testDataAux= testdata.entrySet();
        TestData.setData(testDataAux.stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)));
    }
    public static Load testData(Map<String,String> testData){
        return Tasks.instrumented(Load.class,testData);
    }
}
