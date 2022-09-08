package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccessShoesModulePage {
    public static final Target _BUTTON_MODULE_SHOES = Target.the("zapatos")
            .located(By.linkText("Zapatos"));
}