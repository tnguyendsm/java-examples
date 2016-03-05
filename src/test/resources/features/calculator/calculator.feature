Feature: Calculator
  As a User
  I want to use a Calculator
  So that I do not need to perform calculations myself

  Background: 
    Given I have a Calculator

  Scenario: add
    When I "add" 2 and 3
    Then the result should be 5

  Scenario Outline: 
    When I <operate> <num1> <keyword> <num2>
    Then the result should be <result>

    Examples: 
      | operate    | num1 | keyword | num2 | result |
      | "subtract" | 2    | from    | 10   | 8      |
      | "multiply" | 2    | by      | 5    | 10     |
      | "divide"   | 10   | by      | 5    | 2      |
