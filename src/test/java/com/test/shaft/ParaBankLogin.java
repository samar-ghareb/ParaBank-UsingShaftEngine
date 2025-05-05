package com.test.shaft;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ParaBankLogin {


    @Test
    public void validLogin(){
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://parabank.parasoft.com/parabank/index.htm");

        By usernameField = By.name("username");
        driver.element().type(usernameField,"test");

        By passwordField = By.name("password");
        driver.element().type(passwordField,"12345");
        By loginButton = By.xpath("//input[@value='Log In']");
        driver.element().click(loginButton);
        driver.quit();

    }
}

