package com.speedup.qa.stepDefinitions;

import com.speedup.qa.models.CredentialData;
import com.speedup.qa.questions.Login;
import com.speedup.qa.tasks.LoginUser;
import com.speedup.qa.tasks.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginProfileStepDefinitions {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Matias S Fama");
    }

    @Given("^that user in in the portal$")
    public void that_user_in_in_the_portal() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^user complete the information to login$")
    public void user_complete_the_information_to_login(List<CredentialData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.withdata(data.get(0)));

    }
    @Then("^he see (.*)$")
    public void he_see(String nameUser) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Login.message(), org.hamcrest.Matchers.is(nameUser)));
    }

}
