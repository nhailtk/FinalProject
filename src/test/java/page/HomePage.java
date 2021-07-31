package page;

import common.BasePage;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    WebDriver driver;
    String temp, lblNumberItemInCart;
    int oldQuantity1, oldQuantity2, imageItem = 1, numberItem;
    String lblSubTotal, lblTax, lblPaymentMethod, lblTotal, price,subTotal, tax, total;
    float st, t, tt;

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

    @FindBy(xpath = "//p[@class='price']//span[contains(text(),'500.00')]")
    WebElement lblPrice;

    @FindBy(xpath = "//span[contains(text(),'item')]")
    WebElement item;

    @FindBy(xpath = "//span[@class='amount' and contains(text(),'₹')]")
    WebElement priceInMenu1;

    @FindBy(xpath = "//span[contains(text(),'₹400.00')]")
    WebElement priceInMenu2;

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

    @FindBy(xpath = "//tr[@class='cart-discount coupon-krishnasakinala']//span[contains(text(),'50.00')]")
    WebElement lblGetOffTotal;

    @FindBy(xpath = "//ul[@class='woocommerce-error']//li[contains(text(),'The minimum spend for this coupon is ')]")
    WebElement lblErrorCoupon;

    @FindBy(xpath = "//a[@data-product_id ='160']")
    WebElement iconRemove;

    @FindBy(xpath = "//p[contains(text(),'Your basket is currently empty.')]")
    WebElement lblEmptyBook;

    @FindBy(xpath = "//div[@class='quantity']//input[@title = 'Qty']")
    WebElement inputQuantity;

    @FindBy(xpath = "//input[@name='update_cart']")
    WebElement btnUpdateBasket;

    @FindBy(xpath = "//td[@class='product-subtotal']//span[@class='woocommerce-Price-amount amount']")
    WebElement SubTotal;

    @FindBy(xpath = "//tr[@class='order-total']//span[@class='woocommerce-Price-amount amount']")
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

    @FindBy(xpath = "//tr[@class='cart-subtotal']//span[contains(text(),'500.00')]")
    WebElement orderSubTotal;

    @FindBy(xpath = "//tr[@class='cart-discount coupon-krishnasakinala']")
    WebElement orderCartDiscount;

    @FindBy(xpath = "//tr[@class='tax-rate tax-rate-roaming-tax-1']//span[contains(text(),'25.00')]")
    WebElement orderTaxRate;

    @FindBy(xpath = "//tr[@class='order-total']//span[contains(text(),'525.00')]")
    WebElement orderTotal;

    @FindBy(xpath = "//input[@id='place_order']")
    WebElement btnPlaceOrder;

    @FindBy(xpath = "//th[contains(text(),'Subtotal:')]//following-sibling::td//span")
    WebElement orderSubTotal_Confirm;

    @FindBy(xpath = "//th[contains(text(),'Roaming Tax:')]//following-sibling::td//span")
    WebElement orderTaxRate_Confirm;

    @FindBy(xpath = "//th[contains(text(),'Total:')]//following-sibling::td//span")
    WebElement orderTotal_Confirm;

    @FindBy(xpath = "//th[contains(text(),'Payment Method:')]//following-sibling::td")
    WebElement paymentMethod_Confirm;

    @FindBy(xpath = "//th[contains(text(),'Email:')]//following-sibling::td")
    WebElement lblEmail_Confirm;

    @FindBy(xpath = "//th[contains(text(),'Telephone:')]//following-sibling::td")
    WebElement lblPhone_Confirm;

    @FindBy(xpath = "//address")
    WebElement address_Confirm;


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
        //get item number in the cart
        String a[] = item.getText().split(" ");
        String tmp = a[0];
        numberItem = Integer.valueOf(tmp);
        //======================
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
        imageItem = 2;
        arrival2.click();
    }

    public void verifyImageShouldNavigate() {
        Assert.assertTrue(btnAddToBasket.isDisplayed());
    }

    public void clickDescriptionTab() {
        waitElementVisible(descriptionTab);
        descriptionTab.click();
    }

    public void verifyArrivalImageDescription() {
        Assert.assertTrue(arrival_Image_Description.isDisplayed());
    }

    public void clickReviewTab() {
        waitElementVisible(reviewsTab);
        reviewsTab.click();
    }

    public void verifyArrivalImageReviews() {
        Assert.assertTrue(arrival_Image_Reviews.isDisplayed());
    }

    public void clickAddToBasket() {
        btnAddToBasket.click();
        if (imageItem == 1) {
            numberItem += 1;
            if (numberItem == 1) {
                lblNumberItemInCart = String.valueOf(numberItem) + " Item";
            } else {
                lblNumberItemInCart = String.valueOf(numberItem) + " Items";
            }
            validatePriceInCart();
        }
        if (imageItem == 2) {
            lblNumberItemInCart = "1 Item";
        }
    }
    public void validatePriceInCart(){
        String b[] = lblPrice.getText().split("");
        price = b[1];
        for (int i = 2; i < b.length; i++) {
            price = price + b[i];
        }
        float c = Float.valueOf(price);
        st = numberItem * c;
        String x = "₹" + String.valueOf(st) + "0";
        subTotal = x;
        if (x.length() > 7) {
            subTotal = x.substring(0, 2) + "," + x.substring(2, x.length());
        }
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
        waitElementVisible(lblBasketTotals);
        Assert.assertTrue(lblBasketTotals.isDisplayed());
    }

    public void inputCouponCode() {
        waitElementVisible(txtCouponCode);
        txtCouponCode.clear();
        txtCouponCode.sendKeys("krishnasakinala");
    }

    public void verifyCanApplyCoupon() {
        btnApplyCoupon.click();
        waitElementVisible(lblGetOffTotal);
        Assert.assertEquals("₹50.00", lblGetOffTotal.getText());
    }

    public void verifyCanNotApplyCoupon() {
        btnApplyCoupon.click();
        waitElementVisible(lblErrorCoupon);
        Assert.assertEquals(lblErrorCoupon.getText(), "The minimum spend for this coupon is ₹450.00.");
    }

    public void clickIconRemove() {
        iconRemove.click();
    }

    public void verifyRemoveTheBook() {
        waitElementVisible(lblEmptyBook);
        Assert.assertEquals("Your basket is currently empty.", lblEmptyBook.getText());
    }

    public void verifyInputGreaterThanMaxItem() {
        Assert.assertEquals(inputItem.getAttribute("validationMessage"), "Value must be less than or equal to " + temp + ".");
    }

    public void verifyArrivalImageAddToBasket() {
        // waitElementVisible(item);
        Assert.assertEquals(lblNumberItemInCart, item.getText());
        if (imageItem == 1) {
            Assert.assertEquals(subTotal, priceInMenu1.getText());
        }
        if (imageItem == 2) {
            Assert.assertEquals("₹400.00", priceInMenu2.getText());
        }

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
        waitElementVisible(inputQuantity);
        String temp = String.valueOf(oldQuantity1 + 1);
        Assert.assertEquals(temp, inputQuantity.getAttribute("value"));

    }

    public void verifySubtractBasket() {
        waitElementVisible(inputQuantity);
        String temp = String.valueOf(oldQuantity2 - 1);
        Assert.assertEquals(temp, inputQuantity.getAttribute("value"));
    }

    public void verifyTotalPrice() {
        t = st*5/100;
        tax = "₹" + String.valueOf(t) + "0";
         tt = st + t;
        total = "₹" + String.valueOf(tt) + "0";
        if (total.length() > 7) {
            total = total.substring(0, 2) + "," + total.substring(2, total.length());
        }
        Assert.assertEquals(total,totalPrice.getText());
    }

    public void visibleTotalAndSubtotal() {
        Assert.assertTrue(totalPrice.isDisplayed());
        Assert.assertTrue(cartSubTotal.isDisplayed());
    }

    public void verifyTotalGreaterThanSubtotal() {
        Assert.assertTrue(taxRate.isDisplayed());
    }

    public void clickButtonProcessToCheckout() {
        btnProcessToCheckout.click();
    }

    public void verifyLeadToPaymentGatewayPage() {
        Assert.assertTrue(lblBillingDetails.isDisplayed());
    }

    public void viewItemInPaymentGatewayPage() {
        Assert.assertTrue(panelBillingDetails.isDisplayed());
        Assert.assertTrue(panelAdditionalInformation.isDisplayed());
        Assert.assertTrue(panelOrderDetails.isDisplayed());
        Assert.assertTrue(panelPaymentGatewayDetails.isDisplayed());
//        lblSubTotal = orderSubTotal.getText();
//        lblTax = orderTaxRate.getText();
//        lblTotal = orderTotal.getText();
    }

    public void fillDataInPaymentGatewayPage() {
        txtFirstName.clear();
        txtFirstName.sendKeys("Mai Hoa");
        txtLastName.clear();
        txtLastName.sendKeys("Nguyen");
        txtEmail.clear();
        txtEmail.sendKeys("nhailtk@gmail.com");
        txtPhoneNumber.clear();
        txtPhoneNumber.sendKeys("0979780706");
        //waitElementVisible(pullDownCountry);
        Select itemCountry = new Select(pullDownCountry);
        itemCountry.selectByVisibleText("Vietnam");
        txtAddress.clear();
        txtAddress.sendKeys("Kham Thien");
        txtCity.clear();
        txtCity.sendKeys("Ha Noi");
        waitElementVisible(txtOrderComment);
        txtOrderComment.clear();
        txtOrderComment.sendKeys("Ship in working day");
        waitElementVisible(radioPaymentMethod);
        radioPaymentMethod.isSelected();
        lblPaymentMethod = radioPaymentMethod.getText();
        System.out.println(lblPaymentMethod);

    }

    public void verifyInformationInPaymentGatewayPage() {
//        waitForSec(30);
//        JavascriptExecutor jse = (JavascriptExecutor)getDriver();
//        jse.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
//        waitForSec(5);
//        linkAddCoupon.click();
//        waitForSec(5);
//        txtInputCoupon.clear();
//        txtInputCoupon.sendKeys("krishnasakinala");
//        btnApplyCoupon2.click();
        waitElementVisible(orderSubTotal);
        Assert.assertEquals(subTotal, orderSubTotal.getText());
        //Assert.assertTrue(orderCartDiscount.isDisplayed());//coupon has
        Assert.assertEquals(tax, orderTaxRate.getText());
        Assert.assertEquals(total, orderTotal.getText());
    }

    public void clickButtonPlaceOrder() {
        btnPlaceOrder.click();
        waitForSec(30);
    }

    public void verifyOrderConfirmationPage() {
        Assert.assertEquals(lblSubTotal, orderSubTotal_Confirm.getText());
        Assert.assertEquals(lblTax, orderTaxRate_Confirm.getText());
        System.out.println("1");
        Assert.assertEquals(lblPaymentMethod, paymentMethod_Confirm.getText());
        Assert.assertEquals(lblTotal, orderTotal_Confirm.getText());
        System.out.println("2");
    }
}
