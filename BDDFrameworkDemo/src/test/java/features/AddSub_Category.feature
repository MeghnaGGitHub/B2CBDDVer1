Feature: Add SubCategory from Admin Dashboard
  Scenario: Editing SubCategory with valid details successfully.
    Given Admin is already present on Login Page
    When Admin enters valid Username
    And Admin enters valid Password
    And Admin clicks on LOGIN button
    Then SubCategory dropdown has 2 options
    When Admin clicks on Edit-Subcategory option
    Then Add SubCategory form is visible in Admin Dashboard
    Then Admin selects Category name
    And enter SubCategory name
    And Selects Header color
    And selects  Product Allowed option
    And Choose File to upload image
    And clicks on Save button
    Then SubCategory added successfully msg is displayed.