Feature: Project instructions

  Scenario: Demo
    Given Open this web page
    When Select the "Good" radio button option
    And Click the "Next" Button
    Then Assert text "Have a nice day" exists
    When Click the "Prev" Button
    Then Button "Good" should be clicked
    And Button "Bad" should be not clicked
    And Button "Okay" should be not clicked