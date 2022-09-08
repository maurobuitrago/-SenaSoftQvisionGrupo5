package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target _TEXT_VALID = Target.the("Cerrar sesión")
            .located(By.linkText("Cerrar sesión"));
}
