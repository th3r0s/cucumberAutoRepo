Feature: Create account of Facebook
As a user u need to open Facebook home page and to the validations



Scenario Outline: Validate create user multiple fields
Given User need to be on Facebook login page
When User enters user "<user>" first name 
And User enters user "<surname>" username
Then User checks user "<user>" first name is present
But User mobile field should be blank
Then Close browser
Examples:
	| user | surname |
	| Tom  | Jerry	 |
	| Loren| Harry	 |