package com.hendisantika.pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

/**
 * Created by IntelliJ IDEA.
 * Project : Playwright-Java-Cucumber
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/10/23
 * Time: 07:54
 * To change this template use File | Settings | File Templates.
 */
public abstract class BasePage {
    /**
     * Page
     */

    protected Browser browser;
    protected Page page;

    public Page createPlaywrightPageInstance(String browserTypeAsString) {
        BrowserType browserType = null;
        switch (browserTypeAsString) {
            case "Firefox":
                browserType = Playwright.create().firefox();
                break;
            case "Chromium":
                browserType = Playwright.create().chromium();
                break;
            case "Webkit":
                browserType = Playwright.create().webkit();
                break;

        }
        if (browserType == null) {
            throw new IllegalArgumentException("Could not launch a browser for type " + browserTypeAsString);
        }
        browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(true));
        page = browser.newPage();
        return page;

    }
}
