package com.co.qvision.questions;

import com.co.qvision.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class DrawerQuestion implements Question {
    private final String validText;

    public DrawerQuestion(String validText) {
        this.validText = validText;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if (Text.of(HomePage.TEXT_DRAWER_VALID).viewedBy(actor).asString().equals(validText.toString()))
        return true;
        else
        return false;
    }
    public static DrawerQuestion drawervalidtext (String validText){
        return new DrawerQuestion(validText);
    }
}
