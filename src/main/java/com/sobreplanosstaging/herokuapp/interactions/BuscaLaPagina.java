package com.sobreplanosstaging.herokuapp.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static com.sobreplanosstaging.herokuapp.userinterfaces.FiltrosPage.*;

public class BuscaLaPagina implements Interaction {

    private String apartamento;

    public BuscaLaPagina(String apartamento) {
        this.apartamento = apartamento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaElementos =TXT_TOTAL_REGISTROS_PAGINA.resolveAllFor(actor);
        while (true) {
            if (listaElementos.size() <= Integer.parseInt(TXT_TOTAL_REGISTROS.resolveFor(actor).getText().split(" ")[0])) {
                if (BTN_INMUEBLE.of(apartamento).resolveFor(actor).isClickable()) {
                    actor.attemptsTo(Click.on(BTN_INMUEBLE.of(apartamento)));
                    break;
                } else {
                    actor.attemptsTo(Click.on(BTN_AVANZAR_PAGINA));
                }
            }
        }
    }

    public static BuscaLaPagina conLasPropiedades(String apartamento) {
        return Tasks.instrumented(BuscaLaPagina.class, apartamento);
    }
}
