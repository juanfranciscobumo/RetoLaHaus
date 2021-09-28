package com.sobreplanosstaging.herokuapp.tasks.front;

import com.sobreplanosstaging.herokuapp.interactions.*;
import com.sobreplanosstaging.herokuapp.models.front.FiltrosModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.sobreplanosstaging.herokuapp.userinterfaces.FiltrosPage.*;

public class FiltraPorLasCualidades implements Task {
    private String estado;
    private String parqueaderos;
    private String bannos;
    private String areaMinima;
    private String areaMaxima;
    private String apartamento;
    private String pais;

    public FiltraPorLasCualidades(FiltrosModel filtro) {
        this.estado = filtro.getEstado();
        this.parqueaderos = filtro.getParqueaderos();
        this.bannos = filtro.getBannos();
        this.areaMaxima = filtro.getAreaMaxima();
        this.areaMinima = filtro.getAreaMinima();
        this.apartamento = filtro.getApartamento();
        this.pais = filtro.getPais();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionaElEstado.deLaPropiedad(estado),
                IngresarNumero.deUnidades(parqueaderos, BTN_INCREMENTAR_PARQUEADERO, TXT_NUMERO_PARQUEADEROS),
                IngresarNumero.deUnidades(bannos, BTN_INCREMENTAR_BANNOS, TXT_NUMERO_BANNOS),
                MoverBarraDerecha.hastaElDato(areaMinima, BARRA_AREA_MINIMA, INPUT_AREA_MINIMA),
                MoverBarraIzquieda.hastaElDato(areaMaxima, BARRA_AREA_MAXIMA, INPUT_AREA_MAXIMA),
                BuscaLaPagina.conLasPropiedades(apartamento),
                Switch.toNewWindow());
    }

    public static FiltraPorLasCualidades deLaPropiedad(FiltrosModel filtro) {
        return Tasks.instrumented(FiltraPorLasCualidades.class, filtro);
    }
}
