package com.co.qvision.questions;

import com.co.qvision.userinterfaces.ShoesModulePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AccessShoesModuleQuestion implements Question {
    private final String validText;

    public AccessShoesModuleQuestion(String validText) {

        this.validText = validText;
    }
    @Override
    public Object answeredBy(Actor actor){
        if (Text.of(ShoesModulePage._TEXT_VALID).viewedBy(actor).asString().equals(validText.toString()))
            return true;
        else
            return false;
    }
    public static AccessShoesModuleQuestion accessValidTest(String validText){
        return new AccessShoesModuleQuestion(validText);
    }
}
