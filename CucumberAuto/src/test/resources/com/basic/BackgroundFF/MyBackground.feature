Feature: Create an user account in Facebook
As a user you need to open the facebook page and validate the username

Background: User need to open the register page
When User needs to open a register page

Scenario: Validate firstName field
When User needs enters user "Salin" firstname
Then User checks user "Salin" firstname is present
Then close browser

Scenario: Validate multiple values
When User needs enters user "Salin" firstname
And User needs enters user "Dalabehera" surname
Then User checks user "Salin" firstname is present
And User checks user "Dalabehera" surname is present
But User mobile field should be blank
Then close browser