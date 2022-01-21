Feature: Case2 Automation Task

  @case2
  Scenario: Following Steps Automated
  Given User should pass onboarding screens
  Then User checks if home page exists or not
  When User gets the number of categories and write this number to console
  When User open a random category
  When User adds 3 random products to wishlist via mini heart icon
  When User opens the menu in the left
  When User go to "My Wishlist"
  Then User controls the page and products
  Then User deletes all of them from Wishlist