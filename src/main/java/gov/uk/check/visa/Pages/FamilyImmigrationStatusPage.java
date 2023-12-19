package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectYes;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement ClickToContinue;
    public void setSelectYes(){
        clickOnElement(selectYes);
    }
    public void setClickToContinue(){
        clickOnElement(ClickToContinue);
    }
}
