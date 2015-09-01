@All @NoInput

Feature: Smoke testing for Gift Card page

Scenario: Adding gift card to cart
Given I am on a gift card page
When I select the Gift Card I want
And I fill out all the required fields
And click the Add to Cart button
Then product should be added to my cart
And a page notification should be displayed saying product successfully added to cart
