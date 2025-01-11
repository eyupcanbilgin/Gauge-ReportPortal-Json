package com.banking.pages;

import com.banking.utils.DriverFactory;
import com.banking.utils.ElementHelper;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;
    protected ElementHelper elementHelper;

    public BasePage() {
        this.driver = DriverFactory.getDriver("chrome", false);
        this.elementHelper = new ElementHelper(driver);

    }
}
