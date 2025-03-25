#Author : Laxmi Maurya
#Date : 11th March 2025

@HomePage
Feature: Home Page feature

 
@Smoke @Amazon
Scenario: Verify login Page Title of Amazon
Given user hits the URL as "https://www.amazon.in/"
Then title of the login page is displayed as "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" 
 
@Sanity @Ajio
Scenario: Verify login Page Title of Ajio
Given user hits the URL as "https://www.ajio.com/"
Then title of the login page is displayed as "Online Men fashion shopping site in India - AJIO"

@Regression @Redbus
Scenario: Verify login Page Title of Redbus
Given user hits the URL as "https://www.redbus.in/"
Then title of the login page is displayed as "Bus Ticket Booking Online at Cheapest Price with Top Bus Operators - redBus"

@Smoke @Regression @Flipkart
Scenario: Verify login Page Title of Flipkart
Given user hits the URL as "https://www.flipkart.com/"
Then title of the login page is displayed as "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"

@Smoke @Sanity @MMT
Scenario: Verify login Page Title of Make my Trip
Given user hits the URL as "https://www.makemytrip.com/"
Then title of the login page is displayed as "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"

