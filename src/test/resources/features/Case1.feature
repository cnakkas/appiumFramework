Feature: Case1 Automation Task

  @case1
  Scenario: Following Steps Automated
  Given User should pass onboarding screens
  Then User checks if home page exists or not
  When User changes category to ‘Baby Care’
  And User open a random product detail
  And User adds this product to basket and return last page
  And User changes category to ‘Snacks’
  And User open a random product detail
  And User adds this product to basket and return last page
  Then User goes to basket and control added products and prices
  Then User should deletes all products from basket and makes controls