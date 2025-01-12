package com.banking.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

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
    public void enterAmount(String amount) {
        LOGGER.info("Entering amount: {}", amount);
        WebElement amountField = elementHelper.findElement("amountField");
        amountField.clear();
        amountField.sendKeys(amount);
    }

    public void clickSendButton() {
        LOGGER.info("Clicking the send button.");
        verifyElementVisible("sendButton", "Send button is not visible.");
        elementHelper.findElement("sendButton").click();
    }

    public void verifyLastTransactionAmount(String expectedAmount) {
        LOGGER.info("Verifying last transaction amount is: {}", expectedAmount);
        WebElement transactionElement = elementHelper.findElement("lastTransactionAmount");
        String actualAmount = transactionElement.getText();
        Assertions.assertEquals(expectedAmount, actualAmount,
                String.format("Expected transaction amount '%s' does not match the actual amount '%s'.", expectedAmount, actualAmount));
        LOGGER.info("Last transaction amount verified successfully.");
    }
}
