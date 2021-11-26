Feature: Create an user account in Facebook
As a user you need to open the facebook page and validate the username

Scenario: Validate firstName field
Given User needs to open a register page
When User needs enters user "Salin" firstname
Then User checks user "Salin" firstname is present
Then close browser

Scenario Outline: Validate multiple values
Given User needs to open a register page
When User needs enters user "<userName>" firstname
And User needs enters user "<surName>" surname
Then User checks user "<userName>" firstname is present
And User checks user "<surName>" surname is present
But User mobile field should be blank
Then close browser
Examples: 
    |userName  |surName    |mobileNo |
    |Salin     |Dalabehera |12345    |
    |Manoj     |Kumar      |456378   |
    |Sujit     |Swain      |173678   | 
     