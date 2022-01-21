package com.getir.step_definitions;

import com.getir.pages.HomePage;
import com.getir.pages.MyWishlistPage;
import com.getir.pages.SnacksPage;
import com.getir.utilities.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class Case2StepDefs {

    TouchAction action = new TouchAction(Driver.getDriver());
    HomePage homePage = new HomePage();
    SnacksPage snacksPage = new SnacksPage();
    MyWishlistPage myWishlistPage = new MyWishlistPage();

    @When("User gets the number of categories and write this number to console")
    public void user_gets_the_number_of_categories_and_write_this_number_to_console() {
        List<String> listOfStr = new ArrayList<>();
        for (int i = 0; i < homePage.allTabList.size(); i++) {
            listOfStr.add(homePage.allTabList.get(i).getText());
            if (listOfStr.size() == 4) {
                action.longPress(PointOption.point(1000, 300)).moveTo(PointOption.point(100, 300)).release().waitAction().perform();
                listOfStr.add(homePage.allTabList.get(i).getText());
            }
        }
        System.out.println("Total Tab Number = " + listOfStr.size());
    }

    @When("User open a random category")
    public void user_open_a_random_category() {
        action.longPress(PointOption.point(300, 300)).moveTo(PointOption.point(1000, 300)).release().waitAction().perform();
        homePage.snacksTab.click();
    }

    @When("User adds {int} random products to wishlist via mini heart icon")
    public void user_adds_random_products_to_wishlist_via_mini_heart_icon(Integer int1) {
        for (int i = 0; i < snacksPage.listOfWishlistItems.size() - 1; i++) {
            snacksPage.listOfWishlistItems.get(i).click();
        }
    }

    @When("User opens the menu in the left")
    public void user_opens_the_menu_in_the_left() {
        homePage.menuButton.click();
    }

    @When("User go to {string}")
    public void userGoTo(String menuItem) {
        String path = "//*[@text='"+menuItem+"']";
        Driver.getDriver().findElement(By.xpath(path)).click();
    }

    @Then("User controls the page and products")
    public void user_controls_the_page_and_products() {
        int totalWishlistItem = myWishlistPage.wishlistItemList.size();
        Assert.assertEquals(3, totalWishlistItem);
    }

    @Then("User deletes all of them from Wishlist")
    public void user_deletes_all_of_them_from_wishlist() {
        int size = myWishlistPage.wishlistItemRemoveList.size();
        int dummyCount =0;
        for (int i = 0; i < size; i++) {
            myWishlistPage.wishlistItemRemoveList.get(0).click();
            dummyCount++;
        }
        size=size-dummyCount;
        Assert.assertEquals(0,size);
        Driver.tearDown();
    }

}
