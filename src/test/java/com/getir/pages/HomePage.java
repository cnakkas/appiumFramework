package com.getir.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{



    @FindBy (id = "com.allandroidprojects.getirsample:id/drawer_layout")
    public MobileElement homePageLayout;

    @FindBy( xpath = "//*[@content-desc=\"Baby Care\"]")
    public MobileElement babyCareTab;

    @FindBy( xpath = "//*[@text='SNACKS']")
    public MobileElement snacksTab;

    @FindBy (id = "com.allandroidprojects.getirsample:id/layout_item_desc")
    public MobileElement firstBabyCareProduct;

    @FindBy (xpath = "//android.support.v7.app.ActionBar.Tab[@content-desc]/android.widget.TextView")
    public List<MobileElement> allTabList;

    @FindBy (xpath = "//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")
    public MobileElement menuButton;


}
