package com.speedup.qa.stepDefinitions;

import com.speedup.qa.questions.Login;
import com.speedup.qa.questions.WarningPassword;
import com.speedup.qa.questions.WarningUser;
import com.speedup.qa.tasks.ClickOnLabel;
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

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ValidateFieldsLoginStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Matias S Fama");
    }
    @Given("^that user in the portal$")
    public void that_user_in_the_portal() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }
    @When("^user click in label$")
    public void user_click_in_label() {
        OnStage.theActorInTheSpotlight().wasAbleTo(ClickOnLabel.ClickOnLabel());

    }
    @Then("^he check the warning$")
    public void he_check_the_warning(String User, String Password) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WarningUser.WarningUser(), org.hamcrest.Matchers.is(User)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WarningPassword.WarningPassword(), org.hamcrest.Matchers.is(Password)));

    }
}
