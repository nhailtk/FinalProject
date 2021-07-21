package page;

import common.BasePage;
import io.cucumber.gherkin.Parser;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    WebDriver driver;
    String temp;
    int oldQuantity1, oldQuantity2;

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

    @FindBy(xpath = "(//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']//img)[2]")
    WebElement arrival2;

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

    @FindBy(xpath = "//span[contains(text(),'item')]")
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

    @FindBy(xpath = "//tr[@class='cart-discount coupon-krishnasakinala']//th")
    WebElement lblGetOffTotal;

    @FindBy(xpath = "//ul[@class='woocommerce-error']//li[contains(text(),'The minimum spend for this coupon is ')]")
    WebElement lblErrorCoupon;

    @FindBy(xpath = "//a[@data-product_id ='160']")
    WebElement iconRemove;

    @FindBy(xpath = "//div[@class='woocommerce']//p[@class='cart-empty' and contains(text(),'Your basket is currently empty.')]")
    WebElement lblEmptyBook;

    @FindBy(xpath = "//div[@class='quantity']//input[@title = 'Qty']")
    WebElement inputQuantity;

    @FindBy(xpath = "//input[@name='update_cart']")
    WebElement btnUpdateBasket;

    @FindBy(xpath = "//td[@class='product-subtotal']//span[@class='woocommerce-Price-amount amount']")
    WebElement lblSubTotal;

    @FindBy(xpath = "//tr[@class='order-total']")
    WebElement totalPrice;

    @FindBy(xpath = "//tr[@class='tax-rate tax-rate-roaming-tax-1']")
    WebElement taxRate;

    @FindBy(xpath = "//tr[@class='cart-subtotal']")
    WebElement cartSubTotal;

    @FindBy(xpath = "//div[@class='wc-proceed-to-checkout']//a[contains(text(),'Proceed to Checkout')]")
    WebElement btnProcessToCheckout;

    @FindBy(xpath = "//div[@class='woocommerce-billing-fields']//h3")
    WebElement lblBillingDetails;

    @FindBy(xpath = "//div[@class='col-1']")
    WebElement panelBillingDetails;

    @FindBy(xpath = "//div[@class='col-2']")
    WebElement panelAdditionalInformation;

    @FindBy(xpath = "//table[@class='shop_table woocommerce-checkout-review-order-table']")
    WebElement panelOrderDetails;

    @FindBy(xpath = "//div[@id='payment']")
    WebElement panelPaymentGatewayDetails;

    @FindBy(xpath = "//input[@id='billing_first_name']")
    WebElement txtFirstName;

    @FindBy(xpath = "//input[@id='billing_last_name']")
    WebElement txtLastName;

    @FindBy(xpath = "//input[@id='billing_email']")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@id='billing_phone']")
    WebElement txtPhoneNumber;

    @FindBy(xpath = "//select[@id='billing_country']")
    WebElement pullDownCountry;

    @FindBy(xpath = "//input[@id='billing_address_1']")
    WebElement txtAddress;

    @FindBy(xpath = "//input[@id='billing_city']")
    WebElement txtCity;

    @FindBy(xpath = "//textarea[@id='order_comments']")
    WebElement txtOrderComment;

    @FindBy(xpath = "//input[@id='payment_method_cheque']")
    WebElement radioPaymentMethod;

    @FindBy(xpath = "//div[@class='woocommerce-info']//a[contains(text(),'Click here to enter your code')]")
    WebElement linkAddCoupon;

    @FindBy(xpath = "//input[@id='coupon_code']")
    WebElement txtInputCoupon;

    @FindBy(xpath = "//input[@name='apply_coupon']")
    WebElement btnApplyCoupon2;

    @FindBy(xpath = "//tr[@class='cart-subtotal']")
    WebElement orderSubTotal;

    @FindBy(xpath = "//tr[@class='cart-discount coupon-krishnasakinala']")
    WebElement orderCartDiscount;

    @FindBy(xpath = "//tr[@class='tax-rate tax-rate-roaming-tax-1']")
    WebElement orderTaxRate;

    @FindBy(xpath = "//tr[@class='order-total']")
    WebElement orderTotal;

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

    public void clickArrival2() {
        arrival2.click();
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

    public void inputCouponCode() {
        txtCouponCode.clear();
        txtCouponCode.sendKeys("krishnasakinala");
    }

    public void verifyCanApplyCoupon() {
        btnApplyCoupon.click();
        waitForSec(3);
        Assert.assertEquals(lblGetOffTotal.getText(), "Coupon: krishnasakinala");
    }

    public void verifyCanNotApplyCoupon() {
        btnApplyCoupon.click();
        waitForSec(10);
        Assert.assertEquals(lblErrorCoupon.getText(), "The minimum spend for this coupon is ₹450.00.");
    }

    public void clickIconRemove() {
        iconRemove.click();
    }

    public void verifyRemoveTheBook() {
        waitForSec(5);
        Assert.assertFalse(!iconRemove.isDisplayed());
    }

    public void verifyInputGreaterThanMaxItem() {
        Assert.assertEquals(inputItem.getAttribute("validationMessage"), "Value must be less than or equal to " + temp + ".");
    }

    public void verifyArrivalImageAddToBasket() {
        waitForSec(3);
        Assert.assertTrue(item.isDisplayed());
        Assert.assertTrue(priceInMenu.isDisplayed());
    }

    public void clickTextBoxQuantity() {
        oldQuantity1 = Integer.valueOf(inputQuantity.getAttribute("value"));
        inputQuantity.sendKeys(Keys.ARROW_UP);
    }

    public void clickSubTractTextBoxQuantity() {
        oldQuantity2 = Integer.valueOf(inputQuantity.getAttribute("value"));
        inputQuantity.sendKeys(Keys.ARROW_DOWN);
    }

    public void enableUpdateBasketButton() {
        Assert.assertTrue(btnUpdateBasket.isEnabled());
    }

    public void clickUpdateBasket() {
        btnUpdateBasket.click();
    }

    public void verifyAddBasket() {
        waitForSec(5);
        String temp = String.valueOf(oldQuantity1 + 1);
        Assert.assertEquals(temp, inputQuantity.getAttribute("value"));

    }

    public void verifySubtractBasket() {
        waitForSec(5);
        String temp = String.valueOf(oldQuantity2 - 1);
        System.out.println(temp);
        System.out.println(inputQuantity.getAttribute("value"));
        Assert.assertEquals(temp, inputQuantity.getAttribute("value"));
    }

    public void verifyTotalPrice() {
        Assert.assertTrue(totalPrice.isDisplayed());
    }

    public void visibleTotalAndSubtotal(){
        Assert.assertTrue(totalPrice.isDisplayed());
        Assert.assertTrue(cartSubTotal.isDisplayed());
    }

    public void verifyTotalGreaterThanSubtotal(){
        Assert.assertTrue(taxRate.isDisplayed());
    }

    public void clickButtonProcessToCheckout(){
        btnProcessToCheckout.click();
    }

    public void verifyLeadToPaymentGatewayPage(){
        Assert.assertTrue(lblBillingDetails.isDisplayed());
    }
    public void viewItemInPaymentGatewayPage(){
        Assert.assertTrue(panelBillingDetails.isDisplayed());
        Assert.assertTrue(panelAdditionalInformation.isDisplayed());
        Assert.assertTrue(panelOrderDetails.isDisplayed());
        Assert.assertTrue(panelPaymentGatewayDetails.isDisplayed());
    }
    public void fillDataInPaymentGatewayPage(){
        txtFirstName.clear();
        txtFirstName.sendKeys("Mai Hoa");
        txtLastName.clear();
        txtLastName.sendKeys("Nguyen");
        txtEmail.clear();
        txtEmail.sendKeys("nhailtk@gmail.com");
        txtPhoneNumber.clear();
        txtPhoneNumber.sendKeys("0971720714");
        waitForSec(3);
        Select itemCountry = new Select(pullDownCountry);
        itemCountry.selectByVisibleText("Vietnam");
        txtAddress.clear();
        txtAddress.sendKeys("ngo cho Kham Thien");
        txtCity.clear();
        txtCity.sendKeys("Ha Noi");
        waitForSec(3);
        txtOrderComment.clear();
        txtOrderComment.sendKeys("Ship in working day");
        waitForSec(3);
        radioPaymentMethod.isSelected();
    }
    public void verifyInformationInPaymentGatewayPage(){
        waitForSec(10);
        JavascriptExecutor jse = (JavascriptExecutor)getDriver();
        jse.executeScript("window.scrollBy(0,-250)");
        System.out.println("123456");
        linkAddCoupon.click();
        waitForSec(3);
        txtInputCoupon.clear();
        txtInputCoupon.sendKeys("krishnasakinala");
        btnApplyCoupon2.click();
        waitForSec(5);
        Assert.assertTrue(orderSubTotal.isDisplayed());
        Assert.assertTrue(orderCartDiscount.isDisplayed());
        Assert.assertTrue(orderTaxRate.isDisplayed());
        Assert.assertTrue(orderTotal.isDisplayed());
    }
}
