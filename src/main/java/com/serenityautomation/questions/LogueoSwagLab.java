package com.serenityautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.serenityautomation.ui.LogueoSwagLabPage.TXT_USUARIO;

public class LogueoSwagLab implements Question<Boolean> {
    public static LogueoSwagLab veoBotonInicioSesion() {
        return new LogueoSwagLab();
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_USUARIO.isVisibleFor(actor);
    }
}
