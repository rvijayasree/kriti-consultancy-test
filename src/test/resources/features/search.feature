Feature: Search a product and add to the cart


  Scenario Outline:Search a product and add to the cart

    Given I am on user Home page
    When I search for a product by name  "<name>"
    Then  I should able to see the respective product
    Examples:
      | name        |
      | jeans       |
      | accessories |

  Scenario: Add a product to the cart

    Given  I am on Home Page
    And I search for a product
    And I select an appropriate product from result
    When I add the product to the cart
    Then I should able to see the product in the cart

