package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target _INPUT_IDNUMBER = Target.the("ingrese el documento")
            .located(By.id("username"));
    public static final Target _INPUT_PASSWORD = Target.the("ingrese la contraseña")
            .located(By.id("password"));
    public static final Target _BUTTON_LOGIN = Target.the("presiona boton de login")
            .located(By.className("woocommerce-Button"));
}

