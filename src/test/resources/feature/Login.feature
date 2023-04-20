Feature: logIn functionality

@login @regression @sanity @all
   Scenario Outline: login with valid credential
    Given user navigate to logIn page
    When user enter valid email <email> 
    And valid password <password>
    And click button
    Then user login successful
    
 Examples:
 |email|password|
 |somrajtan30@gmail.com|9764228080|
 |somrajtan40@gmail.com|9764228080|


#@login @regression  @all
  #Scenario: login with Invalid  credential
   #  Given user navigate to logIn page
    #When user enter Invalid email "11454631@gmail"
    #And Invalid password "123"
    #And click button
    #Then user show message
    #
    #
   