Feature: Login In Bon-Bonite
  @LoginSuccessful
  Scenario Outline: Enter in my Account
    Given User wants to enter into their account
    When User fills the form tipying <idNumber>, <password>
    Then User login sucessfully <validTest>
    Examples:
      |idNumber|password|validTest|
      |1022036498|luiscarlos123777|Cerrar sesión|

