package com.test.shaft;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RequestLoanTest {
    @Test
    public void FindTransactions() {
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://parabank.parasoft.com/parabank/index.htm");

        By usernameField = By.name("username");
        By passwordField = By.name("password");
        By loginButton = By.xpath("//input[@value='Log In']");
        By requestLoanLink = By.linkText("Request Loan");
        By LoanAmountField = By.id("amount");
        By downPaymentField = By.id("downPayment");
        By fromaccount = By.id("fromAccountId");
        By applyNowButton = By.xpath("//input[@value='Apply Now']");



        driver.element().type(usernameField, "john");
        driver.element().type(passwordField, "demo");
        driver.element().click(loginButton);
        driver.element().click(requestLoanLink);
        driver.element().type(LoanAmountField, "100");
        driver.element().type(downPaymentField, "50");
        driver.element().select(fromaccount,"13344");
        driver.element().click(applyNowButton);
        driver.quit();

    }
    }
