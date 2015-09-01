@NoInput @All
Feature: Smoke tests to make sure mini cart is functioning

  Background: 
    Given I am on the homepage
    Given mini cart function is enabled

  Scenario: Viewing mini cart
    Given I am on any page of client website
    When I click on the shopping cart icon
    Then the mini cart should be displayed

  Scenario: Viewing mini cart with product
    Given I am on any page of client website
    And I have product in my cart
    When I click on the shopping cart icon
    Then the mini cart should be displayed
    And up to the last three items added to the cart should be displayed

  Scenario: Viewing mini cart without product
    Given I am on any page of client website
    And I don’t have product in my cart
    When I click on the shopping cart icon
    Then the mini cart should be displayed
    And a message stating you have no items in your cart should be displayed

  Scenario: Editing items in mini cart
    Given I have product in my cart
    And I am in mini cart
    When I click on the edit link for one of the products
    Then I am taken to product detail page
    And an update cart button is displayed

  Scenario: Removing items in mini cart
    Given I have product in my cart
    And I am in mini cart
    When I click on the remove item link
    And click on the OK button in the following alert
    Then product is removed from my cart
    And a message stating product was successfully removed is displayed
