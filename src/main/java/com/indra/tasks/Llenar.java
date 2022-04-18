package com.indra.tasks;

import com.indra.user_interfaces.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

public class Llenar implements Task {

    private String user;
    private String password;

    public Llenar(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Step("{0} ingresa las credenciales del usuario #usuario")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(LoginUI.USERNAME.waitingForNoMoreThan(Duration.ofSeconds(15))),
                Enter.theValue(password).into(LoginUI.PASSWORD)
        );
    }

    public static Llenar elFormularioDeLogin(String user, String password){
        return Tasks.instrumented(Llenar.class,user,password);
    }
}
