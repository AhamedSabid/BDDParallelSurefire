@smoke
Feature: Google Search Functionality

  Scenario: Search for a keyword on Google
    Given I am on the Google homepage
    When I enter "GitHub Copilot" into the search bar
    #And I click the search button
    Then I should see search results related to "Register"