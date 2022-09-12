package com.speedup.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.speedup.qa.userInterface.ClickOnLabel.WARNING_USER;


public class WarningUser implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(WARNING_USER, WebElementStateMatchers.isVisible()));
        return Text.of(WARNING_USER).viewedBy(actor).asString();
    }
    public static WarningUser WarningUser(){
        return new WarningUser();
    }

}
