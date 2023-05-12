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
Feature: HomePage
  I want to use this template for my feature file

  @homepagetests
  Scenario: Validate Get started Button Exist and enabled
    Given User on DS algo landing page
    Then Verify Get Started button

  @homepagetests
  Scenario:LandingPage
    Given User on DS algo landing page
    When User click on Get Started button
    Then DS algo home page is opened
    And Verify user is not logged in
   
  @homepagetests
  Scenario: ClickRegister
    Given User on DS algo landing page
    When User click on Get Started button
    And User clicks on Register
    Then User should be directed to Register page
    
  @homepagetests
  Scenario: SignIn
    Given User on DS algo landing page
    When User click on Get Started button
    And User clicks on SignIn
    Then User should be directed to SignIn Page
 
  @homepagetests
  Scenario: DataStructures
    Given User on DS algo landing page
    When User click on Get Started button
    And User Clicks on Data Structure Drop Down
    Then user should be able to view the Drop Down
 
  @homepagetests
  Scenario: DataStructures-Introduction GetStartedButton
    Given User on DS algo landing page
    When User click on Get Started button
    And User Clicks on Data Structure-Introduction GetStartedBtn
    Then user should be able to view the error msg 
    
  @homepagetests
  Scenario: Array GetStartedButton
    Given User on DS algo landing page
    When User click on Get Started button
    And User clicks on Array GetStartedBtn
   	Then user should be able to view the error msg 
   
  @homepagetests
  Scenario: LinkedList GetStartedButton
    Given User on DS algo landing page
    When User click on Get Started button
    And User clicks on LinkedList GetStartedBtn
   	Then user should be able to view the error msg 
   
  @homepagetests
  Scenario: Stack GetStartedButton
    Given User on DS algo landing page
    When User click on Get Started button
    And User clicks on Stack GetStartedBtn
   	Then user should be able to view the error msg 
   
  @homepagetests
  Scenario: Queue GetStartedButton
    Given User on DS algo landing page
    When User click on Get Started button
    And User clicks on Queue GetStartedBtn
   	Then user should be able to view the error msg 
   	
  @homepagetests
  Scenario: Tree GetStartedButton
    Given User on DS algo landing page
    When User click on Get Started button
    And User clicks on Tree GetStartedBtn
   	Then user should be able to view the error msg 
   	
  @homepagetests
  Scenario: Graph GetStartedButton
    Given User on DS algo landing page
    When User click on Get Started button
    And User clicks on Graph GetStartedBtn
   	Then user should be able to view the error msg 
  

  
 
   	
   	
   	
   	
   	
   	
   	
   	
   
 
 
 