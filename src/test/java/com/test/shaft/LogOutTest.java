package com.test.shaft;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogOutTest {
    @Test
    public void validLogout() {
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://parabank.parasoft.com/parabank/index.htm");

        By usernameField = By.name("username");
        By passwordField = By.name("password");
        By loginButton = By.xpath("//input[@value='Log In']");
        By logOutLink = By.linkText("Log Out");

        driver.element().type(usernameField, "john");
        driver.element().type(passwordField, "demo");
        driver.element().click(loginButton);
        driver.element().click(logOutLink);
        driver.quit();
    }
}