package com.getir.pages;

import com.getir.utilities.Driver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@text='SKIP']")
    public MobileElement skipButton;

    @FindBy(id = "com.allandroidprojects.getirsample:id/action_cart")
    public MobileElement goToCartButton;


}

