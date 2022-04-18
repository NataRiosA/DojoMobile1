package com.indra.tasks;

import com.indra.user_interfaces.LoginUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Iniciar {

    public static Performable sesionConLasCredenciales(String user, String password){
        return Task.where("{0} inicia sesion con sus credenciales #user",
                Llenar.elFormularioDeLogin(user, password),
                Click.on(LoginUI.LOGIN)
                );
    }
}
