package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import questions.*;
import tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class RevenueCalculatorPageStepDefinitions {

    @When("{actor} navigates to the {string} Page")
    public void actorNavigatesToTheGivenPage(Actor actor, String pageName) {
        actor.attemptsTo(
                NavigateToPage.navigateToGivenPage(pageName)
        );
    }

    @Then("{actor} should see that the {string} Page is displayed")
    public void actorShouldSeeThatTheGivenPageIsDisplayed(Actor actor, String pageName) {
        actor.should(
                seeThat(StateOfNavigatedToPage.isNavigatedToPageDisplayed(pageName), is(true))
        );
    }

    @When("{actor} scrolls down to the Revenue Calculator slider section inside the page")
    public void actorScrollsDownToRevenueCalculatorSliderSection(Actor actor) {
        actor.attemptsTo(
                ScrollToRevenueCalculatorSliderSection.scrollToRevenueCalculatorSliderSection()
        );
    }

    @When("{actor} sets the value of the slider to {string} by adjusting the slider inside the page")
    public void actorAdjustsTheSliderToGivenValue(Actor actor, String value) {
        actor.attemptsTo(
                AdjustTheValueOfTheRevenueCalculatorSlider.adjustTheValueOfSlider(value)
        );
    }

    @Then("{actor} should see that the value of the text field should be {string} present below the slider inside the page")
    public void actorShouldSeeThatTheValueOfTheTextFieldIsAsExpected(Actor actor, String value) {
        actor.should(
                seeThat(ValueInsideTheTextFieldBelowSlider.valueInsideTheTextField(), is(value))
        );
    }

    @When("{actor} updates the value of the text field to {string} present below the slider inside the page")
    public void actorUpdatesTheValueOfTheTextField(Actor actor, String value) {
        actor.attemptsTo(
                UpdateTheValueInsideTheTextFieldBelowSlider.updateTheValue(value)
        );
    }

    @Then("{actor} should see that the position of the slider is updated and its value is set to {string}")
    public void actorShouldSeeThatThePositionAndTheValueOfTheSliderIsUpdated(Actor actor, String value) {
        actor.should(
                seeThat(ValueAtTheCurrentPositionOfSlider.valueAtTheCurrentPositionOfSlider(), is(value))
        );
    }

    @When("{actor} selects the below CPT Codes present inside the Revenue Calculator page:")
    public void actorUpdatesTheValueOfTheTextField(Actor actor, List<String> cptCodes) {
        cptCodes.forEach(cptCode ->
                actor.attemptsTo(
                        SelectCPTCode.selectCptCode(cptCode)
                )
        );

    }

    @Then("{actor} should see that the checkboxes of the below CPT Codes present inside the Revenue Calculator page are selected:")
    public void actorShouldSeeThatThePositionAndTheValueOfTheSliderIsUpdated(Actor actor, List<String> cptCodes) {
        cptCodes.forEach(cptCode ->
                actor.should(
                        seeThat(StateOfCheckboxOfCptCode.stateOfCheckboxOfCptCode(cptCode), is(true))
                )
        );
    }

    @Then("{actor} should see that the value of the field {string} present inside the header at top is {string}")
    public void actorShouldSeeThatThePositionAndTheValueOfTheSliderIsUpdated(Actor actor, String fieldName, String value) {
        actor.should(
                seeThat(ValueOfTheGivenFieldPresentInsideTheHeaderAtTop.valueOfTheGivenFieldPresentInsideTheHeaderAtTop(fieldName), is(value))
        );
    }


}
