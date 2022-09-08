Feature: Register New User In BonBonite
  @RegisterSuccessful
  Scenario Outline: Create an Account
    Given User wants to register a BonBonite Account
    When User fills the form tipying <idNumber>, <email>, <password>
    Then Account created sucessfully <validTest>
    Examples:
      |idNumber|email|password|validTest|
      |15263331758|maidwaqdWDWDddll@gmail.com|Jh1234567890.=Jh+*|Cerrar sesión|