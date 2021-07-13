package page;

import common.BasePage;
import io.cucumber.gherkin.Parser;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    WebDriver driver;
    String temp;

    //WebElement shopMenu = driver.findElement(By.xpath("//ul[@id='main-nav']//li[@id='menu-item-40']"));
    @FindBy(xpath = "//ul[@id='main-nav']//li[@id='menu-item-40']")
    WebElement shopMenu;

    @FindBy(xpath = "//div[@id='content']//a[contains(text(),'Home')]")
    WebElement homeMenuButton;

    @FindBy(xpath = "//div[@data-slide-duration='0']//img")
    List<WebElement> sliders;

    @FindBy(xpath = "//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']//img")
    List<WebElement> arrivals;

    @FindBy(xpath = "(//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']//img)[1]")
    WebElement arrival1;

    @FindBy(xpath = "//button[@type = 'submit' and contains(text(), 'Add to basket')]")
    WebElement btnAddToBasket;

    @FindBy(xpath = "//li[@class='description_tab active']")
    WebElement descriptionTab;

    @FindBy(xpath = "//div[@id='tab-description']//h2")
    WebElement arrival_Image_Description;

    @FindBy(xpath = "//li[@class='reviews_tab']")
    WebElement reviewsTab;

    @FindBy(xpath = "//div[@id='comments']//h2[contains(text(),'Reviews')]")
    WebElement arrival_Image_Reviews;

    @FindBy(xpath = "//span[contains(text(),'1 item')]")
    WebElement item;

    @FindBy(xpath = "//span[@class='amount']")
    WebElement priceInMenu;

    @FindBy(xpath = "//span[@class='woocommerce-Price-amount amount']")
    WebElement priceItem;

    @FindBy(xpath = "//input[@type='number']")
    WebElement inputItem;

    @FindBy(xpath = "//p[@class='stock in-stock']")
    WebElement maxItem;

    @FindBy(xpath = "//a[@class='wpmenucart-contents']")
    WebElement menuCart;

    @FindBy(xpath = "//div[@class='cart_totals ']//h2[contains(text(),'Basket Totals')]")
    WebElement lblBasketTotals;

    @FindBy(xpath = "//input[@id = 'coupon_code']")
    WebElement txtCouponCode;

    @FindBy(xpath = "//input[@type='submit' and @value ='Apply Coupon']")
    WebElement btnApplyCoupon;

    @FindBy(xpath= "//tr[@class='cart-discount coupon-krishnasakinala']//th")
    WebElement lblGetOffTotal;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage() {
        getDriver().get("http://practice.automationtesting.in/");
        getDriver().manage().window().maximize();
    }

    public void clickShopMenu() {
        shopMenu.click();
    }

    public void clickHomeMenuButton() {
        homeMenuButton.click();
    }


    public void verifySlidersNumber() {
        Assert.assertEquals(3, sliders.size());
    }

    public void verifyArrivalsNumber() {
        Assert.assertEquals(3, arrivals.size());
    }

    public void clickArrival1() {
        arrival1.click();
    }

    public void verifyImageShouldNavigate() {
        Assert.assertTrue(btnAddToBasket.isDisplayed());
    }

    public void clickDescriptionTab() {
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        waitForSec(3);
        descriptionTab.click();
    }

    public void verifyArrivalImageDescription() {
        Assert.assertTrue(arrival_Image_Description.isDisplayed());
    }

    public void clickReviewTab() {
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        waitForSec(3);
        reviewsTab.click();
    }

    public void verifyArrivalImageReviews() {
        Assert.assertTrue(arrival_Image_Reviews.isDisplayed());
    }

    public void clickAddToBasket() {
        btnAddToBasket.click();
    }

    public void inputGreaterThanMaxItem() {
        inputItem.clear();
        String a[] = maxItem.getText().split(" ");
        temp = a[0];
        int b = Integer.valueOf(temp) + 1;
        String data = String.valueOf(b);
        inputItem.sendKeys(data);
        clickAddToBasket();
    }

    public void clickMenuCart() {
        menuCart.click();
    }

    public void verifyCheckOutPage() {
        Assert.assertTrue(lblBasketTotals.isDisplayed());
    }

    public void inputCouponCode(){
        txtCouponCode.clear();
        txtCouponCode.sendKeys("krishnasakinala");
    }
    public void verifyGetOffTotal(){
        btnApplyCoupon.click();
        //waitForSec(10);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(lblGetOffTotal.getText(),"Coupon: krishnasakinala");
    }

    public void verifyInputGreaterThanMaxItem() {
        Assert.assertEquals(inputItem.getAttribute("validationMessage"), "Value must be less than or equal to " + temp + ".");
    }

    public void verifyArrivalImageAddToBasket() {
        waitForSec(3);
        Assert.assertTrue(item.isDisplayed());
        Assert.assertEquals(priceItem.getText(), priceInMenu.getText());
    }

}
