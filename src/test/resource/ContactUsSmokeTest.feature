@NoInput @All
Feature: Smoketest to make sure contact us is working

Scenario: Navigating to Contact page
Given I am on homepage
When I click on the Contact link
Then I am taken to contact page

Scenario: Submitting contact form
Given I am on Contact page
When I fill out all the contact fields correctly
And press the Submit button
Then contact form is successfully submitted
