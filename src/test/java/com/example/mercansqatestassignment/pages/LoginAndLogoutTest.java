package com.example.mercansqatestassignment.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.mercansqatestassignment.utils.RandomDataGenerator;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

    public class LoginAndLogoutTest extends BaseTest  {
        LoginPage loginPage = new LoginPage();

        @BeforeAll
        public static void setUpAll() {
            Configuration.browserSize = "1280x800";
            SelenideLogger.addListener("allure", new AllureSelenide());
        }

        @BeforeEach
        public void setUp() {
            Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
            open(loginPageURL);
        }

        @Test
        public void correctLogin(){
            LoginPage loginPage = new LoginPage();
            loginPage.userNameInput.setValue(username);
            loginPage.passwordFieldInput.setValue(userPassword);
            loginPage.loginButton.click();
            loginPage.loginError.shouldNotBe(visible);
        }

        @Test
        public void incorrectLogin(){
            LoginPage loginPage = new LoginPage();
            loginPage.userNameInput.setValue(RandomDataGenerator.generateEmail());
            loginPage.passwordFieldInput.setValue(RandomDataGenerator.generatePassword());
            loginPage.loginButton.click();
            loginPage.loginError.shouldBe(visible);
        }

        @Test
        public void openLeavesPage(){
            LeavePage leavePage = loginPage.login(username, userPassword);
            leavePage.LeavesDropDown.click();
            leavePage.myLeavesLink.click();
            leavePage.balanceLeaveCard.shouldBe(visible);
        }

        @Test
        public void logOut(){
            LeavePage leavePage = loginPage.login(username, userPassword);
            leavePage.profilePopUpOpenButton.click();
            leavePage.profilePopUpSignOutButton.click();
            loginPage.loginButton.shouldBe(visible);
        }
    }
