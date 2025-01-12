package com.banking.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

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

    public void enterNewAccountName(String newAccountName) {
        LOGGER.info("Entering new account name: {}", newAccountName);

        // Hesap adı alanını kontrol et ve doldur
        verifyElementVisible("accountNameField", "Account Name field is not visible.");
        WebElement accountNameField = elementHelper.findElement("accountNameField");
        accountNameField.clear(); // Alanı temizle
        accountNameField.sendKeys(newAccountName); // Yeni adı gir
    }

    public void clickUpdateButton() {
        LOGGER.info("Clicking the Update button.");

        // Güncelleme butonunun görünür olduğunu kontrol et ve tıkla
        verifyElementVisible("updateButton", "Update button is not visible.");
        elementHelper.findElement("updateButton").click();
    }

    public void verifyAccountNameIsUpdated(String newAccountName) {
        LOGGER.info("Verifying that the account name is updated to: {}", newAccountName);
        verifyElementVisible("myAccountName", "Updated account name element is not visible.");
        WebElement updatedAccountNameElement = elementHelper.findElement("myAccountName");
        String actualAccountName = updatedAccountNameElement.getText();
        Assertions.assertEquals(newAccountName, actualAccountName,
                String.format("Expected account name '%s' but found '%s'.", newAccountName, actualAccountName));
        LOGGER.info("Account name is successfully updated to: {}", newAccountName);
    }
}
