Feature: Practice using selenium with the demo selenium easy website

  Scenario: As a developer, I want to get practice testing a drag and drop demo
    Given the developer is on the drag and drop demo selenium easy website
    When the developer clicks on a draggable box
    And drags the box to the drop box
    And drops the box in the drop zone
    Then the box gets added to the items list