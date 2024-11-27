package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static uielements.FitPeoHomePageUIElements.CPT_CODE_SELECT;
import static uielements.FitPeoHomePageUIElements.CPT_CODE_SELECTED;

public class SelectCPTCode implements Task {

    private final String cptCode;

    public SelectCPTCode(String cptCode) {
        this.cptCode = cptCode;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].scrollIntoView({block: 'nearest', inline: 'center'});", CPT_CODE_SELECT.of(cptCode).resolveFor(actor));

        actor.attemptsTo(

                Click.on(CPT_CODE_SELECT.of(cptCode)),
                WaitUntil.the(CPT_CODE_SELECTED.of(cptCode), isVisible()).forNoMoreThan(Duration.ofSeconds(10))
        );

    }

    public static Performable selectCptCode(String cptCode) {
        return instrumented(SelectCPTCode.class, cptCode);
    }
}
