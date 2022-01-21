package com.getir.step_definitions;

import com.getir.pages.BasePage;
import com.getir.pages.CartPage;
import com.getir.pages.HomePage;
import com.getir.pages.ProductPage;
import com.getir.utilities.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Case1StepDefs {

    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    BasePage basePage = new BasePage();
    CartPage cartPage = new CartPage();
    TouchAction action = new TouchAction(Driver.getDriver());

    @Given("User should pass onboarding screens")
    public void user_should_pass_onboarding_screens() throws InterruptedException {

        Thread.sleep(3000);
        basePage.skipButton.click();
    }

    @Then("User checks if home page exists or not")
    public void user_checks_if_home_page_exists_or_not() {
        Assert.assertTrue(homePage.homePageLayout.isDisplayed());
    }

    @When("User changes category to ‘Baby Care’")
    public void user_changes_category_to_baby_care() {
        action.longPress(PointOption.point(1000,300)).moveTo(PointOption.point(100,300)).release().waitAction().perform();
        homePage.babyCareTab.click();
    }

    @When("User open a random product detail")
    public void user_open_a_random_product_detail() {
        homePage.firstBabyCareProduct.click();
    }

    @When("User adds this product to basket and return last page")
    public void user_adds_this_product_to_basket_and_return_last_page() throws InterruptedException {
        productPage.addToCartButton.click();
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);
    }

    @When("User changes category to ‘Snacks’")
    public void user_changes_category_to_snacks() {
        action.longPress(PointOption.point(300,300)).moveTo(PointOption.point(1000,300)).release().waitAction().perform();
        homePage.snacksTab.click();
    }

    @Then("User goes to basket and control added products and prices")
    public void user_goes_to_basket_and_control_added_products_and_prices() {
        basePage.goToCartButton.click();
        int size = cartPage.cartItemList.size();
        System.out.println(size+ " item added to cart!");
        Assert.assertTrue(size>0);
        System.out.println("Total Cart Amount After Items Added = " + cartPage.cartTotalAmount.getText());

    }

    @Then("User should deletes all products from basket and makes controls")
    public void user_should_deletes_all_products_from_basket_and_makes_controls() {
        int size = cartPage.cartItemList.size();
        for (int i = 0; i < size; i++) {
             cartPage.cartDeleteItemList.get(0).click();
        }
        System.out.println("Total Cart Amount After Items Deleted  = " + cartPage.cartTotalAmount.getText());
        Driver.tearDown();
    }
}
