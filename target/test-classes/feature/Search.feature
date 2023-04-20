Feature: search functionality

Scenario: search with valid product
Given user navigate to search page
When user enter valid product name "hp"
And click on search button
Then user should display search result displed
#
#
#
#Scenario: search with Invalid product
#Given user navigate to search page
#When user enter Invalid product name "apna" 
#And click on search button
#Then user should display inform message