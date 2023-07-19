Feature: Add Category from Admin Dashboard
#  As a admin:
 # I want to add category  by filling  Add Category form with name,select a color, Subcategory & Upload Image.

  Scenario: Adding Category with valid details.
    Given Admin is already present on Login Page
    When Admin enters valid Username
    And Admin enters valid Password
    And Admin clicks on LOGIN button
    Then Category dropdown_menu has two options
    When Admin clicks on Add-category option
    Then Add Category form is visible in Admin Dashboard
    Then Admin enters category name
    Then Admin verify default color of header pallete is black
    And Admin selects Header color
#   And Admin selects  Sub-category option
#    And Admin Choose File to upload image
#    And Admin clicks on Save button
#    Then Category added successfully msg is displayed.