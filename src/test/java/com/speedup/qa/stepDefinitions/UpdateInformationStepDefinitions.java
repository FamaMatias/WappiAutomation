package com.speedup.qa.stepDefinitions;

import com.speedup.qa.models.UpdateInformation;
import com.speedup.qa.tasks.Update;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class UpdateInformationStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Matias S Fama");
    }

    @When("^user complete personal information$")
    public void user_complete_personal_information(List<UpdateInformation> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Update.withdata(data.get(0)));
    }

    @Then("^user can bring food$")
    public void user_can_bring_food() {
    }

}
