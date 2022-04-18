package com.indra.utils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import javafx.scene.input.TouchEvent;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;

public class SwipeTo {

    public static void down(WebDriver facade){
        WebDriver driver = ((WebDriverFacade) facade).getProxiedDriver();

        TouchAction action = new TouchAction((AndroidDriver) driver);
        int pX = (int)(facade.manage().window().getSize().width/2);
        int pY0 = (int)(facade.manage().window().getSize().height*0.6);
        int pY1 = (int)(facade.manage().window().getSize().height*0.6);

        action.press(PointOption.point(pX, pY0));
//        new TouchAction(driver))
//                .press({x: 553, y: 1479})
//                .moveTo({x: 580: y: 410})
//                .release()
//                .perform()
    }
}
