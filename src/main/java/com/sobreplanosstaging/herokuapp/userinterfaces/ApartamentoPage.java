package com.sobreplanosstaging.herokuapp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ApartamentoPage {
    private ApartamentoPage(){

    }

    public static final Target TXT_HABITACIONES = Target.the("Texto número de habitaciones")
            .locatedBy("/html/body/main/div/div[10]/div/div[1]/section[1]/div[2]/p");

    public static final Target TXT_BANNOS = Target.the("Texto número de baños")
            .locatedBy("/html/body/main/div/div[10]/div/div[1]/section[1]/div[3]/p");

    public static final Target TXT_PARQUEADEROS = Target.the("Texto número de parqueaderos")
            .locatedBy("/html/body/main/div/div[10]/div/div[1]/section[1]/div[4]/p");

    public static final Target TXT_PRECIO_INMUEBLE = Target.the("Texto precio del inmueble")
            .locatedBy("//*[@id='pdp-info-box-form']/div/div[1]/p[2]");

}
