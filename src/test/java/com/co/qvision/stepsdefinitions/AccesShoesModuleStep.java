package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.AccessShoesModuleQuestion;
import com.co.qvision.questions.LoginQuestion;
import com.co.qvision.tasks.AccessShoesModuleTask;
import com.co.qvision.tasks.LoginTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AccesShoesModuleStep {
    @Managed
    WebDriver hisBrowser;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^User wants to access to shoes module$")
    public void userWantsToAccessToShoesModule() {
        theActorCalled("user").attemptsTo(Open.url("https://www.bon-bonite.com/"));
    }

    @When("^User clicks on the shoes module$")
    public void userClicksOnTheShoesModule() {
        theActorCalled("user").attemptsTo(AccessShoesModuleTask.access());

    }

    @Then("^User accesses to shoes module (.+)$")
    public void userAccessesToShoesModuleSandalias(String validText) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AccessShoesModuleQuestion.accessValidTest(validText)));

    }
}
