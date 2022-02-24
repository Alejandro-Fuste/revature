Feature: Practice using selenium with the demo selenium easy website

  Scenario: As a developer, I want to get practice testing a javascript alert box
    Given the developer is on the javascript alert demo selenium easy website
    When the developer clicks on the button to display an alert box
    Then a javascript alert should pop up at the top of the page
    And the alert is closed

  Scenario: As a developer, I want to get practice testing a javascript confirm box
    Given the developer is on the javascript alert demo selenium easy website
    When the developer clicks on the button to display a confirm alert
    And the developer clicks the ok button
    Then a message should be display on the page



  Scenario: As a developer, I want to get practice testing a javascript prompt box
    Given the developer is on the javascript alert demo selenium easy website
    When the developer clicks on the prompt box button
    And the developer enters a name
    And the developer clicks on the ok button
    Then the name should be displayed on the page
