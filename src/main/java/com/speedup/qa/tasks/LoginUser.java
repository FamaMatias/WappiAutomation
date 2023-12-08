package com.speedup.qa.tasks;

import com.speedup.qa.models.CredentialData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userInterface.Login.*;

public class LoginUser implements Task {
    private CredentialData credentialData;
    public LoginUser(CredentialData credentialData){
        this.credentialData = credentialData;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentialData.getUser()).into(USER_NAME));
        actor.attemptsTo(Enter.theValue(credentialData.getPassword()).into(USER_PASSWORD));
        actor.attemptsTo(Click.on(LOGIN_OK));
    }

    public static Performable withdata(CredentialData credentialData){

        return new LoginUser(credentialData);
    }
}
