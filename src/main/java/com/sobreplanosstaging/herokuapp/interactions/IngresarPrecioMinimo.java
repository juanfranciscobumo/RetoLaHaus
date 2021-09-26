package com.sobreplanosstaging.herokuapp.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Evaluate;
import net.serenitybdd.screenplay.targets.Target;

import static com.sobreplanosstaging.herokuapp.userinterfaces.FiltrosPage.ID_PRECIO_ONE;
import static com.sobreplanosstaging.herokuapp.utils.enums.TagsEnum.MEXICO;


public class IngresarPrecioMinimo implements Interaction {

    private String precio;
    private Target target;
    private String pais;

    public IngresarPrecioMinimo(String precio, Target target, String pais) {
        this.precio = precio;
        this.target = target;
        this.pais = pais;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (target.resolveFor(actor).isClickable()) {
            actor.attemptsTo(Enter.theValue(precio).into(target));
        } else {
            if (pais.equals(MEXICO.getAtributo())) {
                actor.attemptsTo(Evaluate.javascript(String.format(ID_PRECIO_ONE, precio.substring(0, 1))));
            } else {
                actor.attemptsTo(Evaluate.javascript(String.format(ID_PRECIO_ONE, precio.substring(0, 3))));
            }
        }
    }

    public static IngresarPrecioMinimo delInmueble(String precio, Target target, String pais) {
        return Tasks.instrumented(IngresarPrecioMinimo.class, precio, target, pais);
    }
}
