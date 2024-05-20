package com.example.mercansqatestassignment.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    public SelenideElement userNameInput = $x("//*[@name=\"email\"]");
    public SelenideElement passwordFieldInput = $x("//*[@name=\"password\"]");
    public SelenideElement loginButton = $x("//*[@class=\"button-main type--primary solid\"]");
    public SelenideElement loginError = $x("//*[@class=\"login-field__error error-message\"]");

    public LeavePage login(String username, String password) {
        userNameInput.setValue(BaseTest.username);
        passwordFieldInput.setValue(BaseTest.userPassword);
        loginButton.click();
        return new LeavePage();
    }
}
