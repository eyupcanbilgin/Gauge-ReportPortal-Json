package com.banking.stepImp;

import com.banking.pages.AddMoneyPage;
import com.thoughtworks.gauge.Step;

public class AddMoneySteps {

    private final AddMoneyPage addMoneyPage;

    public AddMoneySteps() {
        this.addMoneyPage = new AddMoneyPage();
    }

    @Step("Click the add money button")
    public void clickAddMoneyButton() {
        addMoneyPage.clickAddMoneyButton();
    }

    @Step("Verify add money popup elements is visible")
    public void verifyAddMoneyPopupElements() {
        addMoneyPage.verifyAddMoneyPopupElements();
    }
}
