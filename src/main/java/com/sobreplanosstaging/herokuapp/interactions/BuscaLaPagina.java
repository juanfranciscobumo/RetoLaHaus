package com.sobreplanosstaging.herokuapp.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static com.sobreplanosstaging.herokuapp.userinterfaces.FiltrosPage.*;

public class BuscaLaPagina implements Interaction {

    private String precio;

    public BuscaLaPagina(String precio) {
        this.precio = precio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> propiedades = Text.of(TXT_TOTAL_REGISTROS_PAGINA).viewedBy(actor).asList();
        int total = Integer.parseInt(TXT_TOTAL_REGISTROS.resolveFor(actor).getText().split(" ")[0]);
        while (true) {
            if (propiedades.size() <= total) {
                if (BTN_INMUEBLE.of(precio).resolveFor(actor).isClickable()) {
                    actor.attemptsTo(Click.on(BTN_INMUEBLE.of(precio)));
                    break;
                } else {
                    actor.attemptsTo(Click.on(BTN_AVANZAR_PAGINA));
                }
            }
        }
    }

    public static BuscaLaPagina conLasPropiedades(String precio) {
        return Tasks.instrumented(BuscaLaPagina.class, precio);
    }
}
