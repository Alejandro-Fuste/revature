Feature: Practice using selenium with the demo selenium easy website

  Scenario: As a developer, I want to get practice testing with dynamic data
    Given the developer is on the dynamic data demo selenium easy website
    When the developer clicks on get new user button
    Then a profile picture will be present on the page
    And a first name will be present on the page
    And a last name will be present on the page