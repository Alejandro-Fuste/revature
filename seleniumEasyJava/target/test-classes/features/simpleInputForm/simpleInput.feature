Feature: Practice using selenium with the demo selenium easy website

  Scenario: As a developer, I want to get practice testing a single input field
    Given the developer is on the demo selenium easy website
    When the developer closes the pop-up advertisement
    When the developer enters a message into the input box
    When the developer clicks on the show message button
    Then the message typed in the input box will display on the page

  Scenario: As a developer, I want to get practice testing two input fields
    Given the developer is on the demo selenium easy website
    When the developer enters a value into the a input box
    When the developer enters a value into the b input box
    When the developer clicks on the total button
    Then the total will display on the page