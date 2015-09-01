@NoInput @All
Feature: Smoke tests to test reviews functionality

  Scenario: Product has reviews
    Given I am on a product detail page with at least one review
    Then number of review(s) and Add Your Review links should be displayed

  Scenario: Product does not have reviews
    Given I am on a product detail page with no reviews
    Then number of review(s) and Add Your Review links should not be displayed
    And Be the first to review this product link should be displayed under Reviews tab

  Scenario: Navigating to review page when product has at least one review
    Given I am on a product detail page with at least one review
    When I click on the number of Review(s) link
    Then I should be directed to product review page

  Scenario: Adding your review when product has at least one review
    Given I am on a product detail page with at least one review
    When I click on the Add Your Review link
    Then I should be directed to product review page
    And anchored to the write your review section

  Scenario: Adding your review when product has no reviews
    Given I am on a product detail page with no reviews
    When I click on the Be the first to review this product link under the Reviews tab
    Then I should be directed to product review page
    And anchored to the write your review section

  Scenario: Writing a review
    Given I am on review page
    And I want to write a review
    When I fill out the review sections
    And press Submit Review button
    Then my review is submitted and saved
