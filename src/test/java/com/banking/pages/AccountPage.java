package com.banking.pages;

import org.openqa.selenium.WebElement;

public class AccountPage extends BasePage {

    public AccountPage() {
        super(); // BasePage constructor'ını çağırır
        elementHelper.loadElementsFromJson("src/test/resources/elementValues/account.json");
    }

    public void clickOpenMoneyTransferButton() {
        WebElement button = elementHelper.findElement("openMoneyTransferButton");
        button.click();
    }

    public boolean isElementVisible(String key) {
        try {
            WebElement element = elementHelper.findElement(key);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}