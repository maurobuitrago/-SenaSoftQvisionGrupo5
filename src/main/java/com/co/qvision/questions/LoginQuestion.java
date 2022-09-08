package com.co.qvision.questions;

import com.co.qvision.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginQuestion implements Question {
    private final String validTest;

    public LoginQuestion(String validTest) {
        this.validTest = validTest;
    }
    @Override
    public Object answeredBy(Actor actor){
        if (Text.of(HomePage._TEXT_VALID).viewedBy(actor).asString().equals(validTest.toString()))
            return true;
        else
            return false;
    }
    public static LoginQuestion loginvalidtest(String validTest){
        return new LoginQuestion(validTest);
    }
}
