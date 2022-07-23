Feature: login functionality

Background: application open successfully
Given user open browser with "webdriver.chrome.driver" and "D:\\Automation support\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"


@SmokeTest
Scenario: login functionality with valid credentials
When user click on initial login page
When user navigate on login page
When user click on login button
When user enter "9762720906" as username
When user enter "swati123" as password
When user click on submit button
