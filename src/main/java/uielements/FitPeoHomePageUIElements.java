package uielements;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FitPeoHomePageUIElements extends PageObject {

    public static Target NAVIGATE_TO_PAGE = Target.the("Navigate to Page - {0}")
            .locatedBy("//a//div[normalize-space() = '{0}']");

    public static By NAVIGATE_TO_PAGE_UAING_BY(String pageName) {
        return By.xpath("//a//div[normalize-space() = '" + pageName + "']");
    }

    public static Target SECTION_REVENUE_CALCULATOR_SLIDER = Target.the("Navigate - Section Revenue Calculator slider")
            .locatedBy("//div[./span[contains(@class, 'MuiSlider-root')]]");

    public static Target REVENUE_CALCULATOR_SLIDER_THUMB = Target.the("Revenue Calculator slider")
            .locatedBy("//div[./span[contains(@class, 'MuiSlider-root')]]//span[contains(@class, 'MuiSlider-thumb')]//input");

    public static Target TEXT_BOX_BELOW_REVENUE_CALCULATOR_SLIDER = Target.the("Text Box Below Revenue Calculator slider")
            .locatedBy("//div[contains(@class, 'MuiTextField-root')]//input");

    public static Target CPT_CODE_SELECT = Target.the("CPT Code - Select - {0}")
            .locatedBy("//div[./p[normalize-space() = '{0}']]//span[not(contains(@class, 'checked'))]//input[contains(@type, 'checkbox')]");

    public static Target CPT_CODE_SELECTED = Target.the("CPT Code - Selected - {0}")
            .locatedBy("//div[./p[normalize-space() = '{0}']]//span[(contains(@class, 'checked'))]");

    public static Target TOP_HEADER_FIELD_VALUE = Target.the("Top Header Field Value - {0}")
            .locatedBy("//header//div[contains(@class, 'MuiToolbar-gutters')]//p[normalize-space(text()) ='{0}']//p");

}
