package com.speedup.qa.stepDefinitions;


import com.speedup.qa.tasks.MyOrder;
import com.speedup.qa.tasks.Order;
import com.speedup.qa.tasks.OrderInList;
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

public class OrderInMyOrderStepDefinition {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Matias S Fama");
    }
    @When("^user select my order$")
    public void user_select_my_order() {
        OnStage.theActorInTheSpotlight().attemptsTo(MyOrder.myOrder());

    }
    @Then("he can see the order in the list product$")
    public void he_can_see_the_order_in_the_list_product(){
        OnStage.theActorInTheSpotlight().attemptsTo(OrderInList.OrderInList());
    }
}
