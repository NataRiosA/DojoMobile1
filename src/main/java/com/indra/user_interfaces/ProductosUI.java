package com.indra.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductosUI {

    public static final Target TITULO_SECCION = Target.the("titulo de la seccion")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-Cart drop zone']/android.view.ViewGroup/android.widget.TextView"))
            .locatedForIOS(By.xpath("//foo[]"));

    public static final Target ADDTO_CART = Target.the("agregar producto uno")
            .locatedForAndroid(By.xpath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])[1]"))
            .locatedForIOS(By.xpath("//foo[]"));

    public static final Target ADD_TOCART = Target.the("agregar producto dos")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-ADD TO CART']"))
            .locatedForIOS(By.xpath("//foo[]"));

    public static final Target CART_GROUP = Target.the("verificar carrito")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.view.ViewGroup"))
            .locatedForIOS(By.xpath("//foo[]"));
}
