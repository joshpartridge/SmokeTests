@NoInput @All
Feature: Smoketest to make sure compare function is working

Background:
Given Compare function is enabled

Scenario: Adding product to compare list
Given I am logged in
And I am on product detail page
When I click on the Add to Compare link
Then a page notification should be displayed saying product was added to comparison list
And that product should be added to comparison list

Scenario: Viewing comparison list
Given I am logged in
And I am on a category page
And I have product in my comparison list
When I click the compare button
Then Comparison page should be displayed with products in my comparison list

Scenario: Removing product from compare list
Given I am logged in
And I want to remove product
When I click on the Clear All link under compare products section
Then All products are removed from compare section