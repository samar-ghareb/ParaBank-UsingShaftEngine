package com.test.shaft;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AccountsOverviewTest {
    @Test
    public void checkAccountsOverviewPage() {
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://parabank.parasoft.com/parabank/index.htm");


        By usernameField = By.name("username");
        driver.element().type(usernameField,"john");

        By passwordField = By.name("password");
        driver.element().type(passwordField,"demo");
        By loginButton = By.xpath("//input[@value='Log In']");
        driver.element().click(loginButton);

        driver.element().click(By.linkText("Accounts Overview"));

        By accountTable = By.id("accountTable");
        driver.assertThat().element(accountTable).exists();
        driver.quit();

    }
}


