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
 * Time: 07:56
 * To change this template use File | Settings | File Templates.
 */
public class LoginPage {
    private final Page page;

    public LoginPage(Page page) {
        this.page = page;
    }


    public void login(String username, String password) {
        page.fill("[data-test=\"username\"]", username);
        page.fill("[data-test=\"password\"]", password);
        page.click("[data-test=\"login-button\"]");
    }

    public void loginFailed() {
        boolean visible = page.isVisible("//h3[text()='Epic sadface: Sorry, this user has been locked out.']");
        Assert.assertTrue(visible);
    }
}
