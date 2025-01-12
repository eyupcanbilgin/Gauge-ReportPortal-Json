package com.banking.stepImp;

import com.banking.pages.EditPage;
import com.thoughtworks.gauge.Step;

public class EditSteps {

    private final EditPage editAccountPage;

    public EditSteps() {
        this.editAccountPage = new EditPage();
    }

    @Step("Click the edit account button")
    public void clickEditAccountButton() {
        editAccountPage.clickEditAccountButton();
    }

    @Step("Verify edit account popup elements is visible")
    public void verifyEditAccountPopupElements() {
        editAccountPage.verifyEditAccountPopupElements();
    }
}
