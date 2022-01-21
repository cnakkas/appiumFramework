package com.getir.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SnacksPage extends BasePage{


    @FindBy (id = "com.allandroidprojects.getirsample:id/ic_wishlist")
    public List<MobileElement> listOfWishlistItems;
}
