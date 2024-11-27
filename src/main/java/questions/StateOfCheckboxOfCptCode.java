package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static uielements.FitPeoHomePageUIElements.CPT_CODE_SELECTED;

public class StateOfCheckboxOfCptCode implements Question<Boolean> {

    private final String cptCode;

    public StateOfCheckboxOfCptCode(String cptCode) {
        this.cptCode = cptCode;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(CPT_CODE_SELECTED.of(cptCode)).answeredBy(actor);
    }

    public static StateOfCheckboxOfCptCode stateOfCheckboxOfCptCode(String cptCode) {
        return new StateOfCheckboxOfCptCode(cptCode);
    }
}
