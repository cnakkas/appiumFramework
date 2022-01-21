package com.getir.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyWishlistPage extends BasePage{



    @FindBy (id = "com.allandroidprojects.getirsample:id/layout_item_desc")
    public List<MobileElement> wishlistItemList;

    @FindBy (id = "com.allandroidprojects.getirsample:id/ic_wishlist")
    public List<MobileElement> wishlistItemRemoveList;
}
