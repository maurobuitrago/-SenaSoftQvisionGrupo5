package com.co.qvision.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {

    public static final Target INPUT_USER_IDNUMBER = Target.the("Ingresa la cédula").located(By.id("reg_username"));
    public static final Target INPUT_EMAIL = Target.the("Ingresa el correo").located(By.id("reg_email"));

    public static final Target INPUT_PASSWORD = Target.the("Ingresa la contraseña").located(By.id("reg_password"));

    public static final Target INPUT_TRATAMIENTO = Target.the("Aceptar políticas").located(By.id("privacy_policy_reg"));

    public static final Target INPUT_USER_REGISTER = Target.the("Botón registrarse").located(By.name("register"));

}
