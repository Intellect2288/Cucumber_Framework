#Author : Laxmi Maurya
#Date : 19th March 2025

@Dashboard
Feature: Dashboard Page feature

Background:
Given user is on login page
When user enters username as "standard_user"  
And user enters password as "secret_sauce"
And user clicks on login button
And user should be navigated to dashboard page

@Smoke
Scenario: Verify Title of the dashboard page
Then Title of the dashboard page is displayed as "Swag Lab"

@Smoke
Scenario: Verify add to cart button is displayed for the product displayed 
Then Add to Cart button is displayed


@Smoke @Duplicate
Scenario: Verify add to cart button is displayed for the product displayed 
Then Add to Cart button is displayed
 
