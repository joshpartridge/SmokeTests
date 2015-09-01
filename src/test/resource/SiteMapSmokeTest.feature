@NoInput @All
Feature: Smoketest to make sure sitemap is functioning

Background:
Given there is a site map page

Scenario: Navigating to site map
Given I am on homepage
And there is a site map link
When I click on the site map link
Then I am taken to site map

Scenario: Navigation to page from site map
Given I am on site map
When I click a link on the site map
Then I am taken to the correct page
