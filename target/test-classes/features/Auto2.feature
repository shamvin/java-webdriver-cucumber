# Author: Shamna P
# ASK071323-312
@webdriver
Feature: Practice with Selenium WebDriver Methods
  @webDriver1
  Scenario: Open webpage and explore the property of it.
#    Given I open url "https://www.google.com/"
    Given SP navigate to URL "ASK"
    Then SP  get page information
    Then SP maximize the window
    Then I wait for 5 sec