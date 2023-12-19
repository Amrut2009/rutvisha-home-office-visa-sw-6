package gov.uk.check.visa.Pages;

import gov.uk.check.visa.browserfactory.ManageBrowser;
import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ManageBrowser.class);
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Hide this message')]")
    WebElement hideMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;

    public void acceptCookies() {
        log.info("accept cookies");
        clickOnElement(acceptCookies);
    }

    public void clickHideMessage() {
        log.info("Click on hide message");
        clickOnElement(hideMessage);
    }

    public void clickStartNow() {
        log.info("Click on start Button");
        clickOnElement(startNowButton);
    }
}
