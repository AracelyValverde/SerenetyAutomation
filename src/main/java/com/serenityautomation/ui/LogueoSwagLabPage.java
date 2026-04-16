package com.serenityautomation.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LogueoSwagLabPage {
    public static final Target TXT_USUARIO = Target.the("Ingresa usuario")
            .locatedForAndroid(AppiumBy.androidUIAutomator("new UiSelector().text(\"Username\")"))
            .locatedForIOS(AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"test-Username\"]"));
    public static final Target TXT_CONTRASENA  = Target.the("Ingresar contrasena")
            .locatedForAndroid(AppiumBy.androidUIAutomator("new UiSelector().text(\"Password\")"))
            .locatedForIOS(AppiumBy.xpath("//XCUIElementTypeSecureTextField[@name=\"test-Contraseña\" or @name=\"test-Password\"]"));
    public static final Target BTN_LOGIN = Target.the("boton login")
            .locatedForAndroid(AppiumBy.androidUIAutomator("new UiSelector().text(\"LOGIN\")"))
            .locatedForIOS(AppiumBy.xpath("//XCUIElementTypeOther[@name=\"test-LOGIN\"]"));

    public static final Target BTN_ORDER_BY = Target.the("Filtro ordenar busquedas por")
            .locatedForAndroid(AppiumBy.androidUIAutomator("new UiSelector().description(\"test-Modal Selector Button\")"))
            .locatedForIOS(AppiumBy.xpath("//XCUIElementTypeOther[@name=\"test-Modal Selector Button\"]/XCUIElementTypeOther/XCUIElementTypeOther"));

}
