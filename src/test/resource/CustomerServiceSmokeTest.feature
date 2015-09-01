@NoInput @All
Feature: Smoketest to make sure customer service page is functioning

Scenario: Navigating to customer service page
Given client website has a customer service page
When I click on the customer service link
Then I am taken to the customer service page
