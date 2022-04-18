package com.indra.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class CerrarCesion {

    public static Performable logout(){
        return Task.where("{0} el usuario cierra cesion",
                Cerrar.logout()
        );
    }
}

