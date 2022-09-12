package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userInterface.ClickOnLabel.USER_NAME;
import static com.speedup.qa.userInterface.ClickOnLabel.USER_PASSWORD;



public class ClickOnLabel implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(USER_NAME));
        actor.attemptsTo(Click.on(USER_PASSWORD));
        actor.attemptsTo(Click.on(USER_NAME));
    }
    public static ClickOnLabel ClickOnLabel(){
        return Tasks.instrumented(ClickOnLabel.class);
    }
}
