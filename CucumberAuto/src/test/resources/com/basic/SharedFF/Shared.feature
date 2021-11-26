Feature: Create an user account in Facebook
As a user you need to open the facebook page and validate the username

Scenario: Validate firstName field
Given User needs to open a register page
When User needs enters user "Salin" firstname
Then User checks user "Salin" firstname is present


Scenario: Validate multiple values
Given User needs to open a register page
When User needs enters user "Salin" firstname
And User needs enters user "Dalabehera" surname
Then User checks user "Salin" firstname is present
And User checks user "Dalabehera" surname is present
But User mobile field should be blank