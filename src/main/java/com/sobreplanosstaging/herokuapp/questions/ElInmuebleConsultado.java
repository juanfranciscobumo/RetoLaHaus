package com.sobreplanosstaging.herokuapp.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.sobreplanosstaging.herokuapp.userinterfaces.ApartamentoPage.*;

public class ElInmuebleConsultado {
    private ElInmuebleConsultado() {

    }

    public static Question<String> conHabitacionesEs() {
        return actor -> Text.of(TXT_HABITACIONES).viewedBy(actor).asString();
    }

    public static Question<String> conParqueaderosEs() {
        return actor -> Text.of(TXT_PARQUEADEROS).viewedBy(actor).asString();
    }

    public static Question<String> conBannosEs() {
        return actor -> Text.of(TXT_BANNOS).viewedBy(actor).asString();
    }

    public static Question<String> conPrecioEs() {
        return actor -> Text.of(TXT_PRECIO_INMUEBLE).viewedBy(actor).asString().replace("$", "").split(" ")[0];
    }
}
