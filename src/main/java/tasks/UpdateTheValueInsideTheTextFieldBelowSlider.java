package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static uielements.FitPeoHomePageUIElements.TEXT_BOX_BELOW_REVENUE_CALCULATOR_SLIDER;

public class UpdateTheValueInsideTheTextFieldBelowSlider implements Task {

    private final String value;

    public UpdateTheValueInsideTheTextFieldBelowSlider(String value) {
        this.value = value;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("Value :: " + value);

        actor.attemptsTo(
                Click.on(TEXT_BOX_BELOW_REVENUE_CALCULATOR_SLIDER),
                Enter.keyValues(Keys.chord(Keys.CONTROL, "a")).into(TEXT_BOX_BELOW_REVENUE_CALCULATOR_SLIDER),
                Enter.keyValues(Keys.BACK_SPACE).into(TEXT_BOX_BELOW_REVENUE_CALCULATOR_SLIDER),
                Enter.keyValues(value).into(TEXT_BOX_BELOW_REVENUE_CALCULATOR_SLIDER)
        );

    }

    public static Performable updateTheValue(String value) {
        return instrumented(UpdateTheValueInsideTheTextFieldBelowSlider.class, value);
    }
}
