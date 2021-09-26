package com.sobreplanosstaging.herokuapp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FiltrosPage {

    public static final Target CHECK_ESTADO = Target.the("Checkbox estado de la propiedad")
            .locatedBy("//div[@class='filters-form']/div[6]/ul/li[contains(text(),'{0}')]/i");

    public static final Target LBL_PRECIO_DESDE_ONE = Target.the("Precio desde uno")
            .located(By.id("12"));

    public static final String ID_PRECIO_ONE = "document.getElementById('12minInputId').value = '%s';";

    public static final Target LBL_PRECIO_HASTA_ONE = Target.the("Precio hasta uno")
            .located(By.id("14"));

    public static final String ID_PRECIO_DOS = "document.getElementById('12maxInputId').value = '%s';";

    public static final Target BTN_INCREMENTAR_PARQUEADERO = Target.the("Botón incrementar parqueadero")
            .locatedBy("//div[@class='filters-form']/div[8]/div[2]/div/button[2]");


    public static final Target TXT_NUMERO_PARQUEADEROS = Target.the("Texto número de parqueaderos")
            .locatedBy("//div[@class='filters-form']/div[8]/div[2]/div/span");

    public static final Target BTN_INCREMENTAR_BANNOS = Target.the("Botón incrementar baños")
            .locatedBy("//div[@class='filters-form']/div[8]/div[3]/div/button[2]");

    public static final Target TXT_NUMERO_BANNOS = Target.the("Texto número de baños")
            .locatedBy("//div[@class='filters-form']/div[8]/div[3]/div/span");

    public static final Target BARRA_AREA_MINIMA = Target.the("Barra area mínima")
            .locatedBy("//div[@class='filters-form']/div[9]/div/div/div/div[2]/div/div[1]");

    public static final Target BARRA_AREA_MAXIMA = Target.the("Barra area máxima")
            .locatedBy("//div[@class='filters-form']/div[9]/div/div/div/div[2]/div/div[2]");

    public static final Target INPUT_AREA_MINIMA = Target.the("Input area mínima")
            .locatedBy("//div[@class='filters-form']/div[9]/div/div/div/div[1]/div[1]/input");

    public static final Target INPUT_AREA_MAXIMA = Target.the("Input area máxima")
            .locatedBy("//div[@class='filters-form']/div[9]/div/div/div/div[1]/div[2]/input");

    public static final Target BTN_APLICAR_PRECIO = Target.the("Botón aplicar precio")
            .locatedBy("//div[@class='filters-form']/div[7]/button");

    public static final Target BTN_INMUEBLE = Target.the("Botón inmueble")
            .locatedBy("//div[@class='client-cards']/article/div/div[2]/p[contains(text(),'${0} millones')]");
}
