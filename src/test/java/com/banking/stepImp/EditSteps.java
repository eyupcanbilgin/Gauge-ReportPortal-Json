package com.banking.stepImp;

import com.banking.pages.EditPage;
import com.thoughtworks.gauge.Step;

public class EditSteps {

    private final EditPage editPage;

    public EditSteps() {
        this.editPage = new EditPage();
    }

    @Step("Click the edit account button")
    public void clickEditAccountButton() {
        editPage.clickEditAccountButton();
    }

    @Step("Verify edit account popup elements is visible")
    public void verifyEditAccountPopupElements() {
        editPage.verifyEditAccountPopupElements();
    }

    @Step("Enter account name field new name <newAccountName>")
    public void enterAccountNameFieldNewName(String newAccountName) {
        editPage.enterNewAccountName(newAccountName);
    }

    @Step("Click the update button")
    public void clickUpdateButton() {
        editPage.clickUpdateButton();
    }

    @Step("Verify account name is updated to <newAccountName>")
    public void verifyAccountNameIsUpdated(String newAccountName) {
        editPage.verifyAccountNameIsUpdated(newAccountName);
    }
}
