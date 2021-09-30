package com.sobreplanosstaging.herokuapp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FiltrosPage {
    private FiltrosPage() {

    }

    public static final Target CHECK_ESTADO = Target.the("Checkbox estado de la propiedad")
            .locatedBy("//div[@class='filters-form']/div[6]/ul/li[contains(text(),'{0}')]/i");

    public static final Target CHECK_ESTADO_PROYECTO = Target.the("Checkbox estado de la propiedad")
            .locatedBy("//div[@class='filters-form']/div[5]/ul/li[contains(text(),'{0}')]/i");

    public static final String ID_PRECIO_ONE = "document.getElementById('12minInputId').value = '%s';";

    public static final String ID_PRECIO_DOS = "document.getElementById('12maxInputId').value = '%s';";

    public static final Target BTN_INCREMENTAR_PARQUEADERO = Target.the("Bot�n incrementar parqueadero")
            .locatedBy("//div[@class='filters-form']/div[8]/div[2]/div/button[2]");

    public static final Target TXT_NUMERO_PARQUEADEROS = Target.the("Texto n�mero de parqueaderos")
            .locatedBy("//div[@class='filters-form']/div[8]/div[2]/div/span");

    public static final Target BTN_INCREMENTAR_BANNOS = Target.the("Bot�n incrementar ba�os")
            .locatedBy("//div[@class='filters-form']/div[8]/div[3]/div/button[2]");

    public static final Target TXT_NUMERO_BANNOS = Target.the("Texto n�mero de ba�os")
            .locatedBy("//div[@class='filters-form']/div[8]/div[3]/div/span");

    public static final Target BARRA_AREA_MINIMA = Target.the("Barra area m�nima")
            .locatedBy("//div[@class='filters-form']/div[9]/div/div/div/div[2]/div/div[1]");

    public static final Target BARRA_AREA_MAXIMA = Target.the("Barra area m�xima")
            .locatedBy("//div[@class='filters-form']/div[9]/div/div/div/div[2]/div/div[2]");

    public static final Target INPUT_AREA_MINIMA = Target.the("Input area m�nima")
            .locatedBy("//div[@class='filters-form']/div[9]/div/div/div/div[1]/div[1]/input");

    public static final Target INPUT_AREA_MAXIMA = Target.the("Input area m�xima")
            .locatedBy("//div[@class='filters-form']/div[9]/div/div/div/div[1]/div[2]/input");

    public static final Target BTN_INMUEBLE = Target.the("Bot�n inmueble")
            .locatedBy("//div[@class='client-cards' or 'server-cards']/article/div/div[2]/h3/a[contains(text(),'{0}')]");

    public static final Target TXT_TOTAL_REGISTROS = Target.the("Total de registros")
            .locatedBy("//*[@id='srp-app']/div[1]/div[3]/div[2]/div[1]/h1/span");

    public static final Target TXT_TOTAL_REGISTROS_PAGINA = Target.the("Total de registros por p�gina")
            .locatedBy("//div[@class='client-cards']/article");

    public static final Target BTN_AVANZAR_PAGINA = Target.the("Bot�n siguiente p�gina")
            .locatedBy("//li[@class='transform -rotate-90']");

}
