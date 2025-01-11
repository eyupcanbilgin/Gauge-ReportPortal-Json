package com.banking.pages;

import com.banking.utils.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Assertions;

public class LoginPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(LoginPage.class);

    public LoginPage() {
        super(); // BasePage constructor'ını çağırır
        elementHelper.loadElementsFromJson("src/test/resources/elementValues/login.json");
    }

    public void navigateToBaseURL() {
        String baseURL = Config.get("BASE_URL");
        LOGGER.info("Navigating to URL: {}", baseURL);
        driver.get(baseURL);
    }

    public void enterUsername() {
        String username = Config.get("USERNAME");
        LOGGER.info("Entering username: {}", username);
        Assertions.assertTrue(isUsernameFieldVisible(), "Username field is not visible.");
        WebElement usernameField = elementHelper.findElement("usernameField");
        usernameField.sendKeys(username);
    }

    public void enterPassword() {
        String password = Config.get("PASSWORD");
        LOGGER.info("Entering password.");
        Assertions.assertTrue(isPasswordFieldVisible(), "Password field is not visible.");
        WebElement passwordField = elementHelper.findElement("passwordField");
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        LOGGER.info("Clicking the login button.");
        Assertions.assertTrue(isLoginButtonVisible(), "Login button is not visible.");
        WebElement loginButton = elementHelper.findElement("loginButton");
        loginButton.click();
    }

    public boolean isUsernameFieldVisible() {
        return elementHelper.isElementVisible("usernameField");
    }

    public boolean isPasswordFieldVisible() {
        return elementHelper.isElementVisible("passwordField");
    }

    public boolean isLoginButtonVisible() {
        return elementHelper.isElementVisible("loginButton");
    }
}