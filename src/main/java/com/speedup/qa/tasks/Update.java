package com.speedup.qa.tasks;

import com.speedup.qa.models.UpdateInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import org.openqa.selenium.WebDriver;

import java.io.File;

import static com.speedup.qa.userInterface.UpdateInfomation.*;


public class Update implements Task {

    WebDriver driver;
    private UpdateInformation updateInformation;
    public Update(UpdateInformation updateInformation) {this.updateInformation = updateInformation;}
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(PERSONAL_INFORMATION));
       // actor.attemptsTo(Enter.theValue().into(CHOSE_FILE));
        actor.attemptsTo(Enter.theValue(updateInformation.getFirstName()).into(FIRST_NAME));
        actor.attemptsTo(Enter.theValue(updateInformation.getLastName()).into(LAST_NAME));
        actor.attemptsTo(Enter.theValue(updateInformation.getBirth()).into(BIRTH));
        actor.attemptsTo(Click.on(SELECT_NATIONALITY));
        actor.attemptsTo(Click.on(NATIONALITY));
        actor.attemptsTo(Click.on(SAVE));


    }
    public static Performable withdata(UpdateInformation updateInformation){

        return new Update(updateInformation);
    }

}
