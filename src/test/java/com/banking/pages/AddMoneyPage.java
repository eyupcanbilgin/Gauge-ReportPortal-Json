package com.banking.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AddMoneyPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(AddMoneyPage.class);

    public AddMoneyPage() {
        super(); // BasePage constructor'ını çağırır
        elementHelper.loadElementsFromJson("src/test/resources/elementValues/addmoney.json");
    }

    public void clickAddMoneyButton() {
        LOGGER.info("Clicking the Add Money button.");
        verifyElementVisible("addMoneyElement", "Add Money button is not visible.");
        elementHelper.findElement("addMoneyElement").click();
    }

    public void verifyAddMoneyPopupElements() {
        LOGGER.info("Verifying all elements in the Add Money popup.");

        verifyElementVisible("addMoneyElement", "Add Money popup title is not visible.");
        verifyElementVisible("cardNumberTitle", "Card Number title is not visible.");
        verifyElementVisible("cardHolderTitle", "Card Holder title is not visible.");
        verifyElementVisible("expiryDateTitle", "Expiry Date title is not visible.");
        verifyElementVisible("cvvTitle", "CVV title is not visible.");
        verifyElementVisible("amountTitle", "Amount title is not visible.");
        verifyElementVisible("addButton", "Add button is not visible.");

        LOGGER.info("All elements in the Add Money popup are visible.");
    }
}
