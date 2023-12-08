package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userInterface.NavMyOrder.MY_ORDER;

public class MyOrder implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MY_ORDER));
    }
    public static MyOrder myOrder(){
        return Tasks.instrumented(MyOrder.class);
    }
}
