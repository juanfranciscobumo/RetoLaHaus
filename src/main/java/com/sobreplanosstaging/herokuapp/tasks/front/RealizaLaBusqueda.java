package com.sobreplanosstaging.herokuapp.tasks.front;

import com.sobreplanosstaging.herokuapp.interactions.IngresarNumero;
import com.sobreplanosstaging.herokuapp.models.front.BusquedaModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.sobreplanosstaging.herokuapp.userinterfaces.BusquedaPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RealizaLaBusqueda implements Task {
    private String pais;
    private String tipoPropiedad;
    private String habitaciones;
    private String barrio;

    public RealizaLaBusqueda(BusquedaModel busqueda) {
        this.pais = busqueda.getPais();
        this.barrio=busqueda.getBarrio();
        this.habitaciones = busqueda.getHabitaciones();
        this.tipoPropiedad = busqueda.getTipoPropiedad();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(MODAL),
                Click.on(BTN_PAIS.of(pais)),
                Enter.theValue(barrio).into(INPUT_CIUDAD),
                WaitUntil.the(LISTA_ZONAS.of(barrio), isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LISTA_ZONAS.of(barrio)),
                Click.on(LISTA_TIPO_PROPIEDAD.of(tipoPropiedad)),
                IngresarNumero.deUnidades(habitaciones, BTN_INCREMENTAR_HABITACIONES, TXT_HABITACIONES),
                Click.on(BTN_BUSCAR));
    }

    public static RealizaLaBusqueda deLaPropiedad(BusquedaModel busqueda) {
        return Tasks.instrumented(RealizaLaBusqueda.class, busqueda);
    }
}
