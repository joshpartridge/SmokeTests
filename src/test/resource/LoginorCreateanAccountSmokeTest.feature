@NoInput @All
Feature: Smoke testing to make sure login page is working

Scenario: Navigating to Login or Create an Account page
Given I am on client website
And I am not logged into an account
When I click on login/register link
Then I am taken to login or create an Account page

Scenario: Logging in
Given I am on Login or Create an Account page
And I am a registered user
When I put in my credentials
And click on the login button
Then I am able to successfully log in

#This following scenario needs manual input and since its creating an account it would be better
#if it was manually tested.

#Scenario: Creating an account
#Given I am on Login or Create an Account page
#And I am not a registered user
#When I click the create an account button
#And fill out all the required fields correctly
#And click the register button
#Then I am able to successfully create an account
