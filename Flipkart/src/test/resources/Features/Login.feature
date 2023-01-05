Feature: to test the FlipkartFunctionlity
@FK001 @Login
  Scenario: FLIPKART - Login
    Given To launch the browser and enter to url
   # When Click the Login
    And Enter username and password
    Then Click submit

@FK002 @Search
  Scenario: FLIPKART - Search - Cart
  Given To launch the browser and enter to url site
    When To Click the search
    And Enter the search of product
    When Click the Search Box
    And Click The product
    Then Add to cart in Search Page

@FK003 @Collection
  Scenario: FLIPKART - Collection
    Given To Click the Collection field Appliances
    When  Click The Select product ac
    Then Add to Cart in Collection Page

  @FK004 @Filter
  Scenario: FLIPKART - Search - Cart
    Given To Click the search field
    And Enter the Product
    And Click the Magnifying Glass
    When Click the Filter Options
    And Click on the Select Product
    Then Add to The cart in Filter Page


  @FK005 @Signin
  Scenario: FLIPKART - Login - Signin
    Given Click the LoginButton
    And Click The New User Account
    When Enter the Mobile Number
    Then Click signin  button
