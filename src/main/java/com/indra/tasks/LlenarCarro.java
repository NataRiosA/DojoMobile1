package com.indra.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class LlenarCarro {

    public static Performable agregarAlCarrito(){
        return Task.where("{0} el usuario agrega productos al carrito",
                Agregar.addToCart()
        );
    }
}
