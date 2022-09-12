package com.speedup.qa.stepDefinitions;


import com.speedup.qa.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ValidateOrderStepDefinition{
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Matias S Fama");
    }

    @When("^user select product$")
    public void user_select_product() {
        OnStage.theActorInTheSpotlight().attemptsTo(Order.Order());
    }

    @Then("^he can see all description$")
    public void he_can_see_all_description() {
        OnStage.theActorInTheSpotlight().attemptsTo(OrderOk.OrderOk());
 //me falta ver la confirmacion de la lista
    }

}
