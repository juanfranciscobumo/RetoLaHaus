package com.sobreplanosstaging.herokuapp.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
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
        WebElement priceSlider = targetBarra.resolveFor(actor).getElement();
        for (int i = 0; i < priceSlider.getSize().getWidth(); i++) {
            if (targetInput.resolveFor(actor).getValue().equals(datoBuscado)) {
                break;
            } else {
                new Actions(BrowseTheWeb.as(actor).getDriver()).moveToElement(priceSlider)
                        .dragAndDropBy(priceSlider, i, 0)
                        .build()
                        .perform();
            }
        }
    }

    public static MoverBarraDerecha hastaElDato(String datoBuscado, Target targetBarra, Target targetInput) {
        return Tasks.instrumented(MoverBarraDerecha.class, datoBuscado, targetBarra, targetInput);
    }
}
