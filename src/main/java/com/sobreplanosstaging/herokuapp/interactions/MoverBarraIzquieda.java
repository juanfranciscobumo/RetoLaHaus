package com.sobreplanosstaging.herokuapp.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoverBarraIzquieda implements Interaction {
    private String datoBuscado;
    private Target targetBarra;
    private Target targetInput;

    public MoverBarraIzquieda(String datoBuscado, Target targetBarra, Target targetInput) {
        this.datoBuscado = datoBuscado;
        this.targetBarra = targetBarra;
        this.targetInput = targetInput;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement priceSlider = targetBarra.resolveFor(actor).getElement();
        for (int i = priceSlider.getSize().getWidth(); i >= 0; i--) {
            if (targetInput.resolveFor(actor).getValue().equals(datoBuscado)) {
                break;
            } else {
                new Actions(BrowseTheWeb.as(actor).getDriver()).moveToElement(priceSlider)
                        .click()
                        .dragAndDropBy(priceSlider, -i, 0)
                        .build()
                        .perform();
            }
        }
    }

    public static MoverBarraIzquieda hastaElDato(String datoBuscado, Target targetBarra, Target targetInput) {
        return Tasks.instrumented(MoverBarraIzquieda.class, datoBuscado, targetBarra, targetInput);
    }
}
