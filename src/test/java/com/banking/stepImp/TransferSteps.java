package com.banking.stepImp;

import com.banking.pages.TransferPage;
import com.thoughtworks.gauge.Step;

public class TransferSteps {

    private final TransferPage transferPage;

    public TransferSteps() {
        this.transferPage = new TransferPage();
    }

    @Step("Click the transfer money button")
    public void clickTransferMoneyButton() {
        transferPage.clickTransferMoneyButton();
    }

    @Step("Verify transfer money popup elements is visible")
    public void verifyTransferMoneyPopupElements() {
        transferPage.verifyTransferMoneyPopupElements();
    }
}
