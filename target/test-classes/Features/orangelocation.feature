#Author: 2112810@cognizant.com
#tools: selenium and cucumber


Feature: feature to test the website orange hrm demo


Scenario Outline: To test the login functionality of orange website


Given the user is on the login page of the website
When the user provides valid username <username> and valid password <password>
And the user clicks on login button 
Then the user gain access to the landing page of the website

Examples:

| username | password |
| Admin | admin123 |




Scenario: To test the location tab of the website

Given the user is on the landing page of the website
When the user clicks admin tab and clicks on organization
And the user clicks on locations button
Then the location is accessed


Scenario: To the logout functionality of the website

Given the user is on the location of the website
When the user clicks on the upper right profile icon
And clicks on logout button
Then the user logs out of the website