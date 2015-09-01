@NoInput @All
Feature: Smoketest to make sure search terms page is functioning

Scenario: Navigating to search terms page
Given I am on home page
When I Click on the search terms link
Then I am taken to search terms page

Scenario: Clicking on a search term
Given I am on search terms page
When I click on a search term
Then search results page for that search term is displayed
