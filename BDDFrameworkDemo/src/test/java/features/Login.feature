Feature: B2C Admin Login Feature
  Scenario:Admin is able to Login in B2C Login Page with valid credentials
    Given Admin is already present on Login Page
    When Admin enters valid Username
    And Admin enters valid Password
    And Admin clicks on LOGIN button
    Then Verify title of page

  Scenario: Admin is unable to Login in B2C Login Page with invalid Username and valid Password
    Given Admin is already present on Login Page
    When Admin enters invalid Username
    And Admin enters valid Password
    Then Admin clicks on LOGIN button
    And Admin should get a pop-up displayed as Invalid Cred or Password!!

   Scenario: Admin is unable to Login in B2C Login Page with valid Username and invalid Password
    Given Admin is already present on Login Page
    When Admin enters valid Username
     And Admin enters invalid Password
    Then Admin clicks on LOGIN button
    And Admin should get a pop-up displayed as Invalid Cred or Password!!