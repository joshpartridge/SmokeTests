@NoInput @All
Feature: Smoke testing to make sure configurable product page works

  Scenario: I am on a configurable product page
    Given I am on a configurable product page
    Then product name, price, and availability should be displayed

  Scenario: Configuring configurable product
    Given I am on a configurable product page
    When I configure the product to my liking
    Then image, availability, and price should update accordingly

  Scenario: Configurable product is in stock
    Given I am on a configurable product page
    And the product is in stock
    Then Add to Cart button should be displayed
    And editable quantity field should be displayed

  Scenario: Adding configurable product to cart
    Given I am on a configurable product page
    And configuration of configurable product is in stock
    When I click the Add to Cart button
    Then product should be added to my cart
    And a page notification should be displayed saying product successfully added to cart
