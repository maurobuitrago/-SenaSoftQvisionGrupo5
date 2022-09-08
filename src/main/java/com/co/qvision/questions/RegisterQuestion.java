package com.co.qvision.questions;

import com.co.qvision.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RegisterQuestion implements Question {
    private final String validTest;

    public RegisterQuestion(String validTest) {
        this.validTest = validTest;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if (Text.of(HomePage.TEXT_VALID).viewedBy(actor).asString().equals(validTest.toString()))
        return true;
        else
        return false;
    }
    public static RegisterQuestion registervalidtest (String validTest){
        return new RegisterQuestion(validTest);
    }
}
