
@goal 
Feature: goal setting
    In order add new goals
    As a mobile user Mary
    Mary wants to add new goals

  Background:
    Given Mary is at the add new goal page

  @goal @mobile
  Scenario Outline: add new goal
    In order to add new goal
    As a mobile user Mary
    Mary want to add new goal
    When Mary enter her new goal "<goal>"
    Then she is able to see the goal "<goal>" added

    Examples:
      | goal |
      | Learn react native |


  Scenario Outline: remove goal
    In order to remove the goal added 
    As a mobile user Mary
    Mary wants to remove goal from her list
    When Mary enter her goal "<goal>"
    And Mary remove her goal "<goal>"
    Then she is able to see the goal "<goal>" removed

    Examples:
      | goal |
      | Learn react native |