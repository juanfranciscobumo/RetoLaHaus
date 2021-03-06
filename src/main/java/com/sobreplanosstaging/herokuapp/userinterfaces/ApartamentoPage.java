package com.sobreplanosstaging.herokuapp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ApartamentoPage {
    private ApartamentoPage() {

    }

    public static final Target TXT_HABITACIONES = Target.the("Texto n?mero de habitaciones")
            .locatedBy("/html/body/main/div/div[10]/div/div[1]/section[1]/div[2]/p");

    public static final Target TXT_BANNOS = Target.the("Texto n?mero de ba?os")
            .locatedBy("/html/body/main/div/div[10]/div/div[1]/section[1]/div[3]/p");

    public static final Target TXT_PARQUEADEROS = Target.the("Texto n?mero de parqueaderos")
            .locatedBy("/html/body/main/div/div[10]/div/div[1]/section[1]/div[4]/p");

    public static final Target TXT_PROYECTO = Target.the("Texto nombre del proyecto")
            .locatedBy("/html/body/main/div/section[1]/h1");

}
