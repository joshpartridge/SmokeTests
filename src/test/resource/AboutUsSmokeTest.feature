@NoInput @All
Feature: Smoketest to make sure about us page is functioning

Scenario: Navigating to about us page
Given client website has an about us page
When I click on the about us link
Then I am taken to the about us page
