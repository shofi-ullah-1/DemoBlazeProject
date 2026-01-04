@Smoke @Functional @Regression
Feature: Maximum and Minimum prices of the product page 

Scenario: As a user, I will check maximum and minimum price 

Given Open chrome browser 
And Go to application url 
When I capture all the product price in a list 
Then I should be able to find 1st, 2nd, 3rd maximum and minimum price