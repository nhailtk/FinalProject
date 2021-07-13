Feature: HOME PAGE

  Scenario: 1. Home Page with three Sliders only
    Given Open Home page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three sliders

  Scenario: 2. Home page with three Arrivals only
    Given Open Home page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals

  Scenario: 3. Home page - Images in Arrivals should navigate
    Given Open Home page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket

  Scenario: 4. Home page - Arrivals-Images-Description
    Given Open Home page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on Description tab for the book you clicked on.
    Then There should be a description regarding that book the user clicked on

  Scenario: 5. Home page - Arrivals-Images-Reviews
    Given Open Home page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on Reviews tab for the book you clicked on.
    Then There should be a Reviews regarding that book the user clicked on

  Scenario: 6. Home page - Arrivals-Images-Add to Basket
    Given Open Home page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price.

  Scenario: 7. Home page - Arrivals-Add to Basket with more books
    Given Open Home page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price.
    When Select more books than the books in stock.Ex if the stock has 20 books, try to add 21.Click the add to basket button
    Then Now it throws an error prompt like you must enter a value between 1 and 20

  Scenario: 8. Home-Arrivals-Add to Basket-Items
    Given Open Home page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price.
    When Now click on Item link which navigates to proceed to check out page.
    Then User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page

  Scenario: 9. Home-Arrivals-Add to Basket-Items-Coupon
    Given Open Home page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price.
    When Now click on Item link which navigates to proceed to check out page.
    Then User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page
  When Enter the Coupon code as ‘krishnasakinala’ to get 50rps off on the total.
  Then User can able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give 50rps off on the total price