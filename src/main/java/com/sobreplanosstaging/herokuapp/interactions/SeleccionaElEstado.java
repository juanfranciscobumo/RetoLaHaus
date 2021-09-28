package com.sobreplanosstaging.herokuapp.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.sobreplanosstaging.herokuapp.userinterfaces.FiltrosPage.CHECK_ESTADO;
import static com.sobreplanosstaging.herokuapp.userinterfaces.FiltrosPage.CHECK_ESTADO_PROYECTO;
import static com.sobreplanosstaging.herokuapp.utils.enums.EstadoPropiedadesEnum.*;


public class SeleccionaElEstado implements Interaction {

    private String estado;

    public SeleccionaElEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (estado) {
            case "Nuevo":
                actor.attemptsTo(Click.on(CHECK_ESTADO.of(USADO.getAtributo())));
                break;
            case "Usado":
                actor.attemptsTo(Click.on(CHECK_ESTADO.of(NUEVO.getAtributo())));
                break;
            case "En construcción":
            case "Finalizado":
                actor.attemptsTo(Click.on(CHECK_ESTADO_PROYECTO.of(estado)));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + estado);
        }
    }

    public static SeleccionaElEstado deLaPropiedad(String estado) {
        return Tasks.instrumented(SeleccionaElEstado.class, estado);
    }
}
