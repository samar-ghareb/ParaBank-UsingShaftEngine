package com.test.shaft;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UpdateProfileTest {
    @Test
    public void FindTransactions() {
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://parabank.parasoft.com/parabank/index.htm");

        By usernameField = By.name("username");
        By passwordField = By.name("password");
        By loginButton = By.xpath("//input[@value='Log In']");
        By updateContactInfoLink = By.partialLinkText("Update Contact");
        By firstnameField = By.id("customer.firstName");
        By lastnameField = By.id("customer.lastName");
        By addressField = By.id("customer.address.street");
        By cityField = By.id("customer.address.city");
        By stateField = By.id("customer.address.state");
        By zipcodeField = By.id("customer.address.zipCode");
        By phoneField = By.id("customer.phoneNumber");
        By updateProfileButton = By.xpath("//input[@type='button' and @value='Update Profile']");


        driver.element().type(usernameField, "john");
        driver.element().type(passwordField, "demo");
        driver.element().click(loginButton);
        driver.element().click(updateContactInfoLink);
        driver.element().type(firstnameField, "john");
        driver.element().type(lastnameField, "Smith");
        driver.element().type(addressField, "1431 Main St");
        driver.element().type(cityField, "Beverly Hills");
        driver.element().type(stateField, "CA");
        driver.element().type(zipcodeField, "90210");
        driver.element().type(phoneField, "310-447-4121");
        driver.element().click(updateProfileButton);
        driver.quit();


    }
}