package com.hendisantika.stepdefinitions;

import com.hendisantika.pages.BasePage;
import com.hendisantika.pages.CheckoutPage;
import com.hendisantika.pages.ItemsPage;
import com.hendisantika.pages.LoginPage;
import com.microsoft.playwright.Page;
import io.cucumber.java.en.Given;

/**
 * Created by IntelliJ IDEA.
 * Project : Playwright-Java-Cucumber
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/10/23
 * Time: 07:53
 * To change this template use File | Settings | File Templates.
 */
public class Steps extends BasePage {


    private LoginPage loginPage;
    private ItemsPage itemsPage;
    private CheckoutPage checkoutPage;

    private Page page;

    @Given("^User launched SwagLabs application$")
    public void user_launched_swaglabs_application() {
        try {
            page = createPlaywrightPageInstance(System.getProperty("browser"));
            page.navigate(System.getProperty("applicationUrl"));
            loginPage = new LoginPage(page);
            itemsPage = new ItemsPage(page);
            checkoutPage = new CheckoutPage(page);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
