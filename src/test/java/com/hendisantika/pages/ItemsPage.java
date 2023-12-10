package com.hendisantika.pages;

import com.microsoft.playwright.Page;
import org.junit.Assert;

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
public class ItemsPage extends BasePage {

    private final Page page;

    public ItemsPage(Page page) {
        this.page = page;
    }

    public void orderProduct(String ProductName) {
        page.click("//div[text()='" + ProductName + "']/following::button[1]");
        page.click("#shopping_cart_container > a");
        Assert.assertTrue(page.isVisible("text=" + ProductName));
        page.click("[data-test=\"checkout\"]");
    }

    public void loginSuccessful() {
        Assert.assertTrue(page.isVisible("text=Products"));
    }
}
