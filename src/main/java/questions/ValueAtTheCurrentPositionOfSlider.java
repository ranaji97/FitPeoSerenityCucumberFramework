package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static uielements.FitPeoHomePageUIElements.REVENUE_CALCULATOR_SLIDER_THUMB;

public class ValueAtTheCurrentPositionOfSlider implements Question<String> {

    public static ValueAtTheCurrentPositionOfSlider valueAtTheCurrentPositionOfSlider() {
        return new ValueAtTheCurrentPositionOfSlider();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Attribute.of(REVENUE_CALCULATOR_SLIDER_THUMB).named("valueAsNumber").answeredBy(actor);
    }
}
