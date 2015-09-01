@NoInput @All
Feature: Smoke test to make sure newsletter function is working

Scenario: Subscribing to newsletter
Given I am on client website
And I want to subscribe to their newsletter
When I type in my email address
And click the subscribe button
Then I am successfully subscribed to their newsletter
