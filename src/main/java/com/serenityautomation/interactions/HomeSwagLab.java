package com.serenityautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.serenityautomation.ui.LogueoSwagLabPage.BTN_ORDER_BY;

public class HomeSwagLab implements Question<Boolean> {
    public static HomeSwagLab esVisible() {
        return new HomeSwagLab();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_ORDER_BY.isVisibleFor(actor);
    }
}
