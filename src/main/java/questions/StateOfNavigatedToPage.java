package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import static uielements.FitPeoHomePageUIElements.NAVIGATE_TO_PAGE;
import static uielements.FitPeoHomePageUIElements.NAVIGATE_TO_PAGE_UAING_BY;

public class StateOfNavigatedToPage {

    public static IsNavigatedToPageDisplayed isNavigatedToPageDisplayed(String pageName) {
        return new IsNavigatedToPageDisplayed(pageName);
    }

    public static class IsNavigatedToPageDisplayed implements Question<Boolean> {

        private final String pageName;

        public IsNavigatedToPageDisplayed(String pageName) {
            this.pageName = pageName;
        }

        @Override
        public Boolean answeredBy(Actor actor) {

            boolean checkStatus = IsElementVisible(actor, NAVIGATE_TO_PAGE_UAING_BY(pageName), 20);

            if(checkStatus) {

                WebElementFacade ele = NAVIGATE_TO_PAGE.of(pageName).waitingForNoMoreThan(Duration.ofSeconds(10)).resolveFor(actor);
                String classValue = ele.getAttribute("class").split(" ")[2].replace("-", " ");
                System.out.println("classValue :: " + classValue);

                WebElementFacade ele2 = Target.the("Style").locatedBy("//style[@data-emotion = 'css r3xbt7']").resolveFor(actor);
                String value = ele2.getAttribute("innerHTML");
                System.out.println("Value :: " + value);

                return StringUtils.containsIgnoreCase(value, "border-bottom");

            }

            return false;

        }
    }

    public static boolean IsElementVisible(Actor actor, By by, int maxTimeOut) {

        boolean status = true;

        FluentWait<WebDriver> wait = new FluentWait<>(BrowseTheWeb.as(actor).getDriver())
                .withTimeout(Duration.ofSeconds(maxTimeOut))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(TimeoutException.class)
                .ignoring(StaleElementReferenceException.class);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }
        catch (Exception e) {
            status = false;
        }

        return status;

    }

}
