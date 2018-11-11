Feature: Create account of Facebook
As a user u need to open Facebook home page and to the validations

Background: common logic steps
Given User need to be on Facebook login page

Scenario: Validate First Name field
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser

Scenario: Validate create user multiple fields
When User enters user "Ryan" first name 
And User enters user "Jack" username
Then User checks user "Ryan" first name is present
But User mobile field should be blank
Then Close browser