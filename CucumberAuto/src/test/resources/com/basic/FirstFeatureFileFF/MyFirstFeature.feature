Feature: Create account of Facebook
As a user u need to open Facebook home page and to the validations

Scenario: Validate First Name field
Given User need to be on Facebook login page
When User enters user first name
Then User checks user first name is present


#Scenario: Validate create user multiple fields
#Given User need to be on Facebook login page
#When User enters user first name 
#And User enters user username
#Then User checks user first name is present
#And User checks user username is present
#But User mobile field should be blank