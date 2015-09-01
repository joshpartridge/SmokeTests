@Input @All
Feature: Guest Checkout Smoke Test

  Background: 
    Given I am not a registered user
    Given I am on the homepage

  Scenario: Navigating to Checkout page
    Given I have product in my cart
    When I click on the shopping cart icon
    And click on the checkout button
    Then I am taken to Checkout page
    And options are displayed to checkout as guest, register and checkout, or login as a returning customer.

  Scenario: Checking out as guest
	Given I have product in my cart
	And I am on checkout page
    When I checkout as a guest
    Then I am able to complete my purchase
