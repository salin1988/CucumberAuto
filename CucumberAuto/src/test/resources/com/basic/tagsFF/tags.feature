@Important
Feature: Create an user account in Facebook
As a user you need to open the facebook page and validate the username

@Smoke
Scenario: Validate firstName field1
Given User needs to open a register page
When User needs enters user "Salin" firstname
Then User checks user "Salin" firstname is present
Then close browser

@Smoke @Regression
Scenario: Validate multiple values
Given User needs to open a register page
When User needs enters user "Salin" firstname
And User needs enters user "Dalabehera" surname
Then User checks user "Salin" firstname is present
And User checks user "Dalabehera" surname is present
But User mobile field should be blank
Then close browser

Scenario: Validate firstName field2
Given User needs to open a register page
When User needs enters user "Salin" firstname
Then User checks user "Salin" firstname is present
Then close browser

@Regression
Scenario: Validate firstName field3
Given User needs to open a register page
When User needs enters user "Salin" firstname
Then User checks user "Salin" firstname is present
Then close browser

@Regression
Scenario: Validate firstName field4
Given User needs to open a register page
When User needs enters user "Salin" firstname
Then User checks user "Salin" firstname is present
Then close browser

@Smoke @Regression
Scenario: Validate firstName field5
Given User needs to open a register page
When User needs enters user "Salin" firstname
Then User checks user "Salin" firstname is present
Then close browser