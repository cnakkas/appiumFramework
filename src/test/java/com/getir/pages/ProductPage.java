package com.getir.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{


    @FindBy (id = "com.allandroidprojects.getirsample:id/text_action_bottom1")
    public MobileElement addToCartButton;
}
