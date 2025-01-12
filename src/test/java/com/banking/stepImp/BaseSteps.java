package com.banking.stepImp;

import com.banking.pages.BasePage;
import com.thoughtworks.gauge.Step;

public class BaseSteps {

    private final BasePage basePage;

    public BaseSteps() {
        this.basePage = new BasePage();
    }

    @Step("Wait <seconds> seconds")
    public void waitForSeconds(int seconds) {
        basePage.waitForSeconds(seconds);
    }
}
