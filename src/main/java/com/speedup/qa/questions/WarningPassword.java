package com.speedup.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.speedup.qa.userInterface.ClickOnLabel.WARNING_PASSWORD;

public class WarningPassword implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        actor.attemptsTo(WaitUntil.the(WARNING_PASSWORD, WebElementStateMatchers.isVisible()));
        return Text.of(WARNING_PASSWORD).viewedBy(actor).asString();
    }
    public static WarningPassword WarningPassword(){
        return new WarningPassword();
    }
}
