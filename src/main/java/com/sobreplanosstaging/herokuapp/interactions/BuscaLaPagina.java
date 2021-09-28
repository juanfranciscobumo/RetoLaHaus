package com.sobreplanosstaging.herokuapp.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static com.sobreplanosstaging.herokuapp.userinterfaces.FiltrosPage.*;

public class BuscaLaPagina implements Interaction {

    private String apartamento;

    public BuscaLaPagina(String apartamento) {
        this.apartamento = apartamento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<String> propiedades = Text.of(TXT_TOTAL_REGISTROS_PAGINA).viewedBy(actor).asList();
        while (true) {
            if (propiedades.size() <= Integer.parseInt(TXT_TOTAL_REGISTROS.resolveFor(actor).getText().split(" ")[0])) {
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
