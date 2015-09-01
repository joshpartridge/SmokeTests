@NoInput @All
Feature: Smoke testing to make sure a basic category page works

  Background: 
    Given I am on the homepage

  Scenario: Navigating to Category product page from home page
    When I select a category with product from the main navigation
    Then I should be directed to that category page
    And the category page should have product on it

  Scenario: Navigating to Product detail page from Category page
    Given that I am on a category page with product
    When I select a product Image/Name
    Then I should be directed to that product’s detail page

  Scenario: Adding simple product to cart on category page
    Given that I am on a category page with product
    And there is simple product on the page
    When I click the add to cart button
    Then Product is added to cart
    And page notification displays saying product was added to cart
