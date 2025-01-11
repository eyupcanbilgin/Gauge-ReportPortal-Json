package com.banking.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Assertions;

public class EditPage extends BasePage{

    private static final Logger LOGGER = LogManager.getLogger(EditPage.class);


    public EditPage() {
        super(); // BasePage constructor'ını çağırır
        elementHelper.loadElementsFromJson("src/test/resources/elementValues/edit.json");
    }

    public void clickEditAccountButton() {
        LOGGER.info("Clicking the Edit Account button.");
        WebElement editAccountButton = elementHelper.findElement("editAccountButton");
        Assertions.assertTrue(editAccountButton.isDisplayed(), "Edit Account button is not visible.");
        editAccountButton.click();
    }

    public void verifyEditAccountPopupElements() {
        LOGGER.info("Verifying all elements in the Edit Account popup.");
        Assertions.assertTrue(elementHelper.isElementVisible("popupTitle"), "Popup title is not visible.");
        Assertions.assertTrue(elementHelper.isElementVisible("saveButton"), "Save button is not visible.");
        Assertions.assertTrue(elementHelper.isElementVisible("cancelButton"), "Cancel button is not visible.");
        LOGGER.info("All elements in the Edit Account popup are visible.");
    }
}
