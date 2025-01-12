package com.banking.stepImp;

import com.banking.pages.TransferPage;
import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;

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
    @Step("Enter transfer money amount field <amount>")
    public void enterAmount(String amount) {
        transferPage.enterAmount(amount);
    }

    @Step("Click the send button")
    public void clickSendButton() {
        transferPage.clickSendButton();
    }

    @Step("Check last transaction amount is <expectedAmount>")
    public void checkLastTransactionAmount(String expectedAmount) {
        transferPage.verifyLastTransactionAmount(expectedAmount);
    }
}
