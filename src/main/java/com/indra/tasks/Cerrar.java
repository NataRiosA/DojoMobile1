package com.indra.tasks;

import com.indra.user_interfaces.LogOutUI;
import com.indra.user_interfaces.LoginUI;
import com.indra.user_interfaces.ProductosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

public class Cerrar implements Task {

    @Step("{0} el usuario cierra cesion")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LogOutUI.MENU.waitingForNoMoreThan(Duration.ofSeconds(5))),
                Click.on(LogOutUI.LOGOUT.waitingForNoMoreThan(Duration.ofSeconds(5))),
                Ensure.that(LogOutUI.USER.waitingForNoMoreThan(Duration.ofSeconds(20))).isDisplayed()
        );
    }

    public static Cerrar logout(){
        return Tasks.instrumented(Cerrar.class);
    }
}
