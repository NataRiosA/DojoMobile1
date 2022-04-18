package com.indra.tasks;

import com.indra.user_interfaces.ProductosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.thucydides.core.annotations.Step;
import java.time.Duration;

public class Agregar implements Task {

    @Step("{0} el usuario agrega productos al carrito")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductosUI.ADDTO_CART.waitingForNoMoreThan(Duration.ofSeconds(5))),
                Click.on(ProductosUI.ADD_TOCART.waitingForNoMoreThan(Duration.ofSeconds(5)))
        );
    }

    public static Agregar addToCart(){
        return Tasks.instrumented(Agregar.class);
    }
}
