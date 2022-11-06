@Search-Cars
Feature: Search Cars
  I want to use this template for my feature file

  @Search-Cars-positive
  Scenario: Validate Search Cars page
    Given I am on the home page "https://www.carsguide.com.au/" of Carsguide website
    When I move to  menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And select carbrand as "BMW" from AnyMake dropdown
    And select "1 Series" as car model
    And select location as "ACT - All" from SelectLocation dropdown
    And select "$1,000" as price
    And click on Find_My_Next_Car button
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series Cars Under $1000 for Sale | CarsGuide"
