package com.banking.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TransferPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(TransferPage.class);

    public TransferPage() {
        super(); // BasePage constructor'ını çağırır
        elementHelper.loadElementsFromJson("src/test/resources/elementValues/transfer.json");
    }

    public void clickTransferMoneyButton() {
        LOGGER.info("Clicking the Transfer Money button.");
        verifyElementVisible("transferMoneyButton", "Transfer Money button is not visible.");
        elementHelper.findElement("transferMoneyButton").click();
    }

    public void verifyTransferMoneyPopupElements() {
        LOGGER.info("Verifying all elements in the Transfer Money popup.");

        verifyElementVisible("transferMoneyPopupTitle", "Transfer Money popup title is not visible.");
        verifyElementVisible("senderAccountTitle", "Sender account title is not visible.");
        verifyElementVisible("receiverAccountTitle", "Receiver account title is not visible.");
        verifyElementVisible("senderAccountButton", "Sender account dropdown is not visible.");
        verifyElementVisible("receiverAccountButton", "Receiver account dropdown is not visible.");
        verifyElementVisible("amountField", "Amount input field is not visible.");
        verifyElementVisible("sendButton", "Send button is not visible.");

        LOGGER.info("All elements in the Transfer Money popup are visible.");
    }
}
