Feature:  Login
  @Smoke
  Scenario: Login on the site
    Given user is on the required site
    Then the user enters the username "abc@gmail.com"
    And the user enters the password "12345"
    And the user clicks on the sign in button
    Then the user enters the site and the main page is opened
    And the lists on the main page are displayed


  @Automation
  Scenario Outline: Negative sign in on the site
    Given user is on the required site
    Then the user enters the usernames "<UserName>"
    And the user enters the passwords "<Passwd>"
    And the user clicks on the sign in button
    Then the user receives the expected messages

    Examples:

    |UserName                 |Passwd|
    |abc@gmail.com            |67890|
    |asdf@gmail.com           |12345|
    |shsjdgs@gmail.com        |45678|
