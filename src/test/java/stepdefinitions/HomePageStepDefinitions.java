package stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import uielements.FitPeoHomePageUIElements;

public class HomePageStepDefinitions {

    @Given("{actor} navigates to the FitPeo Homepage")
    public void actorNavigatesToTheHomePage(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().the(FitPeoHomePageUIElements.class)
        );
    }

}
