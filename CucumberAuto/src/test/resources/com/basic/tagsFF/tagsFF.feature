@Important
Feature: Create account of Facebook
As a user u need to open Facebook home page and to the validations
@Smoke
Scenario: Validate First Name field
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser
@Smoke @Regression 
Scenario: Validate create user multiple fields
Given User need to be on Facebook login page
When User enters user "Ryan" first name 
And User enters user "Jack" username
Then User checks user "Ryan" first name is present
Then User mobile field should be blank
Then Close browser

Scenario: Validate First Name field2
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser
@Smoke
Scenario: Validate First Name field3
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser
@Regression
Scenario: Validate First Name field4
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser

Scenario: Validate First Name field5
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser