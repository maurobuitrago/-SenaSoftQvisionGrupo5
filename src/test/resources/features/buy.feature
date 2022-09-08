Feature: buy shoes
  @AccesShoesModuleSuccessful
  Scenario Outline: Access To Shoes Module
    Given User wants to access to shoes module
    When User clicks on the shoes module
    Then User accesses to shoes module <validText>
    Examples:
      |validText|
      |Sandalias|
