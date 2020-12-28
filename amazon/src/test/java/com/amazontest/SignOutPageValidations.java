package com.amazontest;

import com.amazon.pages.SignOutPage;
import com.amazon.pages.UserHomePage;
import com.peoplentech.bootcampproject.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignOutPageValidations extends TestBase {


    @Test(enabled = false)
    public void validateUserCanSearchForAnItem() {
        LoginPageValidations loginPageValidations = PageFactory.initElements(driver, LoginPageValidations.class);
        loginPageValidations.validateUserCanLogInWithValidCredentials();
       SignOutPage signOutPage = PageFactory.initElements(driver, SignOutPage.class);
       signOutPage.hoverOverAccountAndLists();
       signOutPage.userSignsOutOfAccount();
       signOutPage.validateSignOut();
    }

}
