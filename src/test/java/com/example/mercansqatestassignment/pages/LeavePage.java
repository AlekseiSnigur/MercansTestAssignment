package com.example.mercansqatestassignment.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class LeavePage {
        public SelenideElement LeavesDropDown = $x("/html/body/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/div/div[2]");
        public SelenideElement myLeavesLink = $x("//*[@class=\"lp-nav-menu__link__sub-link\"]");
        public SelenideElement balanceLeaveCard = $x("//*[@id=\"leaves-webapp\"]");
        public SelenideElement profilePopUpOpenButton = $x("//*[@class=\"profile-menu__employee-name label-02-strong\"]");
        public SelenideElement profilePopUpSignOutButton = $x("//*[@class=\"profile-dropdown__sign-out\"]");
}