package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static uielements.FitPeoHomePageUIElements.TOP_HEADER_FIELD_VALUE;

public class ValueOfTheGivenFieldPresentInsideTheHeaderAtTop implements Question<String> {

    private final String fieldName;

    public ValueOfTheGivenFieldPresentInsideTheHeaderAtTop(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Attribute.of(TOP_HEADER_FIELD_VALUE.of(fieldName)).named("innerText").answeredBy(actor);
    }

    public static ValueOfTheGivenFieldPresentInsideTheHeaderAtTop valueOfTheGivenFieldPresentInsideTheHeaderAtTop(String fieldName) {
     return new ValueOfTheGivenFieldPresentInsideTheHeaderAtTop(fieldName);
    }
}
