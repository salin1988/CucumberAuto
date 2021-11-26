Feature: Create an user account in demo automation page
As a user you need to open the demo automation page and validate the username

Scenario: Validate multiple values
Given User needs to open a register1 page
When User needs enters user1 "Salin" firstname
And User needs enters user1 "Dalabehera" surname
Then User checks user1 "Salin" firstname is present
And User checks user1 "Dalabehera" surname is present
Then close browser1