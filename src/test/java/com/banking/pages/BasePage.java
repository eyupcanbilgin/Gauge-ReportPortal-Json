package com.banking.pages;

import com.banking.utils.DriverFactory;
import com.banking.utils.ElementHelper;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;
    protected ElementHelper elementHelper;

    public BasePage() {
        this.driver = DriverFactory.getDriver("chrome", false);
        this.elementHelper = new ElementHelper(driver);

    }
    public void verifyElementVisible(String elementKey, String errorMessage) {
        WebElement element = elementHelper.findElement(elementKey);
        Assertions.assertTrue(element.isDisplayed(), errorMessage);
    }

}
