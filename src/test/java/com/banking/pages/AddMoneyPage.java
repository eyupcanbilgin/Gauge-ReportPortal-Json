package com.banking.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

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

    public void clickCardNumberField() {
        LOGGER.info("Clicking the card number field.");
        WebElement cardNumberField = elementHelper.findElement("cardNumberField");
        cardNumberField.click();
    }

    public void enterCardNumberFieldWithSpecialCharacters() {
        LOGGER.info("Entering special characters in the card number field.");
        WebElement cardNumberField = elementHelper.findElement("cardNumberField");
        cardNumberField.clear();
        cardNumberField.sendKeys("!@#$%^&*()");
    }

    public void checkCardNumberFieldIsEmpty() {
        LOGGER.info("Checking if the card number field is empty.");
        WebElement cardNumberField = elementHelper.findElement("cardNumberField");
        boolean isEmpty = cardNumberField.getAttribute("value").isEmpty();
        if (!isEmpty) {
            throw new AssertionError("Card number field is not empty as expected.");
        }
    }

}
