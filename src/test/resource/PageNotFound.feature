@NoInput @All
Feature: Smoketest to make sure page not found is functioning

Scenario: User is on page with invalid URL
Given I am on client website
When I type in invalid URL for website
And press enter
Then I am taken to Page not found page

Scenario: Navigating to homepage from page not found
Given I am on Page not found page
When I click the homepage link
Then I am taken to homepage
