Feature: Login as different users

  Scenario: login as a driver user
    Given the user is on the login page
    When the user logs in using "User10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"

        #homework
  Scenario: login as a driver
    Given the user logged in as "usertype"
    Then the user should be able to login
    And the title contains "Dashboard"
    #driver,store manager,sales manager
   #you will have one step definition and it will handle different user types