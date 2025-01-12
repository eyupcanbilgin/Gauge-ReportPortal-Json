package com.banking.pages;

import com.banking.utils.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
        verifyElementVisible("usernameField", "Username field is not visible.");
        elementHelper.findElement("usernameField").sendKeys(username);
    }

    public void enterPassword() {
        String password = Config.get("PASSWORD");
        LOGGER.info("Entering password.");
        verifyElementVisible("passwordField", "Password field is not visible.");
        elementHelper.findElement("passwordField").sendKeys(password);
    }

    public void clickLoginButton() {
        LOGGER.info("Clicking the login button.");
        verifyElementVisible("loginButton", "Login button is not visible.");
        elementHelper.findElement("loginButton").click();
    }
}
