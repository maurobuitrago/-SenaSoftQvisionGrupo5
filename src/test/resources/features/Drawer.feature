Feature: View Drawer Menu
  @ViewDrawerSuccessful
  Scenario Outline: View Drawer Menu
    Given User wants to see the drawer menu
    When User clicks on Icon in order to see the Drawer Menu
    Then Drawer Menu Showed Succesfully <validText>
    Examples:
      |validText|
      |Bonos de regalo|