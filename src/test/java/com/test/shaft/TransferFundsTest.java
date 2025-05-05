package com.test.shaft;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TransferFundsTest {
    @Test
    public void transferBetweenAccounts() {
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://parabank.parasoft.com/parabank/index.htm");

        By usernameField = By.name("username");
        driver.element().type(usernameField,"john");

        By passwordField = By.name("password");
        driver.element().type(passwordField,"demo");
        By loginButton = By.xpath("//input[@value='Log In']");
        driver.element().click(loginButton);

        driver.element().click(By.linkText("Transfer Funds"));

        driver.element().type(By.id("amount"), "100");

        driver.element().select(By.id("fromAccountId"), "13344");
        driver.element().select(By.id("toAccountId"), "13344");

        driver.element().click(By.xpath("//input[@value='Transfer']"));

        driver.quit();

    }
}
