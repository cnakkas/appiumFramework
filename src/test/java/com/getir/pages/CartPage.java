package com.getir.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{


    @FindBy(id = "com.allandroidprojects.getirsample:id/layout_item_desc")
    public List<MobileElement> cartItemList;

    @FindBy(id = "com.allandroidprojects.getirsample:id/layout_action1")
    public List<MobileElement> cartDeleteItemList;

    @FindBy(id = "com.allandroidprojects.getirsample:id/text_action_bottom1")
    public MobileElement cartTotalAmount;

}
