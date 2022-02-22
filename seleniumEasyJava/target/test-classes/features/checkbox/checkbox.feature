Feature: Practice using selenium with the demo selenium easy website

  Scenario: As a developer, I want to get practice testing a single checkbox
    Given the developer is on the checkbox demo selenium easy website
    When the developer clicks on single check box
    Then a success message pops up on the screen


  Scenario: As a developer, I want to get practice testing a multiple checkboxes
    Given the developer is on the checkbox demo selenium easy website
    When the developer clicks on the check all button
    Then all the checkboxes get checked