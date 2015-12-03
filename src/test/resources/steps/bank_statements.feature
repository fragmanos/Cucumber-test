Feature: Bank Statement Management

  Background:

  Scenario: Find Balance
    Given the bank statement system initialized with the following data
      | id  | description | cost    |
      | 1   | salary      | 1000.0  |
      | 2   | rent        | -500.0  |
      | 3   | food        | -200.0  |
    When i summarize the list
    Then the result should be 300
