package com.banking.stepImp;

import com.banking.pages.LoginPage;
import com.thoughtworks.gauge.Step;

public class LoginSteps{

    private final LoginPage loginPage;

    public LoginSteps() {
        this.loginPage = new LoginPage();
    }

    @Step("Navigate to baseURL")
    public void navigateToBaseURL() {
        loginPage.navigateToBaseURL();
    }

    @Step("Enter username into the username field")
    public void enterUsername() {
        loginPage.enterUsername();
    }

    @Step("Enter password into the password field")
    public void enterPassword() {
        loginPage.enterPassword();
    }

    @Step("Click the login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }
}
