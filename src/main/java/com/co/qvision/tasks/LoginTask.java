package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    private final String idNumber;
    private final String password;

    public LoginTask(String idNumber, String password) {
        this.idNumber = idNumber;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(idNumber).into(LoginPage._INPUT_IDNUMBER));
        actor.attemptsTo(Enter.theValue(password).into(LoginPage._INPUT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage._BUTTON_LOGIN));
    }
    public static Performable login(String idNumber, String password){
        return instrumented(LoginTask.class, idNumber ,password);
    }
}
