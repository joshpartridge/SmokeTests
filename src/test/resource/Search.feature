@NoInput @All @Example
Feature: Smoke testing to make sure search works

 @Runme
  Scenario: Searching for product
    Given you are on any page in the website
    When I search for "BASKETBALL"
    Then search results page should be displayed with related product

 @Runme
  Scenario: Navigating to Product detail page from search results page
    Given that I am on a search results page
    When I select a product Image/Name
    Then I should be directed to that product’s detail page

 @Runme
  Scenario: Adding simple product to cart on search results page
    Given that I am on a search results page
    And there is simple product on the page
    When I click the add to cart button
    Then page notification displays saying product was added to cart
    And Product is added to cart

