@NoInput @All
Feature: smoke test to make sure advanced search is functioning

Scenario: Navigating to Advanced Search
Given I am on home page
When I click on Advanced Search link
Then I am taken to the Advanced Search page

Scenario: Searching for something and getting results
Given I am on Advanced Search page
When I search for a product
And my search terms are good
Then search results should be displayed

Scenario: Searching for something and there are no results
Given I am on Advanced Search page
When I search for a product
And my search terms are bad
Then no results should be displayed
