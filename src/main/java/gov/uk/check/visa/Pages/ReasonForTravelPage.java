package gov.uk.check.visa.Pages;

import gov.uk.check.visa.browserfactory.ManageBrowser;
import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label")
    List<WebElement> reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;



    public void selectReasonForVisit(String reason) {
        log.info("select Reason for visit");
        for (WebElement element : reasonForVisitList) {
            if (element.getText().contains(reason)) {
                clickOnElement(element);
                break;
            }
        }
    }




    public void clickOnContinueButton() {
        log.info("click on continue button");

        clickOnElement(continueButton);

    }

}
