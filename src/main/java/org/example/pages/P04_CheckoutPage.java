package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P04_CheckoutPage {

    public  P04_CheckoutPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);}

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Full Name* input field\"]")
    public WebElement name;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Card Number* input field\"]")
    public WebElement cardnumber;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Expiration Date* input field\"]")
    public WebElement date;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Security Code* input field\"]")
    public WebElement code;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Review Order button\"]/android.widget.TextView")
    public WebElement revieworder;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Place Order button\"]")
    public WebElement placeorder;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Continue Shopping button\"]/android.widget.TextView")
    public WebElement ContinueShopping;


}


