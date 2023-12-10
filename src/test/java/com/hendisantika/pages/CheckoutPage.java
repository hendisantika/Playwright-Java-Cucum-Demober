package com.hendisantika.pages;

import com.microsoft.playwright.Page;
import junit.framework.Assert;

/**
 * Created by IntelliJ IDEA.
 * Project : Playwright-Java-Cucumber
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/10/23
 * Time: 07:55
 * To change this template use File | Settings | File Templates.
 */
public class CheckoutPage extends BasePage {

    private final Page page;

    public CheckoutPage(Page page) {
        this.page = page;
    }

    public void fillCheckoutDetails(String firstname, String lastname, String postcode) {
        page.fill("[data-test=\"firstName\"]", firstname);
        page.fill("[data-test=\"lastName\"]", lastname);
        page.fill("[data-test=\"postalCode\"]", postcode);
    }

    public void completeCheckout() {
        page.click("[data-test=\"continue\"]");
        page.click("[data-test=\"finish\"]");
    }

    public void checkoutSuccessful() {
        Assert.assertTrue(page.isVisible("text=THANK YOU FOR YOUR ORDER"));
    }
}
