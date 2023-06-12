Feature: HomePage Test
  As user I want to verify the About Us Page
  Scenario: User should navigate to about us page successfully
    Given I click on accept link
    Given I click on close popup screen
    When I am on homepage
    And I click on about us link
    Then I should navigate to about us page successfully
