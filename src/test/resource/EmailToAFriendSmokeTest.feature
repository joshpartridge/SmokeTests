@NoInput @All
Feature: Smoketesting to make sure email to a friend is working

Scenario: Navigating to Email to a friend page
Given I am on a product detail page
When I click on the Email to a Friend icon
Then I should be directed to Email to a Friend page

Scenario: Emailing link to a friend
Given I am on Email to a Friend page
When I fill out required fields
And I click Send Email button
Then Email should be sent successfully
And I should be back on previous product detail page

Scenario: Adding and removing recipients
Given I am on Email to a Friend page
When I click the Add Recipient button
Then Another recipient field is added
When I click on the remove recipient link
Then recipient is removed

Scenario: Going back to product detail page
Given I am on Email to a Friend page
When I click the back link
Then I should be back on previous product detail page
