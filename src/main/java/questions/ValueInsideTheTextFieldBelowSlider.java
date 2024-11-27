package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static uielements.FitPeoHomePageUIElements.TEXT_BOX_BELOW_REVENUE_CALCULATOR_SLIDER;

public class ValueInsideTheTextFieldBelowSlider implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Attribute.of(TEXT_BOX_BELOW_REVENUE_CALCULATOR_SLIDER).named("value").answeredBy(actor);
    }

    public static ValueInsideTheTextFieldBelowSlider valueInsideTheTextField() {
        return new ValueInsideTheTextFieldBelowSlider();
    }


}
