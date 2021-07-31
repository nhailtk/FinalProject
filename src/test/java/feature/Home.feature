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
    When Enter the Coupon code as krishnasakinala to get 50rps off on the total.
    Then User can able to apply coupon by entering krishnasakinala in the coupon textbox which give 50rps off on the total price

  Scenario: 10. Home-Arrivals-Add to Basket-Items-Coupon value<450
    Given Open Home page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Click the image in the Arrivals that has a price less than 450 rps
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price.
    When Now click on Item link which navigates to proceed to check out page.
    Then User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page
    When Enter the Coupon code as krishnasakinala to get 50rps off on the total.
    Then User can not able to apply coupon by entering krishnasakinala in the coupon textbox which give 50rps off on the total price

  Scenario: 11. Home-Arrivals-Add to Basket-Items-Remove book
    Given User successfully login to the web page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price.
    When Now click on Item link which navigates to proceed to check out page.
    Then User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page
    When Now click on Remove this icon in Check out page which removes that book from the grid.
    Then User has the feasibility to remove the book at the time of check out also

  Scenario:  12. Home-Arrivals-Add to Basket-Items-Add book
    Given User successfully login to the web page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price.
    When Now click on Item link which navigates to proceed to check out page.
    And Click on text box value under quantity in Check out page to add or subtract books.
    Then Now after the above change Update Basket button will turn into Clickable mode.
    When Now click on Update Basket to reflect those changes
    Then User has the feasibility to Update Basket at the time of check out.

  Scenario: 13. Home-Arrivals-Add to Basket-Items-Check-out-Book Final price
    Given User successfully login to the web page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price.
    When Now click on Item link which navigates to proceed to check out page.
    Then Now User can find the Total price of the book in the Check out grid.

  Scenario: 14. Home-Arrivals-Add to Basket-Items-Check-out-Update Basket
    Given User successfully login to the web page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price.
    When Now click on Item link which navigates to proceed to check out page.
    And Click on text box value under quantity in Check out page to subtract books.
    Then Now after the above change Update Basket button will turn into Clickable mode.
    When Now click on Update Basket to reflect those changes
    Then User has the feasibility to Update Basket at the time of check out

  Scenario: 15. Home-Arrivals-Add to Basket-Items-Check-out-Total & Sub-total condition
    Given User successfully login to the web page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price.
    When Now click on Item link which navigates to proceed to check out page.
    And Now user can find total and subtotal values just above the Proceed to Checkout button.
    Then The total always > subtotal because taxes are added in the subtotal

  Scenario: 16. Home-Arrivals-Add to Basket-Items-Check-out functionality
    Given User successfully login to the web page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price.
    When Now click on Item link which navigates to proceed to check out page.
    And Now user can find total and subtotal values just above the Proceed to Checkout button.
    Then The total always > subtotal because taxes are added in the subtotal
    And Now click on Proceed to Check out button which navigates to payment gateway page.
    Then Clicking on Proceed to Checkout button leads to payment gateway page

  Scenario: 17. Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway
    Given User successfully login to the web page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price.
    When Now click on Item link which navigates to proceed to check out page.
    And Now user can find total and subtotal values just above the Proceed to Checkout button.
    Then The total always > subtotal because taxes are added in the subtotal
    And Now click on Proceed to Check out button which navigates to payment gateway page.
    Then Clicking on Proceed to Checkout button leads to payment gateway page
    Then User can view Billing Details,Order Details,Additional details and Payment gateway details.
    And Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
    Then User has the feasibility to add coupon in the payment gateway page and also he can find billing,order and additional details.

  Scenario: 18. Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway-Place order
    Given User successfully login to the web page
    When Click on Shop Menu
    And Now click on Home menu button
    Then The Home page must contains only three Arrivals
    When Now click the image in the Arrivals
    Then Image should be clickable and should navigate to next page where user can add that book to his basket
    When Click on the Add To Basket button which adds that book to your basket
    Then User can view that Book in the Menu item with price.
    When Now click on Item link which navigates to proceed to check out page.
    And Now user can find total and subtotal values just above the Proceed to Checkout button.
    Then The total always > subtotal because taxes are added in the subtotal
    And Now click on Proceed to Check out button which navigates to payment gateway page.
    Then Clicking on Proceed to Checkout button leads to payment gateway page
    Then User can view Billing Details,Order Details,Additional details and Payment gateway details.
    And Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
    And Now click on Place Order button to complete process
    Then On clicking place-order button user completes the process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.