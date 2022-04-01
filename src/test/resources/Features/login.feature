Feature: feature to test loading of home page
  Scenario: Check if home page footer is loaded properly
    Given user is on home page
    When user scrolls down to the bottom
    Then user is able to see footer



