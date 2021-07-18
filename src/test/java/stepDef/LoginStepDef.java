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
import page.LoginPage;

public class LoginStepDef {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    public LoginStepDef() {
        this.driver = DriverFactory.createDriver();
        homePage = new HomePage(this.driver);
        loginPage = new LoginPage(this.driver);
    }

    @Given("^Open home page$")
    public void openHomePage() {
        homePage.openHomePage();
    }

    @When("^Click on My Account Menu$")
    public void clickMyAccountMenu() {
        loginPage.clickMyAccountMenu();
    }

    @And("^Enter registered (.*) in username textbox$")
    public void enterUsername(String username) {
        loginPage.inputUserName(username);
    }

    @And("^Enter (.*) in password textbox$")
    public void enterPassword(String password) {

        loginPage.inputPassword(password);
    }

    @And("^Click on login button$")
    public void clickLoginButton() {

        loginPage.clickLoginButton();
    }

    @And("^Now enter empty password in the password textbox$")
    public void emptyPassword() {
        loginPage.emptyPassword();
    }

    @And("^Enter empty username in username textbox$")
    public void emptyUserName(){
        loginPage.emptyUserName();
    }
    @And("^Enter the case changed password: (.*) in the password tetxbox$")
    public void inputOldPassword(String oldPassword){
        loginPage.inputPassword(oldPassword);
    }
    @And("^Once your are logged in, sign out of the site$")
    public void clickLogout(){
        loginPage.clickLogout();
    }
    @And("^Now press back button$")
    public void clickBackButton(){
        driver.navigate().back();
    }

    //Scenario: 1. Log-in with valid username and password
    @Then("^User must successfully login to the web page$")
    public void verifyLoginWithCorrectUsernameAndCorrectPassword() {

        loginPage.verifyLoginPass();
    }

    //Scenario: 2. Log-in with incorrect username and  incorrect password
    @Then("^User should see error message1:(.*)")
    public void verifyLoginWithIncorrectUsernameAndIncorrectPassword(String message) {
        loginPage.verifyLoginFail(message);
    }

    // Scenario: 3. Log-in with correct username and empty password
    @Then("^User should see error message2:(.*)$")
    public void verifyLoginWithCorrectUsernameAndEmptyPassword(String message) {
        loginPage.verifyLoginFail(message);
    }
    //Scenario: 4. Log-in with empty username and valid password. Scenario: 5. Log-in with empty username and empty password.
    @Then("^User should see error message3:(.*)")
    public void verifyLoginWithEmptyUsernameAndCorrectPassword(String message){
        loginPage.verifyLoginFail(message);
    }
    //Scenario: 5. Log-in with empty username and empty password.
    @Then("^User should see error message4:(.*)")
    public void verifyLoginWithEmptyUsernameAndEmptyPassword(String message){
        loginPage.verifyLoginFail(message);
    }

    //6. Log-in -Password should be masked
    @Then("^The password field should display the characters in asterisks or bullets such that the password is not visible on the screen$")
    public void verifyPasswordShouldBeMasked(){
        loginPage.verifyMaskedPassword();
    }

    //Scenario: 7. Login-Handles case sensitive
    @Then("^Login must fail saying incorrect password: (.*)$")
    public void verifyLoginWithOldPassword(String message){
        loginPage.verifyLoginFail(message);
    }

    //Scenario: 8. Login-Authentication
    @Then("^User shouldn’t be signed in to his account rather a general webpage must be visible$")
    public void verifyUserShouldNotBeSignedIn(){
        loginPage.verifyLogoutPass();
    }

    @After
    public void afterTest(Scenario scenario) {
        if (true) {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "anh"); //stick it in the report
        }
        loginPage.getDriver().quit();
    }
}
