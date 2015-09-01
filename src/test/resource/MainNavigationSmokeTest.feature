@NoInput @All
Feature: Smoke testing to make sure the Main Navigation works

  @Runme
  Scenario: Hovering over Main Navigation links
    Given I am on a page where Main Navigation is visible
    When I hover over main navigation links
    Then corresponding menu dropdown displays
    

  @Runme
  Scenario: clicking on category link from main navigation
    Given I am on a page where Main Navigation is visible
    When I click on product category link
    Then I am taken to product category page
    

  @Runme
  Scenario: clicking on subcategory link from main navigation
    Given I am on a page where Main Navigation is visible
    When I click on product subcategory link
    Then I am taken to product subcategory page
   
