package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static uielements.FitPeoHomePageUIElements.NAVIGATE_TO_PAGE;

public class NavigateToPage {

    public static NavigateToGivenPage navigateToGivenPage(String pageName) {
        return instrumented(NavigateToGivenPage.class, pageName);
    }

    public static class NavigateToGivenPage implements Task {

        private final String pageName;

        public NavigateToGivenPage(String pageName) {
            this.pageName = pageName;
        }

        @Override
        public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    Click.on(NAVIGATE_TO_PAGE.of(pageName))
            );

        }
    }

}
