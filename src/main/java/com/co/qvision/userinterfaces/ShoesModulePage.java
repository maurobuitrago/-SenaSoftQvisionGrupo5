package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoesModulePage {
    public static final Target _TEXT_VALID = Target.the("existe texto Sandalias")
            .located(By.linkText("Sandalias"));
}
