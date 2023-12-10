package com.hendisantika.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

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
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        features = "src/test/resources/features/",
        glue = {"stepdefinitions"},
        plugin = {"pretty", "junit:target/junitreport.xml", "json:target/jsonreport.json", "html:target/cucumber-reports"}

)
public class TestRunner {
    private TestRunner() {
    }
}
