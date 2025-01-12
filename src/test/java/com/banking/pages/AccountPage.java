package com.banking.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AccountPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(AccountPage.class);

    public AccountPage() {
        super(); // BasePage constructor'ını çağırır
        elementHelper.loadElementsFromJson("src/test/resources/elementValues/account.json");
    }

    public void clickOpenMoneyTransferButton() {
        LOGGER.info("Clicking the Open Money Transfer button.");
        verifyElementVisible("openMoneyTransferButton", "Open Money Transfer button is not visible.");
        elementHelper.findElement("openMoneyTransferButton").click();
    }

    public void verifyElementVisibility(String key, String errorMessage) {
        LOGGER.info("Verifying visibility of element with key: {}", key);
        verifyElementVisible(key, errorMessage);
    }
}
