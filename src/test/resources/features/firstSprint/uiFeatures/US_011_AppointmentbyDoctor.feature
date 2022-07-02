@edit_portal
Feature:US_011 My Appointments Edit portal by Physician(Doctor)

    Background:Sign in as a physician
      Given user is navigated to medunna.com
      And user waits 3 seconds
      Then user navigates the sign in page with validUsername and validPassword
      And user waits 3 seconds
      And user signs in
      And user navigates to My Pages segment
      And user clicks on My appointments
      And user waits 3 seconds
      And user clicks on Edit button
      And user verifies the website shows the Create or Edit an Appointment text




  @US011_TC001
      Scenario:TC_001 Check Patient's id
      And user verifies patient's info id is visible
      And closes the page
  @US011_TC002
  Scenario:TC_001 Check Patient's start date
    And user verifies patient's start date is visible
    And closes the page
  @US011_TC003
  Scenario:TC_001 Check Patient's end date
    And user verifies patient's end date is visible
    And closes the page
  @US011_TC004
  Scenario:TC_001 Check Patient's status
    And user verifies patient's status is visible
    And closes the page
  @US011_TC005
  Scenario:TC_001 Check Patient's physician
    And user verifies patient's physician is visible
    And verify the patient's physician name which should be the same with login user's name
    Then closes the page
  @US011_TC006
  Scenario:TC_001 Check Patient's name
    And user verifies patient's name is visible
    And closes the page
  @US011_TC007
  Scenario:TC_001 Check Doctor fills in required fields and save
    And user fills in required fields, anemnesis, treatment, diagnosis
    And user clicks on Save button
    And verify appointment is saved successfully
    Then closes the page



