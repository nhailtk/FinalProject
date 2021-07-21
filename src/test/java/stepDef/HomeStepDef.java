package stepDef;

import common.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import page.HomePage;
import page.LoginPage;

public class HomeStepDef {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    public HomeStepDef() {
        this.driver = DriverFactory.createDriver();
        homePage = new HomePage(this.driver);
        loginPage = new LoginPage(this.driver);
    }
    @Given("^Open Home page$")
    public void openHomePage(){
        homePage.openHomePage();
    }

    @Given("^User successfully login to the web page$")
    public void userHasLogin(){
        homePage.openHomePage();
        loginPage.clickMyAccountMenu();
        loginPage.inputUserName("nhailtk@gmail.com");
        loginPage.inputPassword("nhailtk@123456");
        loginPage.clickLoginButton();
        loginPage.verifyLoginPass();
    }
    @When("^Click on Shop Menu$")
    public void clickShopMenu(){
        homePage.clickShopMenu();
    }

    @And("^Now click on Home menu button$")
    public void clickHomeMenuButton(){
        homePage.clickHomeMenuButton();
    }

    @When("^Now click the image in the Arrivals$")
    public void clickArrival1(){
        homePage.clickArrival1();
    }

    @When("^Click the image in the Arrivals that has a price less than 450 rps$")
    public void clickArrival2(){
        homePage.clickArrival2();
    }

     @When("^Click on Description tab for the book you clicked on.$")
     public void clickDescriptionTab(){
        homePage.clickDescriptionTab();
     }

     @When("^Click on Reviews tab for the book you clicked on.$")
     public void clickReviewTab(){
        homePage.clickReviewTab();
     }

     @When("^Click on the Add To Basket button which adds that book to your basket$")
     public void clickAddToBasketButton(){
        homePage.clickAddToBasket();
     }

     @When("^Select more books than the books in stock.Ex if the stock has 20 books, try to add 21.Click the add to basket button$")
     public void InputGreaterThanMaxItem(){
        homePage.inputGreaterThanMaxItem();
     }

    @When("^Now click on Item link which navigates to proceed to check out page.$")
    public void clickMenuCart(){
        homePage.clickMenuCart();
    }

    @When("^Enter the Coupon code as ‘krishnasakinala’ to get 50rps off on the total.$")
    public void inputCouponCode(){
        homePage.inputCouponCode();
    }

    @When("^Now click on Remove this icon in Check out page which removes that book from the grid.$")
    public void clickIconRemove(){
        homePage.clickIconRemove();
    }

    @And("^Click on text box value under quantity in Check out page to add or subtract books.$")
    public void clickTextBoxQuantity(){
        homePage.clickTextBoxQuantity();
    }

    @And("^Click on text box value under quantity in Check out page to subtract books.$")
    public void clickSubTractTextBoxQuantity(){
        homePage.clickSubTractTextBoxQuantity();
    }

    @Then("^Now after the above change ‘Update Basket’ button will turn into Clickable mode.$")
    public void enableUpdateBasketButton(){
        homePage.enableUpdateBasketButton();
    }

    @When("^Now click on Update Basket to reflect those changes$")
    public void clickUpdateBasket(){
        homePage.clickUpdateBasket();
    }

    @And("^Now user can find total and subtotal values just above the Proceed to Checkout button.$")
    public void visibleTotalAndSubtotal(){
        homePage.visibleTotalAndSubtotal();
    }

    @And("^Now click on Proceed to Check out button which navigates to payment gateway page.$")
    public void clickButtonProcessToCheckout(){
        homePage.clickButtonProcessToCheckout();
    }

    @Then("^User can view Billing Details,Order Details,Additional details and Payment gateway details.$")
    public void viewItemInPaymentGatewayPage(){
        homePage.viewItemInPaymentGatewayPage();
    }
    @And("^Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.$")
    public void fillDataInPaymentGatewayPage(){
        homePage.fillDataInPaymentGatewayPage();
    }

    // Scenario: 1. Home Page with three Sliders only
    @Then("^The Home page must contains only three sliders$")
    public void verifySlidersNumber(){
        homePage.verifySlidersNumber();
    }

    //  Scenario: 2. Home page with three Arrivals only
    @Then("^The Home page must contains only three Arrivals$")
    public void verifyArrivalsNumber(){
        homePage.verifyArrivalsNumber();
    }

    // Scenario: 3. Home page - Images in Arrivals should navigate
    @Then("^Image should be clickable and should navigate to next page where user can add that book to his basket$")
    public void verifyImageShouldNavigate(){
        homePage.verifyImageShouldNavigate();
    }

    //Scenario: 4. Home page - Arrivals-Images-Description
    @Then("^There should be a description regarding that book the user clicked on$")
    public void verifyArrivalImageDescription(){
        homePage.verifyArrivalImageDescription();
    }

    //Scenario: 5. Home page - Arrivals-Images-Reviews
    @Then("^There should be a Reviews regarding that book the user clicked on$")
    public void verifyArrivalImageReviews(){
        homePage.verifyArrivalImageReviews();
    }

    //Scenario: 6. Home page - Arrivals-Images-Add to Basket
    @Then("^User can view that Book in the Menu item with price.$")
    public void verifyArrivalImageAddToBasket(){
        homePage.verifyArrivalImageAddToBasket();
    }

    //Scenario: 7. Home page - Arrivals-Add to Basket with more books
    @Then("^Now it throws an error prompt like you must enter a value between 1 and 20$")
    public void verifyInputGreaterThanMaxItem(){
        homePage.verifyInputGreaterThanMaxItem();
    }

    //Scenario: 8. Home-Arrivals-Add to Basket-Items
    @Then("^User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page$")
    public void verifyCheckOutPage()
    {
        homePage.verifyCheckOutPage();
    }

    //Scenario: 9. Home-Arrivals-Add to Basket-Items-Coupon
    @Then("^User can able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give 50rps off on the total price$")
    public void verifyGetOffTotal(){
        homePage.verifyCanApplyCoupon();
    }

    //Scenario: 10. Home-Arrivals-Add to Basket-Items-Coupon value<450
    @Then("^User can not able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give 50rps off on the total price$")
    public void verifyCanNotApplyCoupon(){
        homePage.verifyCanNotApplyCoupon();
    }

    //Scenario: 11. Home-Arrivals-Add to Basket-Items-Remove book
    @Then("^User has the feasibility to remove the book at the time of check out also$")
    public void verifyRemoveTheBook(){
        homePage.verifyRemoveTheBook();
    }

    //Scenario: 12. Home-Arrivals-Add to Basket-Items-Add book
    @Then("^User has the feasibility to Update Basket at the time of check out.$")
    public void verifyUpdateBasket1(){
        homePage.verifyAddBasket();
    }

    //Scenario: 13. Home-Arrivals-Add to Basket-Items-Check-out-Book Final price
    @Then("^Now User can find the Total price of the book in the Check out grid.$")
    public void verifyTotalPrice(){
        homePage.verifyTotalPrice();
    }

    //Scenario: 14. Home-Arrivals-Add to Basket-Items-Check-out-Update Basket
    @Then("^User has the feasibility to Update Basket at the time of check out$")
    public void verifyUpdateBasket2(){
        homePage.verifySubtractBasket();
    }

    //Scenario: 15. Home-Arrivals-Add to Basket-Items-Check-out-Total & Sub-total condition
    @Then("^The total always > subtotal because taxes are added in the subtotal$")
    public void verifyTotalGreaterThanSubtotal(){
        homePage.verifyTotalGreaterThanSubtotal();

    }

    //Scenario: 16. Home-Arrivals-Add to Basket-Items-Check-out functionality
    @Then("^Clicking on Proceed to Checkout button leads to payment gateway page$")
    public void verifyLeadToPaymentGatewayPage(){
        homePage.verifyLeadToPaymentGatewayPage();
    }

    //Scenario: 17. Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway
    @Then("^User has the feasibility to add coupon in the payment gateway page and also he can find billing,order and additional details.$")
    public void verifyInformationInPaymentGatewayPage(){
        homePage.verifyInformationInPaymentGatewayPage();
    }

    @After
    public void afterTest(Scenario scenario) {
        if (true) {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "anh"); //stick it in the report
        }
        homePage.getDriver().quit();
    }
}
