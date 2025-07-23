package com.test.shaft;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindTransactionsTest {

    @Test
    public void FindTransactions() {
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
        WebDriver rawDriver = driver.getDriver();
        WebDriverWait wait = new WebDriverWait(rawDriver, Duration.ofSeconds(10));

        driver.browser().navigateToURL("https://parabank.parasoft.com/parabank/index.htm");

        By usernameField = By.name("username");
        By passwordField = By.name("password");
        By loginButton = By.xpath("//input[@value='Log In']");
        By findTransactionsLink = By.linkText("Find Transactions");
        By selectAnAccount = By.id("accountId");
        By findByTransactionID = By.id("transactionId");
        By findTransactions = By.id("findById");
        By findByDate = By.id("transactionDate");
        By findtransactions = By.id("findByDate");
        By fromDateField = By.id("fromDate");
        By toDateField = By.id("toDate");
        By findTransactionsRange = By.id("findByDateRange");
        By amountField = By.id("amount");
        By findTransactionsButton = By.id("findByAmount");

        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        driver.element().type(usernameField, "john");
        driver.element().type(passwordField, "demo");
        driver.element().click(loginButton);

        wait.until(ExpectedConditions.elementToBeClickable(findTransactionsLink));
        driver.element().click(findTransactionsLink);

        wait.until(ExpectedConditions.elementToBeClickable(selectAnAccount));
        driver.element().select(selectAnAccount, "13344");

        driver.element().type(findByTransactionID, "12345");
        driver.element().click(findTransactions);

        driver.element().type(findByDate, "05-05-2024");
        wait.until(ExpectedConditions.elementToBeClickable(findtransactions));
        driver.element().click(findtransactions);

        driver.element().type(fromDateField, "01-01-2023");
        driver.element().type(toDateField, "02-02-2023");
        driver.element().click(findTransactionsRange);

        driver.element().type(amountField, "200");
        driver.element().click(findTransactionsButton);
    }
}
