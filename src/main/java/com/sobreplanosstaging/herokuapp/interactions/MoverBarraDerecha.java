package com.sobreplanosstaging.herokuapp.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.interactions.Actions;

public class MoverBarraDerecha implements Interaction {
    private String datoBuscado;
    private Target targetBarra;
    private Target targetInput;

    public MoverBarraDerecha(String datoBuscado, Target targetBarra, Target targetInput) {
        this.datoBuscado = datoBuscado;
        this.targetBarra = targetBarra;
        this.targetInput = targetInput;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(targetInput));
        for (int i = 0; i < 150; i++) {
            if (targetInput.resolveFor(actor).getValue().equals(datoBuscado)) {
                break;
            } else {
                new Actions(BrowseTheWeb.as(actor).getDriver())
                        .dragAndDropBy(targetBarra.resolveFor(actor), 2, 0)
                        .build()
                        .perform();
            }
        }
    }

    public static MoverBarraDerecha hastaElDato(String datoBuscado, Target targetBarra, Target targetInput) {
        return Tasks.instrumented(MoverBarraDerecha.class, datoBuscado, targetBarra, targetInput);
    }
}
