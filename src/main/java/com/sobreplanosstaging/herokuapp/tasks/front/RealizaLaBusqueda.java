package com.sobreplanosstaging.herokuapp.tasks.front;

import com.sobreplanosstaging.herokuapp.interactions.IngresarNumero;
import com.sobreplanosstaging.herokuapp.models.front.BusquedaModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static com.sobreplanosstaging.herokuapp.userinterfaces.BusquedaPage.*;

public class RealizaLaBusqueda implements Task {
    private String pais;
    private String ciudad;
    private String barrio;
    private String tipo_propiedad;
    private String habitaciones;

    public RealizaLaBusqueda(BusquedaModel busqueda) {
        this.pais = busqueda.getPais();
        this.barrio = busqueda.getBarrio();
        this.ciudad = busqueda.getCiudad();
        this.habitaciones = busqueda.getHabitaciones();
        this.tipo_propiedad = busqueda.getTipo_propiedad();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(MODAL),
                Click.on(BTN_PAIS.of(pais)),
                Enter.theValue(ciudad).into(INPUT_CIUDAD),
                Click.on(LISTA_ZONAS.of(ciudad)),
                Click.on(LISTA_TIPO_PROPIEDAD.of(tipo_propiedad)),
                IngresarNumero.deUnidades(habitaciones, BTN_INCREMENTAR_HABITACIONES, TXT_HABITACIONES),
                Click.on(BTN_BUSCAR));


    }

    public static RealizaLaBusqueda deLaPropiedad(BusquedaModel busqueda) {
        return Tasks.instrumented(RealizaLaBusqueda.class, busqueda);
    }
}
