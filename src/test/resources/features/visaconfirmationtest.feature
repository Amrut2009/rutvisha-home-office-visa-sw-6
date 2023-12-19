Feature: VisaConfirmationTest
  As a user i want to login into gov.uk.website
  @sanity@smoke@regression
  Scenario: anAustralianComingToUKForTourism.
    Given I am on HomPage
When  I Click on start button
And I Select a Nationality 'Australia'
And I Click on Continue button
And I Select reason 'Tourism'

And I Click on Continue button
Then verify result 'You will not need a visa to come to the UK'

@smoke@regression
Scenario: aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths.
  Given I am on HomPage
When I Click on start button
And I Select a Nationality 'Chile'
And I Click on Continue button
And I Select reason 'Work, academic visit or business'
And I Click on Continue button
And I Select intendent to stay for 'longer than 6 months'
And I Click on Continue button
And I Select have planning to work for 'Health and care professional'
And I Click on Continue button
Then verify result 'You need a visa to work in health and care'
@regression
  Scenario: Verify you’ll need a visa to join your family or partner in the UK
    Given I am on home page
    When I click on start button
    And Select a Nationality 'Colombia'
    And  I click on continue button
    And Select reason Join partner or family for a long stay
    And  I click on continue button
    Then To get verify result 'You may need a visa'


   @smoke @sanity
  Scenario Outline: Verify the following country is available in country dropdown list
    Given I am on home page
    When  I click on start button
    Then  I can see following '<country>' into dropdown

    Examples:
      | country                |
      |Albania                 |
      |Bhutan                  |
      |British protected person|
      |Haiti                   |
      |Kazakhstan              |
      |Mozambique              |
      |Norway                  |
      |Portugal                |
      |Russia                  |
      |Zambia                  |