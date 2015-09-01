@NoInput @All
Feature: Smoketests to test subcategory page

Scenario: Navigating to subcategory page
Given I am on a category page
When I click on a subcategory link
Then I should be directed to corresponding subcategory page

Scenario: Navigating to Product detail page from subcategory page
Given that I am on a subcategory page
When I select a product Image/Name from the subcategory page
Then I should be directed to that product’s detail page

Scenario: Adding simple product to cart on subcategory page
Given that I am on a subcategory page
And there is simple product on the subcategory page
When I click the add to cart button
Then Product is added to cart
And page notification displays saying product was added to cart
