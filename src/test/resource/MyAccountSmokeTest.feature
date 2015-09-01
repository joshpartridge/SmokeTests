@NoInput @All
Feature: Smoke testing to make sure my account is functioning

Scenario: Navigating to my account page
Given I am a registered user
And I am logged in
When I click on the My Account link
Then I am taken to the My Account page

Scenario: Editing contact information
Given I am logged in
And I am on My Account Dashboard page
And I want to Edit my contact information
When I click on the edit contact link
Then I am able to successfully edit my contact information

Scenario: Editing address information
Given I am logged in
And I am on My Account Dashboard page
And I want to Edit my address information
When I click on the edit address link
Then I am able to successfully edit my address information
