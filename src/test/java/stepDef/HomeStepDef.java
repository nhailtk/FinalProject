package stepDef;

import common.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import page.HomePage;

public class HomeStepDef {
    WebDriver driver;
    HomePage homePage;

    public HomeStepDef() {
        driver = DriverFactory.createDriver();
        homePage = new HomePage(driver);
    }
    @Given("^Open Home page$")
    public void openHomePage(){
        homePage.openHomePage();
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
        homePage.verifyGetOffTotal();
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
