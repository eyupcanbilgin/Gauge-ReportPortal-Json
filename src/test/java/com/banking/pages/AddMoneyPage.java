package com.banking.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Assertions;

public class AddMoneyPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(AddMoneyPage.class);

    public AddMoneyPage() {
        super(); // BasePage constructor'ını çağırır
        elementHelper.loadElementsFromJson("src/test/resources/elementValues/addMoney.json");
    }

    public void clickAddMoneyButton() {
        LOGGER.info("Clicking the Add Money button.");
        WebElement addMoneyButton = elementHelper.findElement("addMoneyButton");
        Assertions.assertTrue(addMoneyButton.isDisplayed(), "Add Money button is not visible.");
        addMoneyButton.click();
    }

    public void verifyAddMoneyPopupElements() {
        LOGGER.info("Verifying Add Money popup elements are visible.");
        WebElement popupTitle = elementHelper.findElement("popupTitle");
        WebElement amountField = elementHelper.findElement("amountField");
        WebElement confirmButton = elementHelper.findElement("confirmButton");

        Assertions.assertTrue(popupTitle.isDisplayed(), "Popup title is not visible.");
        Assertions.assertTrue(amountField.isDisplayed(), "Amount field is not visible.");
        Assertions.assertTrue(confirmButton.isDisplayed(), "Confirm button is not visible.");
    }
}