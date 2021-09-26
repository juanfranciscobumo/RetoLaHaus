package com.sobreplanosstaging.herokuapp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaPage {

    public static final Target MODAL = Target.the("Modal país")
            .locatedBy("//ul[@class='subnav-links']");

    public static final Target BTN_PAIS = Target.the("Botón país")
            .locatedBy("//div[.='{0}']");

    public static final Target INPUT_CIUDAD = Target.the("Campo ingresar ciudad")
            .locatedBy("//div[@id='live-search']//input");

    public static final Target LISTA_CIUDADES = Target.the("Lista ciudades ciudad")
            .locatedBy("//div[.='{0}']");

    public static final Target LISTA_TIPO_PROPIEDAD = Target.the("Lista tipo de propiedad")
            .locatedBy("//li[@data-value='{0}']");

    public static final Target BTN_INCREMENTAR_HABITACIONES = Target.the("Botón incrementar habitaciones")
            .locatedBy("//div[@id='rooms-number-field-container']/div/div/div[2]/a[2]");

    public static final Target TXT_HABITACIONES = Target.the("Texto número de habitaciones")
            .locatedBy("//div[@id='rooms-number-field-container']/div/div/div[2]/div");

    public static final Target BTN_BUSCAR = Target.the("Botón buscar")
            .locatedBy("//*[@id='lh-home-v2']/section[1]/div/div[1]/form/div/div[4]/button");

}
