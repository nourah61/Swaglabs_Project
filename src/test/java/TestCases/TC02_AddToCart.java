package TestCases;

import org.example.pages.P01_HomePage;
import org.example.pages.P02_AddToCart;
import org.example.pages.PageBases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC02_AddToCart extends TestBases{
//    P01_HomePage homePage;
    P02_AddToCart addToCart;

    @Test(priority = 2)
    public void TC001_checkAdd() throws InterruptedException {
//        homePage = new P01_HomePage(driver);
        addToCart = new P02_AddToCart(driver);



        //click on the bag
        homePage.thebag.click();
        //time
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        // take screen shot
        PageBases.captureScreenshot(driver,"Before add the bag");

        // click add to cart
        addToCart.addtocart.click();

        //time
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        // take screen shot
        PageBases.captureScreenshot(driver,"After add the bag");

        // time
        Thread.sleep(3000);

        // click the cart
        addToCart.thecart.click();
        //Assert if ADD THE BAG was successfully
        Assert.assertEquals(driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Proceed To Checkout button\"]/android.widget.TextView")).getText(),"Proceed To Checkout");

        Thread.sleep(5000);
        addToCart.proceed.click();

}}
