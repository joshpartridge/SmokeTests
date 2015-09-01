@NoInput @All
Feature: Smoke test to make sure wishlist is working properly

Scenario: Adding to wishlist when user is not logged in
Given I am on a product detail page
And I am not logged in
When I click on the Add to Wishlist link
Then I am directed to login/create an account page

Scenario: Adding to wishlist when user is logged in
Given I am logged in
And I am on Category page
When I click on the Add to Wishlist link under a product
Then I am directed to my wishlist page
And that product is added to my wishlist

