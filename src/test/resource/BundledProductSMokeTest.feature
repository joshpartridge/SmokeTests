@NoInput @All
Feature: Smoke test to make sure bundled product page is working

  Scenario: I am on a bundled product page
    Given I am on a bundled product page
    Then product name, price range, and availability should be displayed

  Scenario: Bundled product is in stock
    Given I am on a bundled product page
    And the product is in stock
    Then Price as configured, editable quantity field, and Add to Cart button should be displayed

  Scenario: Configuring child product of bundled product
    Given I am on a bundled product page
    And the child product of the bundled product is configurable
    When I configure the child product to my liking
    Then price as configured and availability should update accordingly

  Scenario: Adding bundled product to cart
    Given I am on a bundled product page
    And my configuration of the bundled product is in stock
    When I click the Add to Cart button
    Then product should be added to my cart
    And a page notification should be displayed saying product successfully added to cart
