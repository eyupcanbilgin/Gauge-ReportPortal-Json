package com.banking.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EditPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(EditPage.class);

    public EditPage() {
        super(); // BasePage constructor'ını çağırır
        elementHelper.loadElementsFromJson("src/test/resources/elementValues/edit.json");
    }

    public void clickEditAccountButton() {
        LOGGER.info("Clicking the Edit Account button.");
        verifyElementVisible("editAccountButton", "Edit Account button is not visible.");
        elementHelper.findElement("editAccountButton").click();
    }

    public void verifyEditAccountPopupElements() {
        LOGGER.info("Verifying all elements in the Edit Account popup.");

        verifyElementVisible("editAccountPopupTitle", "Edit Account popup title is not visible.");
        verifyElementVisible("accountNameTitle", "Account Name title is not visible.");
        verifyElementVisible("accountNameField", "Account Name field is not visible.");
        verifyElementVisible("updateButton", "Update button is not visible.");

        LOGGER.info("All elements in the Edit Account popup are visible.");
    }
}
