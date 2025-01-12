package com.banking.pages;

import com.banking.utils.DriverFactory;
import com.banking.utils.ElementHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected ElementHelper elementHelper;
    protected static final Logger LOGGER = LogManager.getLogger(BasePage.class);

    public BasePage() {
        this.driver = DriverFactory.getDriver("chrome", false);
        this.elementHelper = new ElementHelper(driver);
    }

    public void verifyElementVisible(String elementKey, String errorMessage) {
        WebElement element = elementHelper.findElement(elementKey);
        WebDriverWait wait = new WebDriverWait(driver, 20); // 20 saniyeye kadar bekler
        wait.until(ExpectedConditions.visibilityOf(element));
        Assertions.assertTrue(element.isDisplayed(), errorMessage);
    }

    public void waitForSeconds(int seconds) {
        LOGGER.info("Waiting for {} seconds...", seconds);
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            LOGGER.error("Error while waiting: {}", e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
