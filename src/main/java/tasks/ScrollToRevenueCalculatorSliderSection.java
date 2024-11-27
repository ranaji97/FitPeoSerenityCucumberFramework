package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static uielements.FitPeoHomePageUIElements.SECTION_REVENUE_CALCULATOR_SLIDER;

public class ScrollToRevenueCalculatorSliderSection implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].scrollIntoView({block: 'nearest', inline: 'center'});", SECTION_REVENUE_CALCULATOR_SLIDER.resolveFor(actor));

    }

    public static Performable scrollToRevenueCalculatorSliderSection() {
        return instrumented(ScrollToRevenueCalculatorSliderSection.class);
    }


}
