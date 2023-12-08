package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userInterface.OrderInList.ORDER_IN_LIST;

public class OrderInList implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ORDER_IN_LIST));
    }
    public static OrderInList OrderInList() {return Tasks.instrumented(OrderInList.class);}
}
