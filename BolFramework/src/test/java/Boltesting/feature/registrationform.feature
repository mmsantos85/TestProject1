Feature: filling out registration form
	A new user should be able to fill in the registration form to create a new account
	
Scenario: create a new user2
Given User navigates to bol.com2
And User clicks on agree cookies2 
And User clicks on login button2
And User thicks on own account2
And User enters valid email2
And User clicks on make an account2
Then User should be navigated to registration form2
And User ticks Ms 
And User enters his first name
And User should type his last name
Then The user thicks Nederlands
And User should type a valid zip code
And User should type a valid house number
And User should type a valid phone number
And The user should type a valid password
And User ticks checkbox
When The user clicks on the send button
Then User should be navigated to userprofile
#/Accountoverzicht