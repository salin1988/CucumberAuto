Feature: Create an user account in Facebook
As a user you need to open the facebook page and validate the username

Background: open the webpage
Given User needs to open a register page

Scenario: Validate firstName field
When User needs enters user "Salin" firstname
Then User checks user "Salin" firstname is present
Then close browser

Scenario: Validate multiple values

When Enter following data
   |userName  |userSurName |mobileNo |
   |Salin     |Dalabehera  |12345    |
   |Manoj     |Kumar       |23456    |
   |Raj       |Kumar       |87898    |
Then User checks user "Salin" firstname is present
And User checks user "Dalabehera" surname is present
But User mobile field should be blank
Then close browser