Feature: Create an user account in Facebook
As a user you need to open the facebook page and validate the username

Scenario: Validate firstName field
Given User needs to open a register page
When User needs enters user firstname
Then User checks user firstname is present

#Scenario: Validate multiple values
#Given User needs to open a register page
#When User needs to enters user firstname
#And User needs to enters user surname
#Then User checks user firstname is present
#And User checks user surname is present
#But User mobile field should be blank

