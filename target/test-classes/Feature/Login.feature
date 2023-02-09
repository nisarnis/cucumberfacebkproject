Feature: Validate the login fuctionality of facebook
Background:
Given User should launch the chrome and load the url
@sanity
Scenario: Check whether the login fuctionality with invalid username and invalid password
When User should type invalid username and invalid password in the textbox
And User should print the title of the page
And User should click the login button
Then User should navigate to incorrect credential page

@regression
Scenario:  Check whether the login fuctionality with valid username and invalid password
When user should type valid username and invalid password in the textbox
And User should click the login button
And User shoud print title of the page
Then user should navigate to incorrect credential page of valid username and invalid password

@sanity
Scenario: Check whether the login fuctionality with invalid username and valid password
When user should invalid username and valid password in the textbox
And User should click the login button
Then user should navigate to incorrect credential page of invalid username and valid password page
@smoke
Scenario: Check whether the login fuctionality with valid username and valid password
When user should valid username and valid password in the textbox
And User should click the login button

