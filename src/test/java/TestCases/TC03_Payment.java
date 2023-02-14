package TestCases;

import org.example.pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC03_Payment extends TestBases {

//    P01_HomePage homePage;
    P02_AddToCart addToCart;

    P03_PaymentPage paymentPage;

    P04_CheckoutPage checkoutPage;

    @Test(priority = 2)
    public void TC002_checkPayment() throws InterruptedException {
//        homePage = new P01_HomePage(driver);
        addToCart = new P02_AddToCart(driver);
        paymentPage = new P03_PaymentPage(driver);
        checkoutPage = new P04_CheckoutPage(driver);



        //click on the bag
        homePage.thebag.click();
        // click add to cart
        addToCart.addtocart.click();
        // time
        Thread.sleep(3000);
        // click the cart
        addToCart.thecart.click();
        Thread.sleep(5000);
        addToCart.proceed.click();

        // click to full the name
        paymentPage.fullname.sendKeys("Nourah Mohammed"); //Rebecca Winter
        // full the address
        paymentPage.address.sendKeys("Nework 112");
        // full the second address
        paymentPage.addresstwo.sendKeys("China"); //Entrance
        // full the city
        paymentPage.city.sendKeys("Beijing"); //Truro
        // full the state
        paymentPage.state.sendKeys("Colur"); //"Cornwall
        // full the zip code
        paymentPage.zipcode.sendKeys("77564");  //"89750
        //full the country
        paymentPage.country.sendKeys("China"); //united kingdom



        // take screen shot
        PageBases.captureScreenshot(driver,"Before click topaymentbutton");

        //click to payment button
        paymentPage.topaymentbutton.click();
        //Assert if the user can click to payment button
        Assert.assertEquals(driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"To Payment button\"]/android.widget.TextView")).getText(),"To Payment");

        Thread.sleep(5000);
        //wait
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        // take screen shot
        PageBases.captureScreenshot(driver,"After click topaymentbutton");


        //check out
        checkoutPage.name.sendKeys("nora");
        // card number
        checkoutPage.cardnumber.sendKeys("325812657568789");
        //expiration date
        checkoutPage.date.sendKeys("03/25");
        //code for security
        checkoutPage.code.sendKeys("123");

        // take screen shot
        PageBases.captureScreenshot(driver,"Before click Review Order");

        //click to the button
        checkoutPage.revieworder.click();
        Assert.assertEquals(driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Review Order button\"]/android.widget.TextView")).getText(),"Review Order");
        Thread.sleep(5000);

        // take screen shot
        PageBases.captureScreenshot(driver,"After click Review Order");

        //click to place order
        checkoutPage.placeorder.click();

        // click to Continue Shopping
        checkoutPage.ContinueShopping.click();
        //Assert if the item purchasing successfully done
        Assert.assertEquals(driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"checkout complete screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")).getText(),"Checkout Complete");


        Thread.sleep(2000);


    }
}
