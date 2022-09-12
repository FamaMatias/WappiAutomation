package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userInterface.OrderOk.CLOSE_POPUP;
import static com.speedup.qa.userInterface.OrderOk.ORDER_OK;

public class OrderOk implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ORDER_OK));
        actor.attemptsTo(Click.on(CLOSE_POPUP));
    }
    public static OrderOk OrderOk(){return Tasks.instrumented(OrderOk.class);}
}
