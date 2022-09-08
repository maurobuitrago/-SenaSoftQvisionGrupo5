package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target TEXT_VALID = Target.the("Cerrar sesión").located(By.linkText("Cerrar sesión"));
    public static final Target TEXT_DRAWER_VALID = Target.the("Drawer").located(By.linkText("Bonos de regalo"));
}
