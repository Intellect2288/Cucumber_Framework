#Author : Laxmi Maurya
#Date : 11th March 2025

@Login
Feature: Login Page feature


@Smoke 
Scenario: Verify login functionality with valid credentials
Given user is on login page
When user enters username as "standard_user"  
And user enters password as "secret_sauce"
And user clicks on login button
Then user should be navigated to dashboard page


@Regression
Scenario Outline: Verify login functionality with negative credentials
Given user is on login page
When user enters username as <USERNAME>   
And user enters password as <PASSWORD>
And user clicks on login button
Then error message should be displayed
And user should not be navigated to dashboard page
Examples: 
|USERNAME|PASSWORD|
|"standard_user" | "Laxmi@123"|
|"Laxmi" |"secret_sauce"|
|"Laxmi" | "Laxmi@123"|




