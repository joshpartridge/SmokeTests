@NoInput @All
Feature: Smoketest to make sure crumb tray is functioning

Scenario: Click on links in crumb tray
Given I am on any page on the site
When I click a link in the crumb tray
Then I am taken to the correct page