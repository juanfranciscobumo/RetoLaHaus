package com.sobreplanosstaging.herokuapp.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.sobreplanosstaging.herokuapp.userinterfaces.FiltrosPage.CHECK_ESTADO;
import static com.sobreplanosstaging.herokuapp.utils.enums.EstadoPropiedadesEnum.NUEVO;
import static com.sobreplanosstaging.herokuapp.utils.enums.EstadoPropiedadesEnum.USADO;


public class SeleccionaElEstado implements Interaction {

    private String estado;

    public SeleccionaElEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (estado.equals(NUEVO.getAtributo())) {
            actor.attemptsTo(Click.on(CHECK_ESTADO.of(USADO.getAtributo())));
        } else {
            actor.attemptsTo(Click.on(CHECK_ESTADO.of(NUEVO.getAtributo())));
        }

    }

    public static SeleccionaElEstado deLaPropiedad(String estado) {
        return Tasks.instrumented(SeleccionaElEstado.class, estado);
    }
}
