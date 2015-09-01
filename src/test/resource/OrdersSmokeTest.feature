@NoInput @All
Feature: Smoketest to make sure orders page is functioning

Scenario: Navigating to Orders page
Given I am logged in
And I am on my account page
When I click on the orders link
Then I am taken to my orders page

Scenario: I have not placed any orders
Given I am logged in
And I am on my orders page
And I have not placed any orders
Then a message displays saying I have not placed any orders

Scenario: Viewing order
Given I am logged in
And I am on my orders page
And I have placed an order
When I click on the View Order Link
Then I am taken to order detail page
