package org.ua.mk.vasylvovk.testing;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

/**
 * Created by vasyl on 12/5/15.
 */
public class SeleniumDemo001Test {
    String testURL;
    WebDriver driver;

    @org.junit.Before
    public void setUp() throws Exception {
        testURL = "https://www.paypal.com/ua/signup";

    }

    @Test
    public void openTestPayPal() {

        WebDriver driver = new FirefoxDriver();
        driver.get(testURL);
        driver.close();
        assertTrue(true);

    }

    @org.junit.After
    public void tearDown() throws Exception {
        //driver.close();
    }
}