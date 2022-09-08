package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.AccessShoesModulePage;
import com.co.qvision.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccessShoesModuleTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(AccessShoesModulePage._BUTTON_MODULE_SHOES));
    }
    public static Performable access(){
        return instrumented(AccessShoesModuleTask.class);
    }
}
