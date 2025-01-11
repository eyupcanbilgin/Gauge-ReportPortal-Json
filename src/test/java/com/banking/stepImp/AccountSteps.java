package com.banking.stepImp;

import com.banking.pages.AccountPage;
import com.thoughtworks.gauge.Step;

public class AccountSteps {

    private final AccountPage accountPage;

    public AccountSteps() {
        this.accountPage = new AccountPage();
    }

    @Step("Click the Open Money Transfer button")
    public void clickOpenMoneyTransferButton() {
        accountPage.clickOpenMoneyTransferButton();
    }

    @Step("Verify <key> element is visible")
    public void verifyElementIsVisible(String key) {
        accountPage.isElementVisible(key);
    }
}
