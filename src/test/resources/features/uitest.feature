Feature: uitest
  Contains ui tests

  Scenario: verify user should be able to hover over images
    Given the user visits '/hovers'
    When the user hover over the '1' image
    Then the 'name: user1' name should be visible