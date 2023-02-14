package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P03_PaymentPage {

    public P03_PaymentPage(AppiumDriver driver) {PageFactory.initElements(new AppiumFieldDecorator(driver), this);}

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Full Name* input field\"]")
    public WebElement fullname ;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Address Line 1* input field\"]")
    public WebElement address;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Address Line 2 input field\"]")
    public WebElement addresstwo;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"City* input field\"]")
    public WebElement city;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"State/Region input field\"]")
    public WebElement state;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Zip Code* input field\"]")
    public WebElement zipcode;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Country* input field\"]")
    public WebElement country;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"To Payment button\"]")
    public WebElement topaymentbutton;

}
