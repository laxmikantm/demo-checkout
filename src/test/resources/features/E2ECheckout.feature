Feature: As a consumer I should be able to checkout a product

  @e2e
  Scenario: Checkout a sample product
      Given user is on the Home Page
      When I select Starry Night portait with
      |Qty|Format|
      |1  |Digital copy|
      And I checkout
      Then Order summary page should be displayed with
        |Total Price|
        |$29.75 |
