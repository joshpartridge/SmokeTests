@NoInput @All
Feature: smoke tests to test simple product page

  Background: 
    Given I am on a simple product page

@Done1
  Scenario: I am on a simple product page
    Then product name, price, and availability should be displayed

@Done2
  Scenario: I am on simple product page and product is in stock
    And that product is in stock
    Then Add to Cart button should be displayed
    And editable quantity field should be displayed

@Done3
  Scenario: Adding simple product to cart
    And that product is in stock
    When I click the Add to Cart button
    Then a page notification should be displayed saying product successfully added to cart
    And product should be added to my cart
