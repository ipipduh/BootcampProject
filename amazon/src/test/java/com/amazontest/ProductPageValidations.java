package com.amazontest;

import com.amazon.pages.ProductPage;
import com.amazon.pages.UserHomePage;
import com.peoplentech.bootcampproject.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ProductPageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserCanSearchForAProduct() {
        UserHomePageValidations userHomePageValidations = PageFactory.initElements(driver, UserHomePageValidations.class);
        userHomePageValidations.validateTheLoginPage();
        UserHomePage userHomePage = PageFactory.initElements(driver, UserHomePage.class);
        userHomePage.userSearchesForItem();
       ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
       productPage.validateProductSearchResults();

    }

    @Test(enabled = false)
    public void validateUserCanAddAProductToShoppingCart() {
        validateUserCanSearchForAProduct();
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        productPage.userClicksOnProductFromSearchResults();
        productPage.validateProductPage();
        productPage.addItemToShoppingCart();
        productPage.validateAddedToCart();
    }
}
