package com.amazontest;

import com.amazon.pages.AffiliatePage;
import com.amazon.pages.HomePage;
import com.peoplentech.bootcampproject.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AffiliatePageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserCanSeeTheAffiliateLogoOnTheAffiliatePag(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollAndClickOnElement();
        AffiliatePage affiliatePage = PageFactory.initElements(driver, AffiliatePage.class);
        affiliatePage.validateAffiliatePageLogo();
    }
}
