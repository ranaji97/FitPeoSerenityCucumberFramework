package tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static uielements.FitPeoHomePageUIElements.REVENUE_CALCULATOR_SLIDER_THUMB;

public class AdjustTheValueOfTheRevenueCalculatorSlider implements Task {

    private final String value;

    public AdjustTheValueOfTheRevenueCalculatorSlider(String value) {
        this.value = value;
    }

    public static Performable adjustTheValueOfSlider(String value) {
        return instrumented(AdjustTheValueOfTheRevenueCalculatorSlider.class, value);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElementFacade ele1 = REVENUE_CALCULATOR_SLIDER_THUMB.resolveFor(actor);

        System.out.println("Value :: " + value);

        int expectedValue = Integer.parseInt(value);

        if (expectedValue != 200 && expectedValue >= 0 && expectedValue <= 2000) {

            Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());

            int count = 200;
            System.out.println("Count :: " + count);

            actions.clickAndHold(ele1.getElement());

            for (int i = 0; i < count; i++) {
                actions.sendKeys(Keys.ARROW_LEFT);
            }

            actions.build().perform();


            actions = new Actions(BrowseTheWeb.as(actor).getDriver());

            count = Integer.parseInt(value);
            System.out.println("Count :: " + count);

            actions.clickAndHold(ele1.getElement());

            for (int i = 0; i < count; i++) {
                actions.sendKeys(Keys.ARROW_RIGHT);
            }

            actions.build().perform();

        }


    }
}
