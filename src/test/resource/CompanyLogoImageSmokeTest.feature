@NoInput @All
Feature: Smoke test to make sure home logo is working

  Scenario: Clicking company logo image
    Given I am on any page on the site
    When I click the company logo
    Then I am taken to site homepage
