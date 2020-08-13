Feature: Lets go to Google

  Scenario: User goes to Google Main Page
    Given user opens "https://www.google.com"
    When user enters "Selenium" to "Search_Button" area
    Then user views ""

  Scenario: User logins Facebook
    Given user opens "https://www.facebook.com"
    When user enters "a@a.com" to "facebook_email" area
    And user enters "pass" to "Facebook_Password"
    And  user clicks "Facebook_Login"
    Then user should see "Login_Facebook" page

  Scenario: User logins Twitter
    Given user opens "https://twitter.com/login"
    When user enters "deneme" to "Username" area
    And user enters "deneme" to "password" area

   Scenario: User tries to login Outlook
     Given user opens "https://outlook.live.com/owa/"
     When user clicks "create_account_button"
#     And user enters "turkie_elif" to "account_name" area
