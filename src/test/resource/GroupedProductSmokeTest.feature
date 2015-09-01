@NoInput @All
Feature: Smoke testing to make sure grouped product page works

  Scenario: I am on a grouped product page
    Given that I am on a grouped product page
    Then grouped product name, price, and availability should be displayed
    And child product individual name, price, and availability should be displayed

  Scenario: I am on a grouped product page and child product is in stock
    Given that I am on a grouped product page
    And all child product is in stock
    Then Add to Cart button should be displayed
    And editable quantity fields should be displayed

  Scenario: Adding grouped product to cart
    Given that I am on a grouped product page
    And all child product is in stock
    When I edit the quantity fields
    When I click the Add to Cart button
    Then grouped product should be added to my cart
    And a page notification should be displayed saying product successfully added to cart
    
