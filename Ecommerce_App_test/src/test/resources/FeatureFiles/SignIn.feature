@SignIn
Feature: Acceptance testing to validate SignIn Feature is working.
  In order to validate that 
  the Sign In feature is working
  Doing the Acceptance Testing

  @SignIn-VerifyLogIn
  Scenario: Validate Sign In feature
    Given I Navigate to "http://automationpractice.com/index.php" My Shopping Website
    Then Home Page Renders Successfully
    When click on Sign In link
    Then I should be Navigated to SignIn Page Successfully
    And I Login With "Kashishpasrija82@gmail.com" as UserName and "Kas@0000" as Password
    Then I should be logged In Successfully
    Then I search "Printed Chiffon Dress" item
    Then I add item "Printed Chiffon Dress" to the cart
    Then I proceed to Checkout Cart
    Then I increase quantity of "Printed Chiffon Dress" item
    Then I Verify the Total Final Amount of Cart is "$34.80"
    Then I increase quantity of "Printed Chiffon Dress" item
    Then I Verify the Total Final Amount of Cart is "$51.20"
    Then I decrease quantity of "Printed Chiffon Dress" item
    Then I Verify the Total Final Amount of Cart is "$34.80"
    Then I logOut of MyAccount
    And I am Logged Out Successfully
    
    
    
