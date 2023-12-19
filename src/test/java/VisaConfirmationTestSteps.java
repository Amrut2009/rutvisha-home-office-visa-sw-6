import gov.uk.check.visa.Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationTestSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I accept the cookies")
    public void iAcceptTheCookies() {
        new StartPage().acceptCookies();
    }

    @And("I click on hide button")
    public void iClickOnHideButton() {
        new StartPage().clickHideMessage();
    }

    @And("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I select nationality {string}")
    public void iSelectNationality(String australia) {
        new SelectNationalityPage().nationalityDropDownList("Australia");
    }

    @And("I click on  next step button")
    public void iClickOnNextStepButton() {
        new SelectNationalityPage().clickOnNextStepButton();
    }

    @And("I select reason for visit {string}")
    public void iSelectReasonForVisit(String reason) {
        new ReasonForTravelPage().selectReasonForVisit("Tourism");
    }

    @Then("verify result {string}")
    public void verifyResultYouWillNotNeedAVisaToComeToTheUK(String reason) {
        Assert.assertEquals(new ResultPage().getResultMessage(), "You will not need a visa to come to the UK" ,"Message displayed");
    }

    @And("I Select a Nationality {string}")
    public void iSelectANationalityChile(String chile) {
        new SelectNationalityPage().nationalityDropDownList("Chile");
    }


    @And("Select reason Work, academic visit or business")
    public void selectReasonWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().selectReasonForVisit("Work");
    }

    @When("Select intendent to stay for longer than {int} months")
    public void selectIntendentToStayForLongerThanMonths(int months) {
        new DurationOfStayPage().selectMoreThen6months();
    }

    @And("Select have planning to work for Health and care professional")
    public void selectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().selectJobType();
    }

    @Then("verify result of{string}")
    public void verifyResultOfYouNeedAVisaToWorkInHealthAndCare(String reason) {
        Assert.assertEquals(new ResultPage().getResultMessage(),"You need a visa to work in health and care", "Message Displayed");
    }


    @And("Select a Nationality {string}")
    public void selectANationalityColombia(String colombia) {
        new SelectNationalityPage().nationalityDropDownList("Colombia");
    }

    @And("Select reason Join partner or family for a long stay")
    public void selectReasonJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().selectReasonForVisit("family for a long stay");
    }

    @Then("To get verify result {string}")
    public void toGetVerifyResultYouMayNeedAVisa(String visa) {
        Assert.assertEquals(new ResultPage().getResultMessage(),"You may need a visa");
    }


    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new ReasonForTravelPage().clickOnContinueButton();
    }

    @Then("I can see following {string} into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown(String country)
    {
        new SelectNationalityPage().nationalityDropDownList(country);
        System.out.println(country);

    }

}
