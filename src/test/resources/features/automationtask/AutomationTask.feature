@test
Feature: Test Cases

  @test1
  Scenario: Verify that the user us able to navigate to the FitPeo Homepage
    Given Tom navigates to the FitPeo Homepage

  @test2
  Scenario: Verify that the user is able to navigate to the Revenue Calculator Page from the FitPeo Homepage
    Given Tom navigates to the FitPeo Homepage
    When he navigates to the 'Revenue Calculator' Page
    Then he should see that the 'Revenue Calculator' Page is displayed

  @test3
  Scenario: Verify that the user is able to scroll Down to the Slider section present inside the Revenue Calculator Page
    Given Tom navigates to the FitPeo Homepage
    When he navigates to the 'Revenue Calculator' Page
    Then he should see that the 'Revenue Calculator' Page is displayed
    Then he scrolls down to the Revenue Calculator slider section inside the page

  @test4
  Scenario: Verify that the value of the slider is getting updated to '820' and the same value is getting updated inside the test field as well
    Given Tom navigates to the FitPeo Homepage
    When he navigates to the 'Revenue Calculator' Page
    Then he should see that the 'Revenue Calculator' Page is displayed
    Then he scrolls down to the Revenue Calculator slider section inside the page
    When he sets the value of the slider to '820' by adjusting the slider inside the page
    Then he should see that the position of the slider is updated and its value is set to '820'
    Then he should see that the value of the text field should be '820' present below the slider inside the page

  @test5
  Scenario: Verify that the upon updating the value of the text field the value of the slider is also getting updated
    Given Tom navigates to the FitPeo Homepage
    When he navigates to the 'Revenue Calculator' Page
    Then he should see that the 'Revenue Calculator' Page is displayed
    Then he scrolls down to the Revenue Calculator slider section inside the page
    When he sets the value of the slider to '820' by adjusting the slider inside the page
    Then he should see that the value of the text field should be '820' present below the slider inside the page
    When he updates the value of the text field to '560' present below the slider inside the page
    Then he should see that the position of the slider is updated and its value is set to '560'

  @test6
  Scenario: Verify that the checkboxes CPT Codes 'CPT-99091, CPT-99453, CPT-99454, CPT-99474' present inside the Revenue Calculator page are getting selected
    Given Tom navigates to the FitPeo Homepage
    When he navigates to the 'Revenue Calculator' Page
    Then he should see that the 'Revenue Calculator' Page is displayed
    Then he scrolls down to the Revenue Calculator slider section inside the page
    When he sets the value of the slider to '820' by adjusting the slider inside the page
    Then he should see that the position of the slider is updated and its value is set to '820'
    Then he should see that the value of the text field should be '820' present below the slider inside the page
    When he selects the below CPT Codes present inside the Revenue Calculator page:
      | CPT-99091 |
      | CPT-99453 |
      | CPT-99454 |
      | CPT-99474 |
    Then he should see that the checkboxes of the below CPT Codes present inside the Revenue Calculator page are selected:
      | CPT-99091 |
      | CPT-99453 |
      | CPT-99454 |
      | CPT-99474 |

  @test7
  Scenario: Verify that the header displaying 'Total Recurring Reimbursement for all Patients Per Month:' field shows the value '$110700'
    Given Tom navigates to the FitPeo Homepage
    When he navigates to the 'Revenue Calculator' Page
    Then he should see that the 'Revenue Calculator' Page is displayed
    Then he scrolls down to the Revenue Calculator slider section inside the page
    When he sets the value of the slider to '820' by adjusting the slider inside the page
    Then he should see that the position of the slider is updated and its value is set to '820'
    Then he should see that the value of the text field should be '820' present below the slider inside the page
    When he selects the below CPT Codes present inside the Revenue Calculator page:
      | CPT-99091 |
      | CPT-99453 |
      | CPT-99454 |
      | CPT-99474 |
    Then he should see that the checkboxes of the below CPT Codes present inside the Revenue Calculator page are selected:
      | CPT-99091 |
      | CPT-99453 |
      | CPT-99454 |
      | CPT-99474 |
    Then he should see that the value of the field 'Total Recurring Reimbursement for all Patients Per Month:' present inside the header at top is '$110700'