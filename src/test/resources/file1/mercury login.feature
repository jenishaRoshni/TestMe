Feature: login

Scenario Outline: succeccful login
Given user is on the home page
When user enter correct "<Username>" and "<Password>"
Then user does succesful login
Examples:
|  Username  |  Password | 
|  mercury    |    mercury   |  
|  tutorial    |    tutorial   |                     |