@NoInput @All
Feature: Smoketesting to test registered user checkout

Background:
Given I am a registered user

Scenario: Navigating to Checkout page when I’m a registered user and logged in
Given I am logged in
And I have product in my cart
When I click on the shopping cart icon
And click on the checkout button
Then I am taken to Checkout page
And There is no option for guest checkout

Scenario: Navigating to Checkout page when I’m a registered user and not logged in
Given I am not logged in
And I have product in my cart
When I click on the shopping cart icon
And click on the checkout button
Then I am taken to Checkout page
And options are displayed to checkout as guest, register and checkout, or login as a returning customer.

Scenario: Checking out as a registered user
Given I am logged in
And I have product in my cart
When I checkout as a registered user
Then I am able to complete my purchase as a registered user
