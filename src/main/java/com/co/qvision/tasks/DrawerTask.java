package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.DrawerPage;
import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DrawerTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(DrawerPage.TEXT_VALID));

    }

    public static Performable drawerView (){
        return instrumented(DrawerTask.class);
    }

}
