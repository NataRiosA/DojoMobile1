package com.indra.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogOutUI {

    public static final Target MENU = Target.the("menu")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-Menu']/android.view.ViewGroup/android.widget.ImageView"))
            .locatedForIOS(By.xpath("//foo[]"));

    public static final Target LOGOUT = Target.the("se cierra cesion")
            .locatedForAndroid(By.xpath("(//android.widget.TextView[@content-desc='test-Price'])[1]"))
            .locatedForIOS(By.xpath("//foo[]"));

    public static final Target USER = Target.the("usuario")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@content-desc='test-Username']"))
            .locatedForIOS(By.xpath("//foo[]"));
}
