package com.test.shaft;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BillPayTest {


    @Test
    public void validLogin(){
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://parabank.parasoft.com/parabank/index.htm");

        By usernameField = By.name("username");
        driver.element().type(usernameField,"john");

        By passwordField = By.name("password");
        driver.element().type(passwordField,"demo");
        By loginButton = By.xpath("//input[@value='Log In']");
        driver.element().click(loginButton);
        driver.element().click(By.linkText("Bill Pay"));

        By PayeeNameField = By.name("payee.name");
        By AddressField  = By.name("payee.address.street");
        By CityField  = By.name("payee.address.city");
        By StateField  = By.name("payee.address.state");
        By ZipCodeField  = By.name("payee.address.zipCode");
        By PhoneField  = By.name("payee.phoneNumber");
        By AccountField  = By.name("payee.accountNumber");
        By VerifyAccountField  = By.name("verifyAccount");
        By AmountAccountField  = By.name("amount");
        By FromaccountField  = By.name("fromAccountId");
        By SENDPAYMENTButton = By.xpath("//input[@type='button' and @value='Send Payment']");


        driver.element().type(PayeeNameField,"tester");
        driver.element().type(AddressField,"789 Main Road");
        driver.element().type(CityField,"New York");
        driver.element().type(StateField,"Texas");
        driver.element().type(ZipCodeField,"90001");
        driver.element().type(PhoneField,"1234567890");
        driver.element().type(AccountField,"1122334455");
        driver.element().type(VerifyAccountField,"1122334455");
        driver.element().type(AmountAccountField,"100");
        driver.element().select(FromaccountField,"13344");
        driver.element().click(SENDPAYMENTButton);
       driver.quit();
    }
}


