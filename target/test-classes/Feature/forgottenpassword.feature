Feature: Validate the login Fuctionality with forgetten password
@forget
Scenario: Validate the forgetten with invalid mobile number
Given User should launch the chrome and load the url
When User should click the forgotten password
And User should fill the invalid mobile number
And User should get title of the page
And User should click search button
Then user should navigate the incorrect credential page


