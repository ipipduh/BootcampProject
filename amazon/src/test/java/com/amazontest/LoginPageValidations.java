package com.amazontest;

import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import com.peoplentech.bootcampproject.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase {

    @Test (enabled = false)
    public void validateTheLoginPage(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverHelloSignInOnHomePage();
        homePage.clickOnSignInButton();
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.validateAmazonLoginPageLogo();
    }

    @Test(enabled = false)
    public void validateUserCanLogInWithValidCredentials() {
        validateTheLoginPage();
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.userEntersValidLoginCredentialsAndLogsIn();
    }
}
