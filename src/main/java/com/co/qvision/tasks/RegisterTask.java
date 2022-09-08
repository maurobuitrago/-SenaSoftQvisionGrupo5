package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.seleniumhq.jetty9.util.security.Password;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterTask implements Task {
private final String idNumber;
private final String email;
private final String password;

    public RegisterTask(String idNumber, String email, String password) {
        this.idNumber = idNumber;
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(idNumber).into(RegisterPage.INPUT_USER_IDNUMBER ));
        actor.attemptsTo(Enter.theValue(email).into(RegisterPage.INPUT_EMAIL ));
        actor.attemptsTo(Enter.theValue(password).into(RegisterPage.INPUT_PASSWORD));
        actor.attemptsTo(Scroll.to(RegisterPage.INPUT_PASSWORD));
        actor.attemptsTo(Click.on(RegisterPage.INPUT_TRATAMIENTO));
        actor.attemptsTo(Click.on(RegisterPage.INPUT_USER_REGISTER));
    }
    public static Performable registroUsuario(String idNumber, String email, String password){
        return instrumented(RegisterTask.class,idNumber,email,password);
    }
}
