@NoInput @All
Feature: Smoke tests to make sure shopping cart is working

Scenario: Navigating to shopping cart page
Given I have product in my cart
And I am on any page in client website
When I click on the shopping cart icon
And click on the view shopping cart link
Then I am taken to shopping cart page

Scenario: Proceeding to checkout from shopping cart page
Given I have product in my cart
And I am on shopping cart page
When I click on the Proceed to Checkout button
Then I am taken to the Checkout page

Scenario: Editing item in shopping cart
Given I have product in my cart
And I am on shopping cart page
When I click on the edit link for a product on the shopping cart page
Then I am taken to product detail page
And an update cart button is displayed

Scenario: Removing items in shopping cart
Given I have product in my cart
And I am on shopping cart page
When I click on the remove item icon
Then product is removed from shopping cart page

Scenario: Emptying cart
Given I have product in my cart
And I am on shopping cart page
When I click on the Empty Cart link
Then all product should be removed from my cart

@test
Scenario: Updating shopping cart
Given I have product in my cart
And I am on shopping cart page
When I edit the quantity of a product
And click on the update button
And The the product is updated accordingly

Scenario: Continue shopping
Given I have product in my cart
And I am on shopping cart page
And I want to continue shopping
When I click on the Continue Shopping link
Then I am directed to site homepage

Scenario: Verifying Price
Given I have product in my cart
And I am on shopping cart page
Then All subtotal and total prices are correct
