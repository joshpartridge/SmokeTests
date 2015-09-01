@NoInput @All
Feature: Smoke tests to test static content category pages

Scenario: Navigating to static content category page
Given I am on the homepage
When I select a category with static content from the main navigation
Then I should be directed to that category page

Scenario: Navigating to subcategory pages from static content category page
Given I am on a static content category page
When I select a subcategory image
Then I should be directed to that subcategory