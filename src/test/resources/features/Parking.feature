Feature: Test Parking functionality

    Scenario: As a user I enter  values in the form of the page
        Given I am on the Parking cost calculator page
        When I enter the values on the form
        And click on the calculate button
        Then the price match whith the expected price