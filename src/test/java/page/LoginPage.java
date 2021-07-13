package page;

import common.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@id='main-nav']//a[contains(text(),'My Account')]")
    WebElement myAccountMenu;
    @FindBy(xpath = "//input[@id='username']")
    WebElement txtUserName;
    @FindBy(xpath = "//input[@id='password']")
    WebElement txtPassword;
    @FindBy(xpath = "//input[@type ='submit' and @name = 'login']")
    WebElement btnLogin;
    @FindBy(xpath = "//nav[@class='woocommerce-MyAccount-navigation']//a[contains(text(),'Dashboard')]")
    WebElement dashBoard;
    @FindBy(xpath = "//nav[@class='woocommerce-MyAccount-navigation']//a[contains(text(),'Logout')]")
    WebElement logOut;
    @FindBy(xpath = "//div[@class='woocommerce']//h2[contains(text(),'Login')]")
    WebElement labelLogin;
    @FindBy(xpath = "//ul[@class='woocommerce-error']//li")
    WebElement errorLabel;


    public void clickMyAccountMenu() {
        myAccountMenu.click();
    }

    public void inputUserName(String userName) {
        txtUserName.clear();
        txtUserName.sendKeys(userName);
    }

    public void inputPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void verifyMaskedPassword() {
        Assert.assertTrue(txtPassword.getAttribute("type").equals("password"));
    }

    public void emptyPassword() {
        txtPassword.clear();
    }

    public void emptyUserName() {
        txtUserName.clear();
    }

    public void clickLoginButton() {
        btnLogin.click();
    }

    public void login(String username, String passWord) {
        inputUserName(username);
        inputPassword(passWord);
        clickLoginButton();
    }

    public void clickLogout() {
        logOut.click();
    }

    public void verifyLoginPass() {
        Assert.assertTrue(dashBoard.isDisplayed());
    }

    public void verifyLogoutPass() {
        Assert.assertTrue(labelLogin.isDisplayed());
    }

    public void verifyLoginFail(String message) {
        Assert.assertEquals(message, errorLabel.getText());
    }
}
