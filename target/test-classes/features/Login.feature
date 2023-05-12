#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: LoginPage
  I want to use this template for my feature file

 # @tag1
 # Scenario: login useing user vimala
   # Given User on DS algo landing page
  #  And User click on Get Started button
   # And User clicks on SignIn
   # And user enters valid user name and password
    #When when user click enter
   # Then user should be able to see logged in message
    #And User clicks on signout button

 # @tag1
  #Scenario: login useing user Testuser2211
   # Given User on DS algo landing page
   # And User click on Get Started button
   # And User clicks on SignIn
   # And user enters valid user name2 and password2
   # When when user click enter
    #Then user should be able to see logged in message






  @tag2
  Scenario Outline: Login using username <username> and <password>
    Given User on DS algo landing page
    And User click on Get Started button
    And User clicks on SignIn
    And user enters valid "<username>" and "<password>"
    When when user click enter
    Then user should be able to see logged in message

    Examples: 
      | username                   | password     |
      | vimala.r.senthil@gmail.com | vimala@29aug |
      | Testuser2211               | Ninja        |
      | CheckTest                  | test         |
