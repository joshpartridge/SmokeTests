@NoInput @All
Feature: smoketest to make sure privacy policy page is functioning

Scenario: Navigating to privacy policy page
Given client website has a privacy policy page
When I click on the privacy policy link
Then I am taken to the privacy policy page
